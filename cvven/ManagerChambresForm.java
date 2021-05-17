
package hotel.cvven;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class ManagerChambresForm extends javax.swing.JFrame {

    Chambres chambres = new Chambres();
    
   

    public ManagerChambresForm() {
        initComponents();
        
        
        chambres.remplirChambres_TYPE_JCombobox(jComboBoxType);
      
        chambres.remplirChambreTable(jTableChambres);
        
       
        jTableChambres.setRowHeight(40);
        
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonOUI);
        bg.add(jRadioButtonNON);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        AjouterChambre = new javax.swing.JButton();
        ModifierLesChambres = new javax.swing.JButton();
        supprimerClient = new javax.swing.JButton();
        viderChampsChambres = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableChambres = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButtonOUI = new javax.swing.JRadioButton();
        jRadioButtonNON = new javax.swing.JRadioButton();
        jButton1ShowRoomTypes = new javax.swing.JButton();
        jComboBoxType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gérer les chambres");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(392, 392, 392)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Numero de tel:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        AjouterChambre.setText("Ajouter une chambre");
        AjouterChambre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterChambreActionPerformed(evt);
            }
        });

        ModifierLesChambres.setText("Modifier chambres");
        ModifierLesChambres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierLesChambresActionPerformed(evt);
            }
        });

        supprimerClient.setText("SupprimerChambres");
        supprimerClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerClientActionPerformed(evt);
            }
        });

        viderChampsChambres.setText("Vider les champs");
        viderChampsChambres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viderChampsChambresActionPerformed(evt);
            }
        });

        jTableChambres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableChambres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Type", "Phone", "Reserved"
            }
        )
        // make the jtable cells not editable
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jTableChambres.setGridColor(new java.awt.Color(255, 255, 0));
    jTableChambres.setSelectionBackground(new java.awt.Color(0, 204, 0));
    jTableChambres.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTableChambresMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTableChambres);

    jButton5.setText("Rafraichir");
    jButton5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton5ActionPerformed(evt);
        }
    });

    jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("Reservée:");

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));
    jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

    jRadioButtonOUI.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jRadioButtonOUI.setForeground(new java.awt.Color(153, 0, 153));
    jRadioButtonOUI.setText("OUI");

    jRadioButtonNON.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jRadioButtonNON.setForeground(new java.awt.Color(153, 0, 153));
    jRadioButtonNON.setText("NON");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jRadioButtonOUI)
            .addGap(29, 29, 29)
            .addComponent(jRadioButtonNON)
            .addContainerGap(31, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jRadioButtonOUI)
                .addComponent(jRadioButtonNON))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jButton1ShowRoomTypes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButton1ShowRoomTypes.setText("Types");
    jButton1ShowRoomTypes.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ShowRoomTypesActionPerformed(evt);
        }
    });

    jComboBoxType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1ShowRoomTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(AjouterChambre))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ModifierLesChambres)
                                        .addGap(18, 18, 18)
                                        .addComponent(supprimerClient)
                                        .addGap(0, 96, Short.MAX_VALUE))
                                    .addComponent(jTextField3))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 23, Short.MAX_VALUE)
                            .addComponent(viderChampsChambres, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(116, 116, 116)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(373, 373, 373))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1ShowRoomTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel6)))
                    .addGap(53, 53, 53)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AjouterChambre)
                        .addComponent(ModifierLesChambres)
                        .addComponent(supprimerClient))
                    .addGap(30, 30, 30)
                    .addComponent(viderChampsChambres))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(16, 16, 16)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
            .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void AjouterChambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterChambreActionPerformed
      try{
               
               int chambres1 = Integer.valueOf(jTextField1.getText());
               int chambresType = Integer.valueOf(jComboBoxType.getSelectedItem().toString());
               String tel = jTextField3.getText();
               
               if(chambres.ajouterChambres(chambres1, chambresType, tel))
               {
                   JOptionPane.showMessageDialog(rootPane, "La chambre a bien été ajoutée", "Chambre ajoutée", JOptionPane.INFORMATION_MESSAGE);
               }
               else
               {
                   JOptionPane.showMessageDialog(rootPane, "La chambre a bien été ajouté", "Erreur lors de l'ajout de la chambre", JOptionPane.ERROR_MESSAGE);
               }
               
           } 
           catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + "Entrez le numero de la chambres", "Erreur lors de l'ajout de la chambre", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_AjouterChambreActionPerformed

    private void ModifierLesChambresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierLesChambresActionPerformed
        int numeroChambre = 0;
        int type = Integer.valueOf(jComboBoxType.getSelectedItem().toString());
        String tel = jTextField3.getText();
        String isReserved = "Non";
        
        if(jRadioButtonOUI.isSelected())
        {
            isReserved = "Oui";
        }
        
        if(tel.trim().equals(""))
        {
             JOptionPane.showMessageDialog(rootPane, "Entrez le numero de la chambre", "Champs vides", JOptionPane.WARNING_MESSAGE);
        }
        else{
            
            try{
                numeroChambre = Integer.valueOf(jTextField1.getText());
                
                if(chambres.editChambre(numeroChambre, type, tel, isReserved))
                 {
                      JOptionPane.showMessageDialog(rootPane, "Les informations de la chambres ont bien été modifiées", "Modifier la chambre", JOptionPane.INFORMATION_MESSAGE);
                 }
            
             else{
            
                 JOptionPane.showMessageDialog(rootPane, "Les informations de la chambres n'ont pas été mises à jour", "Erreur modification de la chambre", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + "Entrez le numero de la chambre", "Erreur chambre 1", JOptionPane.ERROR_MESSAGE);
            }
            
            }
    }//GEN-LAST:event_ModifierLesChambresActionPerformed

    private void supprimerClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerClientActionPerformed
       try{
                int roomNumber = Integer.valueOf(jTextField1.getText());
                
                if(chambres.supprimerChambre(roomNumber))
                 {
                      JOptionPane.showMessageDialog(rootPane, "La chambre a bien été supprimer", "Chambre supprimée", JOptionPane.INFORMATION_MESSAGE);
                 }
            
             else{
            
                 JOptionPane.showMessageDialog(rootPane, "Chambre non supprimée", "Erreur lors de la suppression de la chambre", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Entrez le numero de la chambre", "Erreur avec le numero de la chambre", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_supprimerClientActionPerformed

    private void viderChampsChambresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viderChampsChambresActionPerformed
        jTextField1.setText("");
        jTextField3.setText("");
        jComboBoxType.setSelectedIndex(0);
        jRadioButtonNON.setSelected(true);
    
    }//GEN-LAST:event_viderChampsChambresActionPerformed

    private void jTableChambresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableChambresMouseClicked
         DefaultTableModel model = (DefaultTableModel)jTableChambres.getModel();
            
            // get the selected row index
            int rIndex = jTableChambres.getSelectedRow();
            
            // display data
            jTextField1.setText(model.getValueAt(rIndex, 0).toString());
            jComboBoxType.setSelectedItem(model.getValueAt(rIndex, 1));
            jTextField3.setText(model.getValueAt(rIndex, 2).toString());
            
            String isReeserved = model.getValueAt(rIndex, 3).toString();
            
            if(isReeserved.equals("Oui"))
            {
                jRadioButtonOUI.setSelected(true);
            }
            else if(isReeserved.equals("Non"))
            {
                jRadioButtonNON.setSelected(true);
            }

    }//GEN-LAST:event_jTableChambresMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTableChambres.setModel(new DefaultTableModel(null, new Object[]{"Numero","Type","tel","ReservedOuNon"}));

        // populate the jtable
        chambres.remplirChambreTable(jTableChambres);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ShowRoomTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ShowRoomTypesActionPerformed

        TYPECHAMBRE formTypeChambre = new TYPECHAMBRE();
        formTypeChambre.setVisible(true);
        formTypeChambre.pack();
        formTypeChambre.setLocationRelativeTo(null);
        formTypeChambre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButton1ShowRoomTypesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagerChambresForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerChambresForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerChambresForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerChambresForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerChambresForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjouterChambre;
    private javax.swing.JButton ModifierLesChambres;
    private javax.swing.JButton jButton1ShowRoomTypes;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonNON;
    private javax.swing.JRadioButton jRadioButtonOUI;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableChambres;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton supprimerClient;
    private javax.swing.JButton viderChampsChambres;
    // End of variables declaration//GEN-END:variables
}