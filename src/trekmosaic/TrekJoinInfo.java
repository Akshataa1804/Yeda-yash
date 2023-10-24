/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trekmosaic;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import trekmosaic.joinatrek;
public class TrekJoinInfo extends javax.swing.JFrame {

    /**
     * Creates new form TrekJoinInfo
     */
    public TrekJoinInfo() {
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
        jPanel2 = new javax.swing.JPanel();
        imagepanel = new javax.swing.JPanel();
        trekNameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itinenaryText = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        itinaryLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        inclusionLabel = new javax.swing.JLabel();
        transportationLabel = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        InclusionText = new javax.swing.JTextArea();
        PriceLabel = new javax.swing.JLabel();
        joinButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(102, 255, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 117, 0);

        imagepanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        imagepanel.setMaximumSize(new java.awt.Dimension(180, 150));
        imagepanel.setMinimumSize(new java.awt.Dimension(180, 150));
        imagepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(imagepanel);
        imagepanel.setBounds(60, 10, 180, 160);

        trekNameLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        trekNameLabel.setText("Trek Name");
        jPanel1.add(trekNameLabel);
        trekNameLabel.setBounds(320, 10, 270, 44);

        itinenaryText.setColumns(20);
        itinenaryText.setLineWrap(true);
        itinenaryText.setRows(5);
        itinenaryText.setWrapStyleWord(true);
        jScrollPane1.setViewportView(itinenaryText);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 340, 290, 340);

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("DATES AVAILABLE");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(697, 6, 190, 26);

        jList1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "24th Thursday", "25th Friday", "30th Saturday" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(697, 38, 156, 23);

        itinaryLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        itinaryLabel.setText("Itinerary :");
        itinaryLabel.setToolTipText("");
        jPanel1.add(itinaryLabel);
        itinaryLabel.setBounds(40, 310, 107, 20);

        locationLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        locationLabel.setText("LOCATION : ");
        jPanel1.add(locationLabel);
        locationLabel.setBounds(329, 72, 274, 35);

        heightLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        heightLabel.setText("HEIGHT (in ft) :");
        jPanel1.add(heightLabel);
        heightLabel.setBounds(40, 200, 252, 35);

        inclusionLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        inclusionLabel.setText("INCLUSIONS :");
        jPanel1.add(inclusionLabel);
        inclusionLabel.setBounds(340, 300, 160, 35);

        transportationLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        transportationLabel.setText("Transportation : ");
        jPanel1.add(transportationLabel);
        transportationLabel.setBounds(40, 250, 250, 35);

        InclusionText.setColumns(20);
        InclusionText.setLineWrap(true);
        InclusionText.setRows(5);
        InclusionText.setWrapStyleWord(true);
        InclusionText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane6.setViewportView(InclusionText);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(340, 340, 218, 68);

        PriceLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        PriceLabel.setText("PRICE : ");
        jPanel1.add(PriceLabel);
        PriceLabel.setBounds(460, 600, 320, 32);

        joinButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        joinButton.setText("BOOK NOW");
        jPanel1.add(joinButton);
        joinButton.setBounds(450, 530, 173, 39);

        jLabel10.setText("CREATOR PROFILE :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(697, 79, 300, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/BGpict.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1060, 720);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1080, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public void setTrekNameLabel(String text){
        trekNameLabel.setText(text);
        trekName = text;
        ImagePanel();
    }
    
    public void setLocationLabel(String text){
        locationLabel.setText("Location :" + text);
    }
    
    public void setHeightLabel(int num){
        heightLabel.setText("Height :" + num + " feet" );
    }
    
    public void setItinenaryText(String text){
        itinenaryText.setText(text);
    }
    
    public void setTransportText(String text){
        transportationLabel.setText("Transporation : " + text);
    }
    
    public void setInclusionText(String text){
        InclusionText.setText(text);
    }
    
    public void setPriceLabel(int price){
        PriceLabel.setText("Price : Rs." + price + "/-");
    }
    
    private void ImagePanel(){
        ImageIcon imageIcon = getImageFromDatabase(trekName);
        ImageLabel = new javax.swing.JLabel(imageIcon);
        imagepanel.add(ImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 160));
         
    }
    
    private ImageIcon getImageFromDatabase(String trekName) {
    try {
        Connection con = DatabaseConnection.connect();
        String selectQuery = "SELECT image FROM trek_data WHERE name = ?";
        try (PreparedStatement statement = con.prepareStatement(selectQuery)) {
            statement.setString(1, trekName);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Blob imageBlob = resultSet.getBlob("image");
                    byte[] imageBytes = imageBlob.getBytes(1, (int) imageBlob.length());
                    ImageIcon imageIcon = new ImageIcon(imageBytes);
                    return imageIcon;
                }
            }
        }
    } catch (SQLException ex) {
    } finally {
        DatabaseConnection.disconnect();
    }
    return null;
}
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
            java.util.logging.Logger.getLogger(TrekJoinInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrekJoinInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrekJoinInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrekJoinInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrekJoinInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea InclusionText;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JPanel imagepanel;
    private javax.swing.JLabel inclusionLabel;
    private javax.swing.JLabel itinaryLabel;
    private javax.swing.JTextArea itinenaryText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton joinButton;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel transportationLabel;
    private javax.swing.JLabel trekNameLabel;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JLabel ImageLabel;
    private String trekName;
}