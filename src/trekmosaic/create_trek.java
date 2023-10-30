/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trekmosaic;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
public class create_trek extends javax.swing.JFrame {

    
    public create_trek() {
        initComponents();
        nameField.setInputVerifier(new AlphabetInputVerifier());
        locationField.setInputVerifier(new AlphabetInputVerifier());
        ageField.setInputVerifier(new IntegerInputVerifier());
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcreate_trek = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblregister = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jtextuser_name = new javax.swing.JTextField();
        jbtregister = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        locationField = new javax.swing.JTextField();
        bgimagelabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, null));
        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcreate_trek.setText("fg");
        jPanel1.add(jcreate_trek, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 75, 314, 388));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 8, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblregister.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        lblregister.setForeground(new java.awt.Color(255, 255, 255));
        lblregister.setText("     Registeration");
        lblregister.setToolTipText("");
        jPanel2.add(lblregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 14, 163, 37));

        emailField.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        emailField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        jPanel2.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 271, 44));

        jtextuser_name.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jtextuser_name.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtextuser_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextuser_nameActionPerformed(evt);
            }
        });
        jPanel2.add(jtextuser_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 271, 43));

        jbtregister.setBackground(new java.awt.Color(153, 153, 153));
        jbtregister.setFont(new java.awt.Font("Sitka Subheading", 0, 18)); // NOI18N
        jbtregister.setForeground(new java.awt.Color(255, 255, 255));
        jbtregister.setText("register");
        jbtregister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtregisterActionPerformed(evt);
            }
        });
        jPanel2.add(jbtregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 124, 43));

        nameField.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        nameField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nameField.setDoubleBuffered(true);
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel2.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 273, 47));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name : ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 70, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email :\n");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, -1));
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 270, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Username :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password : ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Age :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 50, 30));

        ageField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ageField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });
        jPanel2.add(ageField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 80, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Location :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));
        jPanel2.add(locationField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 250, 40));

        bgimagelabel.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        bgimagelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/BGpict.jpg"))); // NOI18N
        jPanel2.add(bgimagelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -60, 1100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 390, 480));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/logigooo.jpeg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/BGpict.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1080, 740));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1080, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ageFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_nameFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void jbtregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtregisterActionPerformed
        // TODO add your handling code here:
        
       String enteredUsername = jtextuser_name.getText();
    String enteredPassword = jPasswordField1.getText();
    String enteredName = nameField.getText();
    String enteredEmail = emailField.getText();
    String enteredAge = ageField.getText();
    String enteredLocation = locationField.getText();

    if (enteredName.isEmpty() || enteredUsername.isEmpty() || enteredEmail.isEmpty() || enteredPassword.isEmpty() || enteredAge.isEmpty() || enteredLocation.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields are compulsory to be filled");
    } else {
        Connection con = DatabaseConnection.connect(); // Handle any exceptions related to database connection
        String loginQuery = "INSERT into user_login (username, password) VALUES (?, ?)";
        String dataQuery =  "INSERT into user_data (name, email, username, password, age, location) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement loginStatement = con.prepareStatement(loginQuery);
                PreparedStatement userStatement = con.prepareStatement(dataQuery)) {
            loginStatement.setString(1, enteredUsername);
            loginStatement.setString(2, enteredPassword);
            loginStatement.executeUpdate();
            
            userStatement.setString(1, enteredName);
            userStatement.setString(2, enteredEmail);
            userStatement.setString(3, enteredUsername);
            userStatement.setString(4, enteredPassword);
            userStatement.setString(5, enteredAge);
            userStatement.setString(6, enteredLocation);
            userStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Registration confirmed! email sent. Sign in to continue");
            sendMail(enteredEmail);
            create_trek.this.dispose();
            login Login = new login();
            Login.setLocationRelativeTo(null);
            Login.setVisible(true);
        } catch (SQLException ex) {
            System.out.print(ex);
        } finally {
            DatabaseConnection.disconnect();
        }
    }    
    }//GEN-LAST:event_jbtregisterActionPerformed
    
    public class AlphabetInputVerifier extends InputVerifier {
    @Override
    public boolean verify(JComponent input) {
        javax.swing.JTextField textField = (javax.swing.JTextField) input;
        String text = textField.getText();

        if (!text.matches("^[a-zA-Z]*$")) {
            JOptionPane.showMessageDialog(null, "Please enter alphabetic characters only.");
            textField.setText(""); // Clear the field
            return false;
        }

        return true;
    }
}
    public class IntegerInputVerifier extends InputVerifier {
    @Override
    public boolean verify(JComponent input) {
        javax.swing.JTextField textField = (javax.swing.JTextField) input;
        String text = textField.getText();

        if (!text.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Please enter an integer for age.");
            textField.setText(""); // Clear the field
            return false;
        }

        return true;
    }
}
    
    private void jtextuser_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextuser_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextuser_nameActionPerformed

    /**
     * @param args the command line arguments
     */
    void sendMail(String mail) {
        System.out.println("Attempting to send email...");
        String to = mail;
        String from = "trekmoasic@gmail.com";
        String host = "smtp.gmail.com";

        String password = "qhwp bggl mnjd jcsc";
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", 587);
        properties.put("mail.smtp.starttls.enable", "true");
        System.out.println("line1");
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });
        System.out.println("line2");
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("TrekMosaic account creation");
            message.setText("You have successfully created a account in trekmosaic, you can now JOIN our public treks and RENT OUR GEAR.");
            System.out.println("line3");
            // Send the message
            Transport.send(message);
          System.out.println("Email sent successfully to " + to);
        } catch (MessagingException ex) { // Print the full stack trace
            // Print the full stack trace
    System.out.println("Email sending failed: " + ex.getMessage());
    }
       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel bgimagelabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton jbtregister;
    private javax.swing.JLabel jcreate_trek;
    private javax.swing.JTextField jtextuser_name;
    private javax.swing.JLabel lblregister;
    private javax.swing.JTextField locationField;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables
}
