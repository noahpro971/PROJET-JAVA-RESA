
package hotel.cvven;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Hp
 */
public class RESA {
    
  
   Connecto  my_connecto = new Connecto();
    Chambres chambre = new Chambres();
     
    public boolean ajouterReservation(String reservant, int num_chambre, String dateDebut, String dateFin)
    {
        PreparedStatement st;
        String addQuery = "INSERT INTO `reservations`(`nom_reservant`, `num_chambre`, `date_debut`, `date_fin`) VALUES (?,?,?,?)";
        
        try {
            
            st = my_connecto.createConnection().prepareStatement(addQuery);
            
            st.setString(1, reservant);
            st.setInt(2, num_chambre);
            st.setString(3, dateDebut);
            st.setString(4, dateFin);
            
            if(chambre.isChambreReserved(num_chambre).equals("Non"))
            {
              if (st.executeUpdate() > 0)
                {
                    chambre.mettreChambreReserved(num_chambre, "oui");
                    return true;
                }
              else{
                    return false;
                  }    
            }else{
                JOptionPane.showMessageDialog(null, "Cette chambre est deja reservée", "Chambre réservée", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EVT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
   
    
    
    public boolean editReservation(int reservation_id, String nom_reservant, int num_chambre, String dateDebut, String dateFin)
    {
        PreparedStatement st;
        String editQuery = "UPDATE `reservations` SET `nom_reservant`=?,`num_chambre`=?,`date_debut`=?,`date_fin`=? WHERE `id`=?";
        
        try {
            
            st = my_connecto.createConnection().prepareStatement(editQuery);
            
            st.setString(1, nom_reservant);
            st.setInt(2, num_chambre);
            st.setString(3, dateDebut);
            st.setString(4, dateFin);
            st.setInt(5, reservation_id);
            
            return (st.executeUpdate() > 0);
             
           } 
           catch (SQLException ex) {
            Logger.getLogger(EVT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    
     
    public boolean supprimerReservation(int reservation_id)
    {
        PreparedStatement st;
        String deleteQuery = "DELETE FROM `reservations` WHERE `id`=?";
        
        try {
            
            st = my_connecto.createConnection().prepareStatement(deleteQuery);

            st.setInt(1, reservation_id);
            
            
            int num_chambre = getNumeroChambreResa(reservation_id);
            
            if (st.executeUpdate() > 0)
            {
                chambre.mettreChambreReserved(num_chambre, "Non");
                return true;
                
            }else{
                
                return false;
            }
             
           } 
           catch (SQLException ex) {
            Logger.getLogger(EVT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
     
    public void fillReservationsJTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT FROM `reservations`(`nom_reservant`, `num_chambre`, `date_debut`, `date_fin`)";
        
        try {
            
            ps = my_connecto.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
               row = new Object[5];
               row[0] = rs.getString(2);
               row[1] = rs.getInt(3);
               row[2] = rs.getString(4);
               row[3] = rs.getString(5);
              
               
               tableModel.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EVT.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
   
    
    
    public int getNumeroChambreResa(int reservationID)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT `num_chambre` FROM `reservations` WHERE `id` = ?";
        
        try {
            
            ps = my_connecto.createConnection().prepareStatement(selectQuery);
            
            ps.setInt(1, reservationID);
            
            rs = ps.executeQuery();
            
            if(rs.next()) 
            {
                return rs.getInt(1);
            }
            else{
                return 0;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EVT.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } 
    }

   
   
   
    
}
    




