/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trekmosaic;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class dashboard_v2 extends javax.swing.JFrame {

    /**
     * Creates new form dashboard_v2
     */
    public dashboard_v2() {
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

        loginpopup = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backb = new javax.swing.JButton();
        loginb1 = new javax.swing.JButton();
        bglabel = new javax.swing.JLabel();
        db_treklabel2 = new javax.swing.JLabel();
        treklabel1 = new javax.swing.JLabel();
        db_plannerlabel2 = new javax.swing.JLabel();
        create_trek_button = new javax.swing.JButton();
        my_profile_button = new javax.swing.JButton();
        signOutbutton = new javax.swing.JButton();
        join_trek_button1 = new javax.swing.JButton();
        info_trek_button = new javax.swing.JButton();
        about_us = new javax.swing.JButton();
        gearButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        db_bgimage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        loginpopup.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        loginpopup.setAlwaysOnTop(true);
        loginpopup.setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN TO JOIN TREK ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 220, 40));

        backb.setBackground(new java.awt.Color(204, 204, 204));
        backb.setText("BACK");
        backb.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        backb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbActionPerformed(evt);
            }
        });
        jPanel1.add(backb, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 70, 30));

        loginb1.setBackground(new java.awt.Color(204, 204, 204));
        loginb1.setText("LOGIN ");
        loginb1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        loginb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginb1ActionPerformed(evt);
            }
        });
        jPanel1.add(loginb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 70, 30));

        bglabel.setMaximumSize(new java.awt.Dimension(350, 350));
        bglabel.setMinimumSize(new java.awt.Dimension(350, 350));
        bglabel.setPreferredSize(new java.awt.Dimension(350, 300));
        jPanel1.add(bglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        loginpopup.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dashboard");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(50, 50));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setName("dashboard"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        db_treklabel2.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        db_treklabel2.setForeground(new java.awt.Color(255, 255, 255));
        db_treklabel2.setText("DASHBOARD");
        getContentPane().add(db_treklabel2);
        db_treklabel2.setBounds(10, 0, 160, 70);

        treklabel1.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 48)); // NOI18N
        treklabel1.setText("TREK");
        treklabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(treklabel1);
        treklabel1.setBounds(10, 60, 140, 70);

        db_plannerlabel2.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 48)); // NOI18N
        db_plannerlabel2.setText("MOSSAIC");
        getContentPane().add(db_plannerlabel2);
        db_plannerlabel2.setBounds(10, 90, 200, 90);

        create_trek_button.setBackground(new java.awt.Color(204, 204, 204));
        create_trek_button.setFont(new java.awt.Font("Swis721 Cn BT", 1, 24)); // NOI18N
        create_trek_button.setForeground(new java.awt.Color(51, 51, 51));
        create_trek_button.setText("CREATE TREK");
        create_trek_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        create_trek_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_trek_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(create_trek_button);
        create_trek_button.setBounds(240, 350, 200, 40);

        my_profile_button.setBackground(new java.awt.Color(204, 204, 204));
        my_profile_button.setFont(new java.awt.Font("Swis721 Cn BT", 1, 24)); // NOI18N
        my_profile_button.setForeground(new java.awt.Color(51, 51, 51));
        my_profile_button.setText("MY PROFILE ");
        my_profile_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        my_profile_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                my_profile_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(my_profile_button);
        my_profile_button.setBounds(150, 570, 140, 40);

        signOutbutton.setBackground(new java.awt.Color(204, 204, 204));
        signOutbutton.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        signOutbutton.setText("SIGN OUT");
        signOutbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        signOutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(signOutbutton);
        signOutbutton.setBounds(890, 60, 170, 36);

        join_trek_button1.setBackground(new java.awt.Color(204, 204, 204));
        join_trek_button1.setFont(new java.awt.Font("Swis721 Cn BT", 1, 24)); // NOI18N
        join_trek_button1.setForeground(new java.awt.Color(51, 51, 51));
        join_trek_button1.setText("JOIN A TREK");
        join_trek_button1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        join_trek_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                join_trek_button1ActionPerformed(evt);
            }
        });
        getContentPane().add(join_trek_button1);
        join_trek_button1.setBounds(630, 350, 210, 40);

        info_trek_button.setBackground(new java.awt.Color(204, 204, 204));
        info_trek_button.setFont(new java.awt.Font("Swis721 Cn BT", 1, 24)); // NOI18N
        info_trek_button.setForeground(new java.awt.Color(51, 51, 51));
        info_trek_button.setText("INFO");
        info_trek_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        info_trek_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info_trek_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(info_trek_button);
        info_trek_button.setBounds(820, 570, 110, 40);

        about_us.setBackground(new java.awt.Color(204, 204, 204));
        about_us.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        about_us.setText("About Us");
        about_us.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        about_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_usActionPerformed(evt);
            }
        });
        getContentPane().add(about_us);
        about_us.setBounds(960, 110, 100, 30);

        gearButton.setBackground(new java.awt.Color(204, 204, 204));
        gearButton.setFont(new java.awt.Font("Swis721 Cn BT", 1, 24)); // NOI18N
        gearButton.setText("RENT GEAR");
        gearButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        gearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(gearButton);
        gearButton.setBounds(480, 570, 120, 40);

        loginButton.setBackground(new java.awt.Color(204, 204, 204));
        loginButton.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        loginButton.setText("SIGN IN ");
        loginButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton);
        loginButton.setBounds(890, 10, 170, 40);

        db_bgimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Untitleddesign.png"))); // NOI18N
        getContentPane().add(db_bgimage);
        db_bgimage.setBounds(0, -50, 1080, 730);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1080, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void info_trek_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info_trek_buttonActionPerformed
        // TODO add your handling code here:
        dashboard_v2.this.dispose();
        aboutTrek info = new aboutTrek();
        info.setLocationRelativeTo(null);
        info.setVisible(true);
    }//GEN-LAST:event_info_trek_buttonActionPerformed

    private void create_trek_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_trek_buttonActionPerformed
      int verify =   UserData.checkverify(UserIndoData.getName());
        if(UserData.check == 1 && verify == 1){
             
        dashboard_v2.this.dispose();
        createtrek createTrek = new createtrek();
        createTrek.setLocationRelativeTo(null);
        createTrek.setVisible(true);
        }
        else 
        {
            if(UserData.check == 0)
            {
                JOptionPane.showMessageDialog(this, "Register or Sign to Continue.");
            }
            else if(verify == 0)
                    {
                JOptionPane.showMessageDialog(this, "Vetify your profile to create trek");
                    }
        }
    }//GEN-LAST:event_create_trek_buttonActionPerformed

    private void my_profile_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_my_profile_buttonActionPerformed
        // TODO add your handling code here:
       if(UserData.check == 1){
        dashboard_v2.this.dispose();
        
        profile create_profile = new profile();
        
          
       String TrekName = UserIndoData.getTrekName();
       if(TrekName != null){
           create_profile.setTable(TrekName);
       }
        
        String name = UserIndoData.getName();
        String location = UserIndoData.getLocation();
        int age = UserIndoData.getAge();
              
        
        create_profile.setName(name);
        create_profile.setLocation(location);
        create_profile.setAge(age);
        
       
        create_profile.setLocationRelativeTo(null);
        create_profile.setVisible(true);
       } else {
           JOptionPane.showMessageDialog(this, "Sign in to continue. ");
       }
    }//GEN-LAST:event_my_profile_buttonActionPerformed

    private void join_trek_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_join_trek_button1ActionPerformed
        // TODO add your handling code here:
        if(UserData.check == 1){
        dashboard_v2.this.dispose();
        joinatrek joinTrek  = new joinatrek();
        joinTrek.setLocationRelativeTo(null);
     
        joinTrek.setVisible(true);
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Register or Sign to continue.");
        }
    }//GEN-LAST:event_join_trek_button1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void about_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_usActionPerformed
        // TODO add your handling code here:
        dashboard_v2.this.dispose();
        aboutus ab = new aboutus();
        ab.setLocationRelativeTo(null);
        ab.setVisible(true);
        
    }//GEN-LAST:event_about_usActionPerformed

    private void backbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backbActionPerformed

    private void loginb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginb1ActionPerformed

    private void gearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gearButtonActionPerformed
        // TODO add your handling code here:
        if(UserData.check == 1){
        dashboard_v2.this.dispose();
        gearpage2 gear = new gearpage2();
        gear.setLocationRelativeTo(null);
        gear.setVisible(true);
      }
        else 
        {
            JOptionPane.showMessageDialog(this, "Register or sign in to continue.");
        }
    }//GEN-LAST:event_gearButtonActionPerformed
    
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        dashboard_v2.this.dispose();
        login signIn = new login();
        signIn.setLocationRelativeTo(null);
        signIn.setVisible(true);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void signOutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutbuttonActionPerformed
        // TODO add your handling code here:
        UserData.check = 0;
        UserData.check = 0;
        dashboard_v2.this.dispose();
        AdminloginPage ad = new AdminloginPage();
        ad.setLocationRelativeTo(null);
        ad.setVisible(true);
    }//GEN-LAST:event_signOutbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about_us;
    private javax.swing.JButton backb;
    private javax.swing.JLabel bglabel;
    private javax.swing.JButton create_trek_button;
    private javax.swing.JLabel db_bgimage;
    private javax.swing.JLabel db_plannerlabel2;
    private javax.swing.JLabel db_treklabel2;
    private javax.swing.JButton gearButton;
    private javax.swing.JButton info_trek_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton join_trek_button1;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton loginb1;
    private javax.swing.JDialog loginpopup;
    private javax.swing.JButton my_profile_button;
    private javax.swing.JButton signOutbutton;
    private javax.swing.JLabel treklabel1;
    // End of variables declaration//GEN-END:variables
}
