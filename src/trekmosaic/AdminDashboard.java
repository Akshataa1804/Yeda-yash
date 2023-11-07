/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package trekmosaic;

public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
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
        addGearButton = new javax.swing.JButton();
        profileVerification = new javax.swing.JButton();
        signOut = new javax.swing.JButton();
        userDetails = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(null);

        addGearButton.setBackground(new java.awt.Color(204, 204, 204));
        addGearButton.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        addGearButton.setText("CREATE A GEAR");
        addGearButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addGearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGearButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addGearButton);
        addGearButton.setBounds(790, 430, 200, 50);

        profileVerification.setBackground(new java.awt.Color(204, 204, 204));
        profileVerification.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        profileVerification.setText("PROFILE VERIFICATION ");
        profileVerification.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        profileVerification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileVerificationActionPerformed(evt);
            }
        });
        jPanel1.add(profileVerification);
        profileVerification.setBounds(90, 430, 240, 50);

        signOut.setBackground(new java.awt.Color(204, 204, 204));
        signOut.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        signOut.setText("SIGN OUT");
        signOut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });
        jPanel1.add(signOut);
        signOut.setBounds(930, 20, 140, 50);

        userDetails.setBackground(new java.awt.Color(204, 204, 204));
        userDetails.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        userDetails.setText("USER DETAILS");
        userDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(userDetails);
        userDetails.setBounds(460, 430, 200, 50);

        jLabel2.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADMIN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 10, 380, 100);

        jLabel3.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DASHBOARD");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 110, 380, 100);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/bgmtresizeddddd.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(255, 255, 255), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        jLabel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jLabel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jLabel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1080, 730);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1080, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileVerificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileVerificationActionPerformed
        // TODO add your handling code here:
        AdminDashboard.this.dispose();
        AdminVerification ad = new AdminVerification();
        ad.setLocationRelativeTo(null);
        ad.setVisible(true);
        AdminDashboard.this.dispose();
    }//GEN-LAST:event_profileVerificationActionPerformed

    private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
        // TODO add your handling code here:
        AdminDashboard.this.dispose();;
        AdminloginPage ad = new AdminloginPage();
        ad.setLocationRelativeTo(null);
        ad.setVisible(true);
    }//GEN-LAST:event_signOutActionPerformed

    private void userDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDetailsActionPerformed
        // TODO add your handling code here:
        AdminDashboard.this.dispose();
        AdminUserDetails au = new AdminUserDetails();
        au.setLocationRelativeTo(null);
        au.setVisible(true);
    }//GEN-LAST:event_userDetailsActionPerformed

    private void addGearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGearButtonActionPerformed
        // TODO add your handling code here:
        AdminDashboard.this.dispose();
        addGear g = new addGear();
        g.setLocationRelativeTo(null);
        g.setVisible(true);
    }//GEN-LAST:event_addGearButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGearButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton profileVerification;
    private javax.swing.JButton signOut;
    private javax.swing.JButton userDetails;
    // End of variables declaration//GEN-END:variables
}
