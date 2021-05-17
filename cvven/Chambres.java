/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.cvven;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 */
public class Chambres {
    
    Connecto my_connecto = new Connecto();
    
    public void remplirChambres_TYPE_JTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `type`";
        
        try {
            
            ps = my_connecto.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
               row = new Object[3];
               row[0] = rs.getInt(1);
               row[1] = rs.getString(2);
               row[2] = rs.getString(3);
               
               tableModel.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EVT.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
public void remplirChambreTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `chambres`";
        
        try {
            
            ps = my_connecto.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
               row = new Object[4];
               row[0] = rs.getInt(1);
               row[1] = rs.getInt(2);
               row[2] = rs.getString(3);
               row[3] = rs.getString(4);
               
               tableModel.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EVT.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

public void remplirChambres_TYPE_JCombobox(JComboBox combobox)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `type`";
        
        try {
            
            ps = my_connecto.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            while(rs.next())
            {  
               combobox.addItem(rs.getInt(1));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EVT.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

public boolean ajouterChambres(int num_chambre, int type, String tel)
    {
        PreparedStatement st;
        String addQuery = "INSERT INTO `chambres`(`num_chambre`, `type`, `tel`, `reserved`) VALUES (?,?,?,?)";
        
        try {
            
            st = my_connecto.createConnection().prepareStatement(addQuery);
            
            st.setInt(1, num_chambre);
            st.setInt(2, type);
            st.setString(3, tel);
            
            st.setString(4, "Non");
            
            return (st.executeUpdate() > 0);
           
            
        } catch (SQLException ex) {
            Logger.getLogger(EVT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
public boolean editChambre(int num_chambre,int type, String tel, String isReserved)
    {
        PreparedStatement st;
        String editQuery = "UPDATE `chambres` SET `type`=?,`tel`=?,`reserved`=? WHERE `num_chambre`=?";
        
        try {
            
            st = my_connecto.createConnection().prepareStatement(editQuery);
            
            st.setInt(1, type);
            st.setString(2, tel);
            st.setString(3, isReserved);
            st.setInt(4, num_chambre);
            
            return (st.executeUpdate() > 0);
             
           } 
           catch (SQLException ex) {
            Logger.getLogger(EVT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
   public boolean supprimerChambre(int roomnum_chambre)
    {
        PreparedStatement st;
        String deleteQuery = "DELETE FROM `chambres` WHERE `num_chambre`=?";
        
        try {
            
            st = my_connecto.createConnection().prepareStatement(deleteQuery);

            st.setInt(1, roomnum_chambre);
            
            return (st.executeUpdate() > 0);
             
           } 
           catch (SQLException ex) {
            Logger.getLogger(EVT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
   public boolean mettreChambreReserved(int num_chambre, String isReserved)
    {
        PreparedStatement st;
        String editQuery = "UPDATE `chambres` SET `reserved`=? WHERE `num_chambre`=?";
        
        try {
            
            st = my_connecto.createConnection().prepareStatement(editQuery);
            
            st.setString(1, isReserved);
            st.setInt(2, num_chambre);
            
            return (st.executeUpdate() > 0);
             
           } 
           catch (SQLException ex) {
            Logger.getLogger(EVT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public String isChambreReserved(int num_chambre)
    {
        PreparedStatement st;
        ResultSet rs;
        String editQuery = "SELECT `reserved` FROM `chambres` WHERE `num_chambre`=?";
        
        try {
            
            st = my_connecto.createConnection().prepareStatement(editQuery);
            
            st.setInt(1, num_chambre);
            
            rs = st.executeQuery();
            
            if(rs.next())
            {
                return rs.getString(1);
            }
            
            else{
                return "";
            }
             
           } 
           catch (SQLException ex) {
            Logger.getLogger(EVT.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }

    
}
