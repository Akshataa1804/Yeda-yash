/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trekmosaic;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class gearpage2 extends javax.swing.JFrame {

    /**
     * Creates new form gearpage2
     */
    public gearpage2() {
        initComponents();
        itemname1 = "Trek shoes";
        itemname2 = "HeadLamp";
        itemname3 = "Bagpack";
        itemname4 = "Tiffinbox";
        itemname5 = "Poncho ";
        itemname6 = GearData.getName();
        getItemfromDatabase(itemname1);
        priceItem1 = price;
        Panelitem1(feature1, feature2, feature3, price);
        getItemfromDatabase(itemname2);
        priceItem2 = price;
        Panelitem2(feature1, feature2, feature3, price);
        getItemfromDatabase(itemname3);
        priceItem3 = price;
        Panelitem3(feature1, feature2, feature3, price);
        getItemfromDatabase(itemname4);
        priceItem4 = price;
        Panelitem4(feature1, feature2, feature3, price);
        getItemfromDatabase(itemname5);
        priceItem5 = price;
        Panelitem5(feature1, feature2, feature3, price);
        priceItem6 = GearData.getPrice();
        Panelitem6(GearData.getfeature1(), GearData.getfeature2(), GearData.getfeature3(), GearData.getPrice() );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        item6Panel = new javax.swing.JPanel();
        item6Name = new javax.swing.JLabel();
        item6Price = new javax.swing.JLabel();
        shoeResntButton = new javax.swing.JButton();
        item6counter = new javax.swing.JLabel();
        item6feature2 = new javax.swing.JLabel();
        item6feature3 = new javax.swing.JLabel();
        item6feature1 = new javax.swing.JLabel();
        item6plus = new javax.swing.JButton();
        item6minus = new javax.swing.JButton();
        item6ImagePanel = new javax.swing.JPanel();
        item1Panel = new javax.swing.JPanel();
        item1ImagePanel = new javax.swing.JPanel();
        item1Name = new javax.swing.JLabel();
        item1Price = new javax.swing.JLabel();
        item1Rentbutton = new javax.swing.JButton();
        item1counter = new javax.swing.JLabel();
        item1feature2 = new javax.swing.JLabel();
        item1feature3 = new javax.swing.JLabel();
        item1feature1 = new javax.swing.JLabel();
        item1plus = new javax.swing.JButton();
        item1minus = new javax.swing.JButton();
        item2Panel = new javax.swing.JPanel();
        item2Name = new javax.swing.JLabel();
        item2Price = new javax.swing.JLabel();
        item2Rentbutton = new javax.swing.JButton();
        item2counter = new javax.swing.JLabel();
        item2feature2 = new javax.swing.JLabel();
        item2feature3 = new javax.swing.JLabel();
        item2feature1 = new javax.swing.JLabel();
        item2plus = new javax.swing.JButton();
        item2minus = new javax.swing.JButton();
        item2ImagePanel = new javax.swing.JPanel();
        item3Panel = new javax.swing.JPanel();
        item3ImagePanel = new javax.swing.JPanel();
        item3name = new javax.swing.JLabel();
        item3price = new javax.swing.JLabel();
        shoeResntButton3 = new javax.swing.JButton();
        item3counter = new javax.swing.JLabel();
        item3feature2 = new javax.swing.JLabel();
        item3feature3 = new javax.swing.JLabel();
        item3feature1 = new javax.swing.JLabel();
        item3plus = new javax.swing.JButton();
        item3minus = new javax.swing.JButton();
        item4Panel = new javax.swing.JPanel();
        item4Name = new javax.swing.JLabel();
        item4Price = new javax.swing.JLabel();
        shoeResntButton4 = new javax.swing.JButton();
        item4counter = new javax.swing.JLabel();
        item4feature2 = new javax.swing.JLabel();
        item4feature3 = new javax.swing.JLabel();
        item4feature1 = new javax.swing.JLabel();
        item4plus = new javax.swing.JButton();
        item4minus = new javax.swing.JButton();
        item4ImagePanel = new javax.swing.JPanel();
        item5Panel = new javax.swing.JPanel();
        item5Name = new javax.swing.JLabel();
        item5Price = new javax.swing.JLabel();
        shoeResntButton5 = new javax.swing.JButton();
        item5counter = new javax.swing.JLabel();
        item5feature2 = new javax.swing.JLabel();
        item5feature3 = new javax.swing.JLabel();
        item5feature1 = new javax.swing.JLabel();
        item5plus = new javax.swing.JButton();
        item5minus = new javax.swing.JButton();
        item5ImagePanel = new javax.swing.JPanel();
        costButton = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bglabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Swis721 Blk BT", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("RENT GEARS");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        item6Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item6Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        item6Name.setBackground(new java.awt.Color(153, 153, 153));
        item6Name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        item6Name.setForeground(new java.awt.Color(0, 51, 51));
        item6Name.setText("NAME OF ITEM ");
        item6Panel.add(item6Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 151, 142, 33));

        item6Price.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        item6Price.setText("PRICE : ");
        item6Panel.add(item6Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 190, 116, 27));

        shoeResntButton.setBackground(new java.awt.Color(204, 204, 255));
        shoeResntButton.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        shoeResntButton.setText("RENT ");
        shoeResntButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        shoeResntButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoeResntButtonActionPerformed(evt);
            }
        });
        item6Panel.add(shoeResntButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 193, 76, 27));

        item6counter.setBackground(new java.awt.Color(153, 153, 153));
        item6counter.setText("   0");
        item6counter.setToolTipText("");
        item6counter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item6Panel.add(item6counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 157, 27, 27));

        item6feature2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item6feature2.setText("feature");
        item6Panel.add(item6feature2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 58, 135, 28));

        item6feature3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item6feature3.setText("feature");
        item6Panel.add(item6feature3, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 105, 135, 28));

        item6feature1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item6feature1.setText("feature");
        item6Panel.add(item6feature1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 18, 135, 28));

        item6plus.setBackground(new java.awt.Color(204, 204, 204));
        item6plus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        item6plus.setText("+");
        item6plus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item6plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item6plusActionPerformed(evt);
            }
        });
        item6Panel.add(item6plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 160, 25, 17));

        item6minus.setBackground(new java.awt.Color(204, 204, 204));
        item6minus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        item6minus.setText("-");
        item6minus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item6minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item6minusActionPerformed(evt);
            }
        });
        item6Panel.add(item6minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 160, 25, 17));

        item6ImagePanel.setBackground(new java.awt.Color(204, 204, 204));
        item6ImagePanel.setForeground(new java.awt.Color(204, 204, 204));
        item6ImagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        item6Panel.add(item6ImagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 140, 130));

        jPanel1.add(item6Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 300, 230));

        item1Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item1Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        item1ImagePanel.setBackground(new java.awt.Color(204, 204, 204));
        item1ImagePanel.setForeground(new java.awt.Color(204, 204, 204));
        item1ImagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        item1Panel.add(item1ImagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 140, 130));

        item1Name.setBackground(new java.awt.Color(153, 153, 153));
        item1Name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        item1Name.setForeground(new java.awt.Color(0, 51, 51));
        item1Name.setText("NAME OF ITEM ");
        item1Panel.add(item1Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 138, 142, 33));

        item1Price.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        item1Price.setText("PRICE : ");
        item1Panel.add(item1Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 182, 116, 27));

        item1Rentbutton.setBackground(new java.awt.Color(204, 204, 255));
        item1Rentbutton.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        item1Rentbutton.setText("RENT ");
        item1Rentbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        item1Rentbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1RentbuttonActionPerformed(evt);
            }
        });
        item1Panel.add(item1Rentbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 185, 76, 27));

        item1counter.setBackground(new java.awt.Color(153, 153, 153));
        item1counter.setText("   0");
        item1counter.setToolTipText("");
        item1counter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item1Panel.add(item1counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 27, 27));

        item1feature2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item1feature2.setText("feature");
        item1Panel.add(item1feature2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 70, 135, 28));

        item1feature3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item1feature3.setText("feature");
        item1Panel.add(item1feature3, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 104, 135, 28));

        item1feature1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item1feature1.setText("feature");
        item1Panel.add(item1feature1, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 30, 135, 28));

        item1plus.setBackground(new java.awt.Color(204, 204, 204));
        item1plus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        item1plus.setText("+");
        item1plus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item1plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1plusActionPerformed(evt);
            }
        });
        item1Panel.add(item1plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 25, 20));

        item1minus.setBackground(new java.awt.Color(204, 204, 204));
        item1minus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        item1minus.setText("-");
        item1minus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item1minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1minusActionPerformed(evt);
            }
        });
        item1Panel.add(item1minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 25, 20));

        jPanel1.add(item1Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 300, 230));

        item2Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item2Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        item2Name.setBackground(new java.awt.Color(153, 153, 153));
        item2Name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        item2Name.setForeground(new java.awt.Color(0, 51, 51));
        item2Name.setText("NAME OF ITEM ");
        item2Panel.add(item2Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 151, 142, 33));

        item2Price.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        item2Price.setText("PRICE : ");
        item2Panel.add(item2Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 190, 116, 27));

        item2Rentbutton.setBackground(new java.awt.Color(204, 204, 255));
        item2Rentbutton.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        item2Rentbutton.setText("RENT ");
        item2Rentbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        item2Rentbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2RentbuttonActionPerformed(evt);
            }
        });
        item2Panel.add(item2Rentbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 193, 76, 27));

        item2counter.setBackground(new java.awt.Color(153, 153, 153));
        item2counter.setText("   0");
        item2counter.setToolTipText("");
        item2counter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item2Panel.add(item2counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 157, 27, 27));

        item2feature2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item2feature2.setText("feature");
        item2Panel.add(item2feature2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 58, 135, 28));

        item2feature3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item2feature3.setText("feature");
        item2Panel.add(item2feature3, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 105, 135, 28));

        item2feature1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item2feature1.setText("feature");
        item2Panel.add(item2feature1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 18, 135, 28));

        item2plus.setBackground(new java.awt.Color(204, 204, 204));
        item2plus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        item2plus.setText("+");
        item2plus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item2plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2plusActionPerformed(evt);
            }
        });
        item2Panel.add(item2plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 160, 25, 17));

        item2minus.setBackground(new java.awt.Color(204, 204, 204));
        item2minus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        item2minus.setText("-");
        item2minus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item2minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2minusActionPerformed(evt);
            }
        });
        item2Panel.add(item2minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 160, 25, 17));

        item2ImagePanel.setBackground(new java.awt.Color(204, 204, 204));
        item2ImagePanel.setForeground(new java.awt.Color(204, 204, 204));
        item2ImagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        item2Panel.add(item2ImagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 140, 130));

        jPanel1.add(item2Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 300, 230));

        item3Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item3Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        item3ImagePanel.setBackground(new java.awt.Color(204, 204, 204));
        item3ImagePanel.setForeground(new java.awt.Color(204, 204, 204));
        item3ImagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        item3Panel.add(item3ImagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 140, 130));

        item3name.setBackground(new java.awt.Color(153, 153, 153));
        item3name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        item3name.setForeground(new java.awt.Color(0, 51, 51));
        item3name.setText("NAME OF ITEM ");
        item3Panel.add(item3name, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 151, 142, 33));

        item3price.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        item3price.setText("PRICE : ");
        item3Panel.add(item3price, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 193, 116, 27));

        shoeResntButton3.setBackground(new java.awt.Color(204, 204, 255));
        shoeResntButton3.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        shoeResntButton3.setText("RENT ");
        shoeResntButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        shoeResntButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoeResntButton3ActionPerformed(evt);
            }
        });
        item3Panel.add(shoeResntButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 196, 76, 27));

        item3counter.setBackground(new java.awt.Color(153, 153, 153));
        item3counter.setText("   0");
        item3counter.setToolTipText("");
        item3counter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item3Panel.add(item3counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 157, 27, 27));

        item3feature2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item3feature2.setText("feature");
        item3Panel.add(item3feature2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 58, 135, 28));

        item3feature3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item3feature3.setText("feature");
        item3Panel.add(item3feature3, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 105, 135, 28));

        item3feature1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item3feature1.setText("feature");
        item3Panel.add(item3feature1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 18, 135, 28));

        item3plus.setBackground(new java.awt.Color(204, 204, 204));
        item3plus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        item3plus.setText("+");
        item3plus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item3plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item3plusActionPerformed(evt);
            }
        });
        item3Panel.add(item3plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 160, 25, 17));

        item3minus.setBackground(new java.awt.Color(204, 204, 204));
        item3minus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        item3minus.setText("-");
        item3minus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item3minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item3minusActionPerformed(evt);
            }
        });
        item3Panel.add(item3minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 160, 25, 17));

        jPanel1.add(item3Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 300, 230));

        item4Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item4Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        item4Name.setBackground(new java.awt.Color(153, 153, 153));
        item4Name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        item4Name.setForeground(new java.awt.Color(0, 51, 51));
        item4Name.setText("NAME OF ITEM ");
        item4Panel.add(item4Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 151, 142, 33));

        item4Price.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        item4Price.setText("PRICE : ");
        item4Panel.add(item4Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 190, 116, 27));

        shoeResntButton4.setBackground(new java.awt.Color(204, 204, 255));
        shoeResntButton4.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        shoeResntButton4.setText("RENT ");
        shoeResntButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        shoeResntButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoeResntButton4ActionPerformed(evt);
            }
        });
        item4Panel.add(shoeResntButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 193, 76, 27));

        item4counter.setBackground(new java.awt.Color(153, 153, 153));
        item4counter.setText("   0");
        item4counter.setToolTipText("");
        item4counter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item4Panel.add(item4counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 157, 27, 27));

        item4feature2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item4feature2.setText("feature");
        item4Panel.add(item4feature2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 58, 135, 28));

        item4feature3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item4feature3.setText("feature");
        item4Panel.add(item4feature3, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 105, 135, 28));

        item4feature1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item4feature1.setText("feature");
        item4Panel.add(item4feature1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 18, 135, 28));

        item4plus.setBackground(new java.awt.Color(204, 204, 204));
        item4plus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        item4plus.setText("+");
        item4plus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item4plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item4plusActionPerformed(evt);
            }
        });
        item4Panel.add(item4plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 160, 25, 17));

        item4minus.setBackground(new java.awt.Color(204, 204, 204));
        item4minus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        item4minus.setText("-");
        item4minus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item4minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item4minusActionPerformed(evt);
            }
        });
        item4Panel.add(item4minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 160, 25, 17));

        item4ImagePanel.setBackground(new java.awt.Color(204, 204, 204));
        item4ImagePanel.setForeground(new java.awt.Color(204, 204, 204));
        item4ImagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        item4Panel.add(item4ImagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 140, 130));

        jPanel1.add(item4Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 300, 230));

        item5Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item5Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        item5Name.setBackground(new java.awt.Color(153, 153, 153));
        item5Name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        item5Name.setForeground(new java.awt.Color(0, 51, 51));
        item5Name.setText("NAME OF ITEM ");
        item5Panel.add(item5Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 151, 142, 33));

        item5Price.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        item5Price.setText("PRICE : ");
        item5Panel.add(item5Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 190, 116, 27));

        shoeResntButton5.setBackground(new java.awt.Color(204, 204, 255));
        shoeResntButton5.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        shoeResntButton5.setText("RENT ");
        shoeResntButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        shoeResntButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoeResntButton5ActionPerformed(evt);
            }
        });
        item5Panel.add(shoeResntButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 193, 76, 27));

        item5counter.setBackground(new java.awt.Color(153, 153, 153));
        item5counter.setText("   0");
        item5counter.setToolTipText("");
        item5counter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item5Panel.add(item5counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 157, 27, 27));

        item5feature2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item5feature2.setText("feature");
        item5Panel.add(item5feature2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 58, 135, 28));

        item5feature3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item5feature3.setText("feature");
        item5Panel.add(item5feature3, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 105, 135, 28));

        item5feature1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item5feature1.setText("feature");
        item5Panel.add(item5feature1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 18, 135, 28));

        item5plus.setBackground(new java.awt.Color(204, 204, 204));
        item5plus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        item5plus.setText("+");
        item5plus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item5plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item5plusActionPerformed(evt);
            }
        });
        item5Panel.add(item5plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 160, 25, 17));

        item5minus.setBackground(new java.awt.Color(204, 204, 204));
        item5minus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        item5minus.setText("-");
        item5minus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item5minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item5minusActionPerformed(evt);
            }
        });
        item5Panel.add(item5minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 160, 25, 17));

        item5ImagePanel.setBackground(new java.awt.Color(204, 204, 204));
        item5ImagePanel.setForeground(new java.awt.Color(204, 204, 204));
        item5ImagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        item5Panel.add(item5ImagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 140, 130));

        jPanel1.add(item5Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 300, 230));

        costButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        costButton.setText("TOTAL COST : Rs. 0 /-");
        costButton.setOpaque(true);
        jPanel1.add(costButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 210, 60));

        jButton2.setText("PURCHASE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 610, 130, 40));

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 600, -1, -1));

        bglabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/BGpict.jpg"))); // NOI18N
        jPanel1.add(bglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1081, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1081, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shoeResntButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoeResntButtonActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_shoeResntButtonActionPerformed

    private void item1RentbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item1RentbuttonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "Items added to Cart");
       
        
    }//GEN-LAST:event_item1RentbuttonActionPerformed

    private void item2RentbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item2RentbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item2RentbuttonActionPerformed

    private void shoeResntButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoeResntButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shoeResntButton3ActionPerformed

    private void shoeResntButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoeResntButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shoeResntButton4ActionPerformed

    private void shoeResntButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoeResntButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shoeResntButton5ActionPerformed
    private int totalCost = 0;
    private void updateTotalCost() {
    totalCost = (itemcounter1 * priceItem1) + (itemcounter2 * priceItem2) + (itemcounter3 * priceItem3) + (itemcounter4 * priceItem4) + (itemcounter5 * priceItem5) + (itemcounter6 * priceItem6);
    // Add similar calculations for item 3, item 4, and so on if you have more items
    costButton.setText("TOTAL COST : Rs. " + totalCost);
}
    private void item1plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item1plusActionPerformed
        // TODO add your handling code here:
        itemcounter1++;
        item1counter.setText(" " +itemcounter1);
        updateTotalCost();
    }//GEN-LAST:event_item1plusActionPerformed

    private void item1minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item1minusActionPerformed
        // TODO add your handling code here:
        if(itemcounter1 > 0){
            itemcounter1--;
            item1counter.setText("  " + itemcounter1);
            updateTotalCost();
        }
    }//GEN-LAST:event_item1minusActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(this, "Purchase confirmed");
        itemcounter1 = 0;
        itemcounter2 = 0;
        itemcounter1 = 0;
        itemcounter2 = 0;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void item2plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item2plusActionPerformed
        // TODO add your handling code here:
         itemcounter2++;
        item2counter.setText(" " +itemcounter2);
       updateTotalCost();
    }//GEN-LAST:event_item2plusActionPerformed

    private void item2minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item2minusActionPerformed
        // TODO add your handling code here:
            if(itemcounter2 > 0){
            itemcounter2--;
            item2counter.setText(" " + itemcounter2);
            updateTotalCost();
  }
    }//GEN-LAST:event_item2minusActionPerformed

    private void item3plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item3plusActionPerformed
        // TODO add your handling code here:
         itemcounter3++;
        item3counter.setText(" " +itemcounter3);
        updateTotalCost();
    }//GEN-LAST:event_item3plusActionPerformed

    private void item3minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item3minusActionPerformed
        // TODO add your handling code here:
         if(itemcounter3 > 0){
            itemcounter3--;
            item3counter.setText(" " + itemcounter3);
            updateTotalCost();
         }
    }//GEN-LAST:event_item3minusActionPerformed

    private void item4plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item4plusActionPerformed
        // TODO add your handling code here:
        itemcounter4++;
        item4counter.setText(" " + itemcounter4);
        updateTotalCost();
    }//GEN-LAST:event_item4plusActionPerformed

    private void item5plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item5plusActionPerformed
        // TODO add your handling code here:
         itemcounter5++;
        item5counter.setText(" " +itemcounter5);
        updateTotalCost();
    }//GEN-LAST:event_item5plusActionPerformed

    private void item6plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item6plusActionPerformed
        // TODO add your handling code here:
         itemcounter6++;
        item6counter.setText(" " +itemcounter6);
       updateTotalCost();
    }//GEN-LAST:event_item6plusActionPerformed

    private void item4minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item4minusActionPerformed
        // TODO add your handling code here:
         if(itemcounter4 > 0){
            itemcounter4--;
            item4counter.setText(" " + itemcounter4);
            updateTotalCost();
         }
    }//GEN-LAST:event_item4minusActionPerformed

    private void item5minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item5minusActionPerformed
        // TODO add your handling code here:
         if(itemcounter5 > 0){
            itemcounter5--;
            item5counter.setText(" " + itemcounter5);
            updateTotalCost();
         }
    }//GEN-LAST:event_item5minusActionPerformed

    private void item6minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item6minusActionPerformed
        // TODO add your handling code here:
         if(itemcounter6 > 0){
            itemcounter6--;
            item6counter.setText(" " + itemcounter6);
            updateTotalCost();
         }
    }//GEN-LAST:event_item6minusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dashboard_v2 db = new dashboard_v2();
        db.setLocationRelativeTo(null);
        db.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    void getItemfromDatabase(String ItemName){
        try {
            Connection con = DatabaseConnection.connect();
            String query = "SELECT * FROM gear_data where name = ?";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, ItemName);
            ResultSet result = stm.executeQuery();
            if(result.next())
            {
             name = result.getString("name");
             feature1 = result.getString("feature1");
             feature2 = result.getString("feature2");
             feature3 = result.getString("feature3");
             price = result.getInt("price");
            }
            
        } catch (SQLException ex) {
        } finally {
            DatabaseConnection.disconnect();
        }
        
    }
   
     private void Panelitem1(String feature1, String feature2, String feature3, int price){
        ImageIcon imageIcon1 = getImageFromDatabase(itemname1);
         imageLabelitem1 = new javax.swing.JLabel(imageIcon1);
        item1feature1.setText(feature1);
        item1feature2.setText(feature2);
        item1feature3.setText(feature3);
        item1Name.setText(itemname1);
        item1Price.setText("Price :" + price );
        item1ImagePanel.add(imageLabelitem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 130));
     }
     
    private void Panelitem2(String feature1, String feature2, String feature3, int price){
        ImageIcon imageIcon2 = getImageFromDatabase(itemname2);
        imageLabelitem2 = new javax.swing.JLabel(imageIcon2);
        item2feature1.setText(feature1);
        item2feature2.setText(feature2);
        item2feature3.setText(feature3);
        item2Name.setText(itemname2);
        item2Price.setText("Price :" + price );
        item2ImagePanel.add(imageLabelitem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 130));
     }
        private void Panelitem3(String feature1, String feature2, String feature3, int price){
        ImageIcon imageIcon3 = getImageFromDatabase(itemname3);
        imageLabelitem3 = new javax.swing.JLabel(imageIcon3);
        item3feature1.setText(feature1);
        item3feature2.setText(feature2);
        item3feature3.setText(feature3);
        item3name.setText(itemname3);
        item3price.setText("Price :" + price );
        item3ImagePanel.add(imageLabelitem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 130));
     }
        private void Panelitem4(String feature1, String feature2, String feature3, int price){
        ImageIcon imageIcon4 = getImageFromDatabase(itemname4);
        imageLabelitem4 = new javax.swing.JLabel(imageIcon4);
        item4feature1.setText(feature1);
        item4feature2.setText(feature2);
        item4feature3.setText(feature3);
        item4Name.setText(itemname4);
        item4Price.setText("Price :" + price );
        item4ImagePanel.add(imageLabelitem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 130));
     }
        private void Panelitem5(String feature1, String feature2, String feature3, int price){
        ImageIcon imageIcon5 = getImageFromDatabase(itemname5);
        imageLabelitem5 = new javax.swing.JLabel(imageIcon5);
        item5feature1.setText(feature1);
        item5feature2.setText(feature2);
        item5feature3.setText(feature3);
        item5Name.setText(itemname5);
        item5Price.setText("Price :" + price );
        item5ImagePanel.add(imageLabelitem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 130));
     }
        private void Panelitem6(String feature1, String feature2, String feature3, int price){
        ImageIcon imageIcon6 = getImageFromDatabase(itemname6);
        imageLabelitem6 = new javax.swing.JLabel(imageIcon6);
        item6feature1.setText(feature1);
        item6feature2.setText(feature2);
        item6feature3.setText(feature3);
        item6Name.setText(itemname6);
        item6Price.setText("Price :" + price );
        item6ImagePanel.add(imageLabelitem6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 130));
     }

    private ImageIcon getImageFromDatabase(String Name) {
        try {
            Connection con = DatabaseConnection.connect();
            String selectQuery = "SELECT image FROM gear_data WHERE name = ?";
            try (PreparedStatement statement = con.prepareStatement(selectQuery)) {
                statement.setString(1, Name);
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
            java.util.logging.Logger.getLogger(gearpage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gearpage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gearpage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gearpage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gearpage2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bglabel;
    private javax.swing.JLabel costButton;
    private javax.swing.JPanel item1ImagePanel;
    private javax.swing.JLabel item1Name;
    private javax.swing.JPanel item1Panel;
    private javax.swing.JLabel item1Price;
    private javax.swing.JButton item1Rentbutton;
    private javax.swing.JLabel item1counter;
    private javax.swing.JLabel item1feature1;
    private javax.swing.JLabel item1feature2;
    private javax.swing.JLabel item1feature3;
    private javax.swing.JButton item1minus;
    private javax.swing.JButton item1plus;
    private javax.swing.JPanel item2ImagePanel;
    private javax.swing.JLabel item2Name;
    private javax.swing.JPanel item2Panel;
    private javax.swing.JLabel item2Price;
    private javax.swing.JButton item2Rentbutton;
    private javax.swing.JLabel item2counter;
    private javax.swing.JLabel item2feature1;
    private javax.swing.JLabel item2feature2;
    private javax.swing.JLabel item2feature3;
    private javax.swing.JButton item2minus;
    private javax.swing.JButton item2plus;
    private javax.swing.JPanel item3ImagePanel;
    private javax.swing.JPanel item3Panel;
    private javax.swing.JLabel item3counter;
    private javax.swing.JLabel item3feature1;
    private javax.swing.JLabel item3feature2;
    private javax.swing.JLabel item3feature3;
    private javax.swing.JButton item3minus;
    private javax.swing.JLabel item3name;
    private javax.swing.JButton item3plus;
    private javax.swing.JLabel item3price;
    private javax.swing.JPanel item4ImagePanel;
    private javax.swing.JLabel item4Name;
    private javax.swing.JPanel item4Panel;
    private javax.swing.JLabel item4Price;
    private javax.swing.JLabel item4counter;
    private javax.swing.JLabel item4feature1;
    private javax.swing.JLabel item4feature2;
    private javax.swing.JLabel item4feature3;
    private javax.swing.JButton item4minus;
    private javax.swing.JButton item4plus;
    private javax.swing.JPanel item5ImagePanel;
    private javax.swing.JLabel item5Name;
    private javax.swing.JPanel item5Panel;
    private javax.swing.JLabel item5Price;
    private javax.swing.JLabel item5counter;
    private javax.swing.JLabel item5feature1;
    private javax.swing.JLabel item5feature2;
    private javax.swing.JLabel item5feature3;
    private javax.swing.JButton item5minus;
    private javax.swing.JButton item5plus;
    private javax.swing.JPanel item6ImagePanel;
    private javax.swing.JLabel item6Name;
    private javax.swing.JPanel item6Panel;
    private javax.swing.JLabel item6Price;
    private javax.swing.JLabel item6counter;
    private javax.swing.JLabel item6feature1;
    private javax.swing.JLabel item6feature2;
    private javax.swing.JLabel item6feature3;
    private javax.swing.JButton item6minus;
    private javax.swing.JButton item6plus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton shoeResntButton;
    private javax.swing.JButton shoeResntButton3;
    private javax.swing.JButton shoeResntButton4;
    private javax.swing.JButton shoeResntButton5;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JLabel imageLabelitem1;
    private javax.swing.JLabel imageLabelitem2;
    private javax.swing.JLabel imageLabelitem3;
    private javax.swing.JLabel imageLabelitem4;
    private javax.swing.JLabel imageLabelitem5;
    private javax.swing.JLabel imageLabelitem6;
    private final int count = 0;
    String name;
    String feature1;
    String feature2;
    String feature3;
    String itemname1;
    String itemname2;
    String itemname3;
    String itemname4;
    String itemname5;
    String itemname6;
    int price;
    int priceItem1;
    int itemcounter1 = 0;
    int priceItem2 = 180;
    int itemcounter2 = 0;
    int priceItem3;
    int itemcounter3 = 0;
    int priceItem4;
    int itemcounter4 = 0;
    int priceItem5;
    int itemcounter5 = 0;
    int priceItem6;
    int itemcounter6 = 0;
    
    int cartitem1;
}
