/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trekmosaic;
import java.sql.*;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class AdminVerification extends javax.swing.JFrame {

    /**
     * Creates new form AdminVerification
     */
    public AdminVerification() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        PopupButton = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(720, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMIN VERIFICATION PAGE ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 54));

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setLabelFor(jTable1);
        jLabel2.setText("PENDING VERIFICATION ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 360, 34));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name of user"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 531, 141));

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setLabelFor(jTable1);
        jLabel3.setText("VERIFIED USERS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name of user"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 540, 132));

        PopupButton.setBackground(new java.awt.Color(204, 204, 204));
        PopupButton.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        PopupButton.setText("CHOOSE WHAT TO DO ");
        PopupButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PopupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PopupButtonActionPerformed(evt);
            }
        });
        jPanel1.add(PopupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 190, 30));

        refresh.setBackground(new java.awt.Color(204, 204, 204));
        refresh.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        refresh.setText("REFRESH");
        refresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 620, 160, 50));

        backButton.setBackground(new java.awt.Color(204, 204, 204));
        backButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 620, 114, 50));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Accept or Deny request here :");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 190, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/BGpict.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PopupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PopupButtonActionPerformed
        if(isEmpty == false){
            JOptionPane.showMessageDialog(this, "No data inside table");
        }
        else
        {
        getValueFromtable(name);
        
        verificationpopup v = new verificationpopup();
        v.setName(name);
        v.setAge(age);
        v.setLocation(location);
        
        
        v.setLocationRelativeTo(null);
        v.setVisible(true);
        }
    }//GEN-LAST:event_PopupButtonActionPerformed
    private void getVerifiedUsers() {
        try {
            Connection con = DatabaseConnection.connect();
            DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
            model2.setRowCount(0);

            String Verifyquery = "SELECT name FROM user_data WHERE verification_status = 'Approved' AND verification_status IS NOT NULL";
            PreparedStatement stm2 = con.prepareStatement(Verifyquery);
            ResultSet result2 = stm2.executeQuery();
            while (result2.next()) {
                vName = result2.getString("name");
                Object rowdata[] = {vName};
                model2.addRow(rowdata);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminVerification.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getVerificationStatus() {
        try {
            Connection con = DatabaseConnection.connect();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            String query = "SELECT name FROM user_data WHERE verification_status = 'Pending verification' AND verification_status IS NOT NULL";
            PreparedStatement stm = con.prepareStatement(query);
            ResultSet result = stm.executeQuery();
            while (result.next()) {
                name = result.getString("name");
                Object rowdata[] = {name};
                model.addRow(rowdata);
            }
        } catch (SQLException ex) {
            
        }
    }

    void getValueFromtable(String name) {

        Object value = jTable1.getValueAt(0, 0);
        if (value != null) {
            nameOfUser = value.toString();
            isEmpty = true;
        } else {
            JOptionPane.showMessageDialog(this, "Table is empty");
            
        }
        
        if(nameOfUser != null){
            try {
                Connection con = DatabaseConnection.connect();
                String Dataquery = "SELECT age, location FROM user_data WHERE name = ?";
                PreparedStatement stm2 = con.prepareStatement(Dataquery);
                stm2.setString(1, name);
                ResultSet result = stm2.executeQuery();
                
                if(result.next()){
                    location = result.getString("location");
                    age = result.getInt("age");
                }
                
            } catch (SQLException ex) {
                
            }
            
        }
    }
    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed

        getVerificationStatus();
        getVerifiedUsers();

    }//GEN-LAST:event_refreshActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        AdminVerification.this.dispose();;
        AdminDashboard ad  = new AdminDashboard();
        ad.setLocationRelativeTo(null);
        ad.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminVerification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PopupButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
    String name;
    String location;
    int  age;
    String nameOfUser;
    boolean isEmpty = true;
    String vName;
}
