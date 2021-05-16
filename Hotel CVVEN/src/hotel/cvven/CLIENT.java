 
package hotel.cvven;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Hp
 */
public class CLIENT {
    
    Connecto my_connecto = new Connecto();
    
    public boolean ajouterClient(String prenom, String nom, String tel, String email) {
        
        PreparedStatement st;
        ResultSet rs;
        
        String addQuery = "INSERT INTO `clients`(`prenom`, `nom`, `tel`, `email`) VALUES (?,?,?,?)";
        
        try {
            st = my_connecto.createConnection().prepareStatement(addQuery);
            st.setString(1, prenom);
            st.setString(2, nom);
            st.setString(3, tel);
            st.setString(4, email);
            
            return (st.executeUpdate() > 0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public boolean editClient(int id, String prenom, String nom, String tel, String email) {
         PreparedStatement st;
        String editQuery = "UPDATE `clients` SET `prenom`=?,`nom`=?,`tel`=?,`email`=? WHERE `id`=?";
        
        try {
            
            st = my_connecto.createConnection().prepareStatement(editQuery);
            
            st.setString(1, prenom);
            st.setString(2, nom);
            st.setString(3, tel);
            st.setString(4, email);
            st.setInt(5, id);
            
            return (st.executeUpdate() > 0);
             
           } 
           catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean supprimerClient(int id)
    {
        PreparedStatement st;
        String deleteQuery = "DELETE FROM `clients` WHERE `id`=?";
        
        try {
            
            st = my_connecto.createConnection().prepareStatement(deleteQuery);

            st.setInt(1, id);
            
            return (st.executeUpdate() > 0);
             
           } 
           catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public void remplirTableClient(JTable table) {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `clients`";
        
        try {
             ps = my_connecto.createConnection().prepareStatement(selectQuery);
             
             rs = ps.executeQuery();
             
             DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
             
             Object[] row;
             
             while(rs.next()){
                 row = new Object[5];
                 row[0] = rs.getInt(1);
                 row[1] = rs.getString(2);
                 row[2] = rs.getString(3);
                 row[3] = rs.getString(4);
                 row[4] = rs.getString(5);
                 
                 
                 tableModel.addRow(row);
                 
             }
        }catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    }
}


