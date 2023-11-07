/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author main
 */
package trekmosaic;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import trekmosaic.profile;
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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
        lbllogin = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        loginUsernameField = new javax.swing.JTextField();
        loginPasswordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(null);

        lbllogin.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbllogin.setForeground(new java.awt.Color(255, 255, 255));
        lbllogin.setText("       Login");
        jPanel1.add(lbllogin);
        lbllogin.setBounds(480, 70, 160, 41);

        lblusername.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblusername.setForeground(new java.awt.Color(255, 255, 255));
        lblusername.setText("Username :");
        jPanel1.add(lblusername);
        lblusername.setBounds(440, 130, 109, 41);

        lblpassword.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(255, 255, 255));
        lblpassword.setText("Password :");
        jPanel1.add(lblpassword);
        lblpassword.setBounds(440, 200, 109, 41);
        jPanel1.add(loginUsernameField);
        loginUsernameField.setBounds(560, 130, 150, 41);

        loginPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(loginPasswordField);
        loginPasswordField.setBounds(560, 190, 150, 40);

        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginButton.setText("Sign in");
        loginButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton);
        loginButton.setBounds(490, 270, 150, 40);

        registerButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerButton.setText("Create an account");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(registerButton);
        registerButton.setBounds(490, 320, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/BGpict.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(420, 60, 350, 350);

        jLabel3.setBackground(new java.awt.Color(51, 51, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/logigooo.jpeg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 110, 340, 280);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton3.setText("HOME");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(740, 510, 100, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/BGpict.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 0, 1080, 720);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        login.this.dispose();
        dashboard_v2 db = new dashboard_v2();
        db.setLocationRelativeTo(null);
        db.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
        
        String enteredUsername = loginUsernameField.getText();
        String enteredPassword = loginPasswordField.getText();
        
        if(enteredUsername == null || enteredPassword == null){
            JOptionPane.showMessageDialog(this, "kindly fill all the fields");
        }
        else
        {
        try {
        Connection con = DatabaseConnection.connect();
         
        
        String query = "SELECT * FROM user_login WHERE username=?";
        String dataquery = "SELECT * from user_data WHERE username = ?";
        try (PreparedStatement statement = con.prepareStatement(query);
             PreparedStatement Userstatement = con.prepareStatement(dataquery)) {
            statement.setString(1, enteredUsername);
            Userstatement.setString(1, enteredUsername);
           
            ResultSet result = statement.executeQuery();
            ResultSet result2 = Userstatement.executeQuery();
            
            if(result2.next()){
                username = result2.getString("username");
                name = result2.getString("name");
                location = result2.getString("location");
                age = result2.getInt("age");
                email = result2.getString("email");
                
                
                
                        
            }
            
            if (result.next()) {
               
                String storedPassword = result.getString("password");

             
                if (enteredPassword.equals(storedPassword)) {
                    
                    UserData.check = 1;
                    UserIndoData.setName(name);
                    UserIndoData.setLocation(location);
                    UserIndoData.setAge(age);
                    UserIndoData.setEmail(email);
                    
                    JOptionPane.showMessageDialog(this, "Login Successful");
                    //profile p = new profile();
                    //p.setName(name);
                    
                    //p.setLocationRelativeTo(null);
                    //p.setVisible(true);
                } else {
                  
                    JOptionPane.showMessageDialog(this, "Invalid password");
                }
            } else {
              
                JOptionPane.showMessageDialog(this, "Invalid username");
            }
        }
    } catch (SQLException ex) {} finally {
        DatabaseConnection.disconnect();
    }
        }
    }//GEN-LAST:event_loginButtonActionPerformed
    public String getName(){
        return name;
    }
    
    
    
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        login.this.dispose();
        create_trek register = new create_trek();
        register.setLocationRelativeTo(null);
        register.setVisible(true);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void loginPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPasswordFieldActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField loginPasswordField;
    private javax.swing.JTextField loginUsernameField;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
    private String name;
    private String location;
    private int age;
    private String email;
    private String username;
}
