
package shapito.restaurant.management.system;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static shapito.restaurant.management.system.ItemCustomer.isNumeric;

public class Selling extends javax.swing.JFrame {

    /**
     * Creates new form Selling
     */
    
    
    ResultSet rs = null;
    Connection con = null;
    Statement st = null;
    int myIndex;
    int key;
    int quan;
    List<BillTable> listBillTb = new ArrayList<>();
    String nameCustomerDetail;
    public Selling() {
       
        initComponents();
        showProducts();
        this.PrName.setEditable(false);
        this.PrPrice.setEditable(false);
        myIndex = 0;
        quan=0;
        key = 0;
        String userenters;
        ImageIcon icon = new ImageIcon("logo.jpg");
        userenters= JOptionPane.showInputDialog ("WELCOME TO SHAPITO RESTAURANT MANAGEMENT SYSTEM\nWHAT IS YOU NAME?",icon);
        name.setText(userenters);
        nameCustomerDetail  = this.name.getText();
//  this.billTb.setEditingRow(false);
        
  
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        PrQuantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PrPrice = new javax.swing.JTextField();
        printBtn = new javax.swing.JButton();
        PrName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        billTb = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductList = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        filterCategory = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        addBtn1 = new javax.swing.JButton();
        addBtn2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        PrtotalPrice = new javax.swing.JLabel();
        RemoveBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SHAPITO RESTAURANT MANAGEMENT SYSTEM");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));

        jLabel12.setBackground(new java.awt.Color(0, 102, 204));
        jLabel12.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("MENU");

        name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        name.setText("Laiq");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Welcome , ");

        jLabel17.setBackground(new java.awt.Color(102, 102, 0));
        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("CUSTOMER PANEL");
        jLabel17.setOpaque(true);

        jButton13.setBackground(new java.awt.Color(102, 102, 0));
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("LOGIN AS ADMIN");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(name))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel12)))
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(jLabel16))
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addGap(68, 68, 68)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 0));

        jLabel9.setBackground(new java.awt.Color(102, 102, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SHAPITO RESTAURANT MANAGEMENT SYSTEM");
        jLabel9.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel6.setText("Name ");

        PrQuantity.setToolTipText("");
        PrQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrQuantityActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setText("Filter:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel10.setText("Price");

        PrPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrPriceActionPerformed(evt);
            }
        });

        printBtn.setBackground(new java.awt.Color(255, 51, 0));
        printBtn.setForeground(new java.awt.Color(255, 255, 255));
        printBtn.setText("PRINT");
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        PrName.setToolTipText("");
        PrName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrNameActionPerformed(evt);
            }
        });

        billTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO.", "NAME", "PRICE", "QUANTITY", "TOTAL"
            }
        ));
        billTb.setRowHeight(30);
        billTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billTbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(billTb);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setText("YOUR CART DETAILS");

        ProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "CATEGORY", "PRICE", "AVAILABLE QUANTITY"
            }
        ));
        ProductList.setRowHeight(30);
        ProductList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ProductList);

        addBtn.setBackground(new java.awt.Color(255, 51, 0));
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("ADD TO CART");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        filterCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage", "Snacks", "Sandwiches", "Pizza", "Burger" }));
        filterCategory.setToolTipText("");
        filterCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filterCategoryItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel8.setText("Quantity");

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel13.setText("Search:");

        search.setToolTipText("");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        addBtn1.setBackground(new java.awt.Color(255, 51, 0));
        addBtn1.setForeground(new java.awt.Color(255, 255, 255));
        addBtn1.setText("SEARCH");
        addBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn1ActionPerformed(evt);
            }
        });

        addBtn2.setBackground(new java.awt.Color(255, 51, 0));
        addBtn2.setForeground(new java.awt.Color(255, 255, 255));
        addBtn2.setText("RESET");
        addBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel14.setText("Total Amount");

        PrtotalPrice.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        PrtotalPrice.setText("0.0 Rs");

        RemoveBtn.setBackground(new java.awt.Color(255, 51, 0));
        RemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        RemoveBtn.setText("REMOVE ITEM");
        RemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(PrName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(PrPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(RemoveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(202, 202, 202))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PrQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(filterCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel13)))
                        .addGap(18, 18, 18)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(addBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(133, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PrtotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RemoveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PrtotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filterCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13)
                            .addComponent(addBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel11.setText("Product Management");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(422, 422, 422)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1441, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void showProducts(){
        try{
             con = DriverManager.getConnection(
                        "jdbc:mysql://mcseadeals.com:3306/mcseadeals_restaurant","mcseadeals_shapito", "shapitoltd123");
             st = con.createStatement();
             rs = st.executeQuery("SELECT * FROM `producttbl`;");
             this.ProductList.setModel(DbUtils.resultSetToTableModel(rs));
             ProductList.getColumnModel().getColumn(0).setHeaderValue("PRODUCT NO.");
             ProductList.getColumnModel().getColumn(1).setHeaderValue("NAME");
             ProductList.getColumnModel().getColumn(2).setHeaderValue("CATEGORY");
             ProductList.getColumnModel().getColumn(3).setHeaderValue("PRICE");
             ProductList.getColumnModel().getColumn(4).setHeaderValue("AVAILABLE QUANTITY");
        }catch(Exception e){
              JOptionPane.showMessageDialog(this , e);
        }
    }
    
    
    
    private void PrQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrQuantityActionPerformed

    private void PrPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrPriceActionPerformed
    
    float sum = 0;
    
    private void addBillDetails(){
         // TODO add your handling code here:
   
             
            // below two lines are used for connectivity.
          if(!this.listBillTb.isEmpty()){
            try {
                DefaultTableModel model = (DefaultTableModel) this.billTb.getModel();
                model.setRowCount(0);
                this.billTb.setModel(model);
               //   Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(
                        "jdbc:mysql://mcseadeals.com:3306/mcseadeals_restaurant","mcseadeals_shapito", "shapitoltd123");
                PreparedStatement pst = con.prepareStatement("INSERT INTO `billtbl` (`Seller`, `BDate`, `Amount`) VALUES (?, ?, ?);");
                
                pst.setString(1, this.name.getText());
                LocalDateTime now = LocalDateTime.now();
                pst.setString(2, now.toString().substring(0, 10));
                pst.setFloat(3, sum); 
                
                int row  = pst.executeUpdate();
                if(row > 0)
                {
                     sum = 0;
                     JOptionPane.showMessageDialog(this , "CUSTOMER INFORMATION SUCCESSFULLY ADD\n THANKS FOR COMMING!!!");
                }
                else
                 JOptionPane.showMessageDialog(this , "CUSTOMER INFORMATION UNSUCCESSFULLY ADDED!!!");
                showProducts();
                con.close();
                
                
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(this , "Database Connection Error");
            } 
          }
          else
               JOptionPane.showMessageDialog(this , "PLEASE ADD PRUCT TO CART THANKS");

        
    }
    
    
    
    Double bHeight=0.0;


    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
       bHeight = Double.valueOf(this.billTb.getRowCount());
        //JOptionPane.showMessageDialog(rootPane, bHeight);
        if(!this.listBillTb.isEmpty()){
           
            
            PrinterJob pj = PrinterJob.getPrinterJob();        
            pj.setPrintable(new BillPrintable(),getPageFormat(pj));
            try {

                 pj.print();
                // this.PrtotalPrice.se

            }
             catch (PrinterException ex) {
                     ex.printStackTrace();
            }
             addBillDetails();
            this.PrtotalPrice.setText(sum + " Rs");
        }
        else
            JOptionPane.showMessageDialog(this , "CART IS EMPTY!!!");
            
    }//GEN-LAST:event_printBtnActionPerformed

    private void PrNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrNameActionPerformed
    int index = 1;
    
    int[] indexArray = new int[100];
   // int current = 0;
    
    private void ShowBillTable(){
         DefaultTableModel model = (DefaultTableModel) this.billTb.getModel();
         model.setRowCount(0);
         this.billTb.setModel(model);
       ////  jtable1.setModel(new DefaultTable(new String[]{“id”,
        //    “name”, “address”, “phone”},null));
         for(int i = 0; i < this.listBillTb.size(); i++){
              model.addRow(new Object[] {
                this.listBillTb.get(i).id,
                this.listBillTb.get(i).name,
                this.listBillTb.get(i).price,
                this.listBillTb.get(i).quantity,
                this.listBillTb.get(i).total
            });
         }
         
    }
    
    
    
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
     if(this.PrQuantity.getText().isEmpty()){
         JOptionPane.showMessageDialog(this , "MISSING INFORMATION!!!");
     }
     else{
        float total = Float.valueOf(this.PrPrice.getText()) * Float.valueOf(this.PrQuantity.getText());
        if(quan <= 0)
        {
            JOptionPane.showMessageDialog(this , "THIS PRODUCT IS NOT AVAILABLE. SORRY FOR INCONVIENENCE!!!");
        }
        else if(Integer.valueOf(this.PrQuantity.getText()) <= 0 || Float.valueOf(this.PrQuantity.getText()) > quan ){
     JOptionPane.showMessageDialog(this , "PLEASE ENTER CORRECT QUANTITY!!!");
    }
        else{
            
            BillTable billTable = new BillTable();
            billTable.id = index;
            billTable.name = this.PrName.getText();
            billTable.price = Float.valueOf(this.PrPrice.getText());
            billTable.quantity = Integer.valueOf(this.PrQuantity.getText());
            billTable.total = total;
            this.listBillTb.add(billTable);
            
            ShowBillTable();
            this.indexArray[index] = key;
            
            sum+=total;
            this.PrtotalPrice.setText(sum + " Rs");
            index++;
            
                        try {
               //   Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection(
                        "jdbc:mysql://mcseadeals.com:3306/mcseadeals_restaurant","mcseadeals_shapito", "shapitoltd123");
                PreparedStatement pst = con.prepareStatement("UPDATE `producttbl` SET `quantity` = ? WHERE `producttbl`.`PNum` = ?;");
               // pst.setInt(1, 1);
             
                pst.setInt(1, quan - Integer.valueOf(this.PrQuantity.getText()) ); 
               
                pst.setInt(2, key);
                int row  = pst.executeUpdate();
                if(row > 0)
                {
                     showProducts();
                     JOptionPane.showMessageDialog(this , "ITEM EDIT SUCCESSFULLY!!!");
                }
                else
                 JOptionPane.showMessageDialog(this , "ITEM EDIT UNSUCCESSFULLY!!!");
                
                con.close();
                
                
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(this , ex);
            } 
            
            
        }
     }
    }//GEN-LAST:event_addBtnActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
          new login().setVisible(true);
          this.dispose();
    }//GEN-LAST:event_jButton13ActionPerformed
  
  
    private void ProductListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductListMouseClicked
          DefaultTableModel model = (DefaultTableModel) this.ProductList.getModel();
         myIndex = this.ProductList.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(myIndex, 0).toString());
        this.PrName.setText(model.getValueAt(myIndex, 1).toString());
        //this.PrCat;
        this.PrPrice.setText(model.getValueAt(myIndex, 3).toString());
        this.PrQuantity.setText(model.getValueAt(myIndex, 4).toString());
        quan  = Integer.valueOf(model.getValueAt(myIndex, 4).toString());
        
    }//GEN-LAST:event_ProductListMouseClicked

    private void filterCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filterCategoryItemStateChanged
        // TODO add your handling code here:

        try{
            con = DriverManager.getConnection(
                "jdbc:mysql://mcseadeals.com:3306/mcseadeals_restaurant","mcseadeals_shapito", "shapitoltd123");
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM `producttbl` where `producttbl`.`Category` = '" + this.filterCategory.getSelectedItem().toString() + "';");
            this.ProductList.setModel(DbUtils.resultSetToTableModel(rs));
            ProductList.getColumnModel().getColumn(0).setHeaderValue("PRODUCT NO.");
            ProductList.getColumnModel().getColumn(1).setHeaderValue("NAME");
            ProductList.getColumnModel().getColumn(2).setHeaderValue("CATEGORY");
            ProductList.getColumnModel().getColumn(3).setHeaderValue("PRICE");
            ProductList.getColumnModel().getColumn(4).setHeaderValue("QUANTITY");
        }catch(Exception e){
            //   JOptionPane.showMessageDialog(this , "CHECK INTERNET CONNECTION!!!");
        }
    }//GEN-LAST:event_filterCategoryItemStateChanged

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void addBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn1ActionPerformed
        // TODO add your handling code here:
                if(this.search.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this , "PLEASE TYPE IN SEARCH BAR!!!");
        }else{
           try{
             con = DriverManager.getConnection(
                        "jdbc:mysql://mcseadeals.com:3306/mcseadeals_restaurant","mcseadeals_shapito", "shapitoltd123");
             st = con.createStatement();
             if(isNumeric(this.search.getText()))
                rs = st.executeQuery("SELECT * FROM `producttbl` where `producttbl`.`price` <= '" + this.search.getText() + "';");
             else
                rs = st.executeQuery("SELECT * FROM `producttbl` where `producttbl`.`Pname` = '" + this.search.getText() + "' OR `producttbl`.`Category` = '"+ this.PrQuantity.getText() +  "';");
            
             this.ProductList.setModel(DbUtils.resultSetToTableModel(rs));
             ProductList.getColumnModel().getColumn(0).setHeaderValue("PRODUCT NO.");
             ProductList.getColumnModel().getColumn(1).setHeaderValue("NAME");
             ProductList.getColumnModel().getColumn(2).setHeaderValue("CATEGORY");
             ProductList.getColumnModel().getColumn(3).setHeaderValue("PRICE");
             ProductList.getColumnModel().getColumn(4).setHeaderValue("QUANTITY");
        }catch(Exception e){
               JOptionPane.showMessageDialog(this , e);
        }
        }
    }//GEN-LAST:event_addBtn1ActionPerformed

    private void addBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn2ActionPerformed
        // TODO add your handling code here:
        
        this.showProducts();
    }//GEN-LAST:event_addBtn2ActionPerformed

    int selectQuantityBillTb;
    int selectIndexBillTb;
    int selectRowBillTb;

    private void billTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billTbMouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelBillTb = (DefaultTableModel) this.billTb.getModel();
        
        selectRowBillTb = this.billTb.getSelectedRow();
        selectIndexBillTb = Integer.valueOf(modelBillTb.getValueAt(this.selectRowBillTb, 0).toString());
        
        selectQuantityBillTb = Integer.valueOf(modelBillTb.getValueAt(this.selectRowBillTb, 3).toString());
       
        
    }//GEN-LAST:event_billTbMouseClicked

    private void RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBtnActionPerformed
        // TODO add your handling code here:
       if(this.billTb.isRowSelected(selectRowBillTb)){
          try {
               //   Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection(
                        "jdbc:mysql://mcseadeals.com:3306/mcseadeals_restaurant","mcseadeals_shapito", "shapitoltd123");
                
               // pst.setInt(1, 1);
                PreparedStatement pst2 = con.prepareStatement("SELECT `quantity` FROM `producttbl` WHERE `producttbl`.`PNum` = ?;");
             //   rs = st.executeQuery();
                int setValue = this.indexArray[this.selectIndexBillTb];
                pst2.setInt(1, setValue);
                rs = pst2.executeQuery();
                int executeQuantity = 0;
                while(rs.next())
                {
                    executeQuantity = rs.getInt(1);
                }
                PreparedStatement pst = con.prepareStatement("UPDATE `producttbl` SET `quantity` = ? WHERE `producttbl`.`PNum` = ?;");
                pst.setInt(1, this.selectQuantityBillTb + executeQuantity ); 
                
                pst.setInt(2, setValue );
                int row  = pst.executeUpdate();
                if(row > 0)
                {
                     showProducts();
                     JOptionPane.showMessageDialog(this , "ITEM EDIT SUCCESSFULLY!!!");
                     //modelBillTb.removeRow(this.selectRowBillTb);
                     for(int i = 0; i < this.listBillTb.size(); i++)
                     {
                         if((this.listBillTb.get(i).id) == this.selectIndexBillTb){
                             sum = sum - this.listBillTb.get(i).total;
                             this.listBillTb.remove(i);
                             
                             
                         }
                    }
                     this.PrtotalPrice.setText(sum + " Rs");
                     
                     this.ShowBillTable();
                }
                else
                 JOptionPane.showMessageDialog(this , "ITEM EDIT UNSUCCESSFULLY!!!");
                
                con.close();
                
                
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(this , ex);
            } 
       }
       else
           JOptionPane.showMessageDialog(this , "SELECT THE ITEM FIRST");
      
    }//GEN-LAST:event_RemoveBtnActionPerformed

    
    /**
     * @param args the command 9 arguments
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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }
    
   
    
    
    public PageFormat getPageFormat(PrinterJob pj)
{
    
    PageFormat pf = pj.defaultPage();
    Paper paper = pf.getPaper();    

    double bodyHeight = bHeight;  
    double headerHeight = 5.0;                  
    double footerHeight = 5.0;        
    double width = cm_to_pp(8); 
    double height = cm_to_pp(headerHeight+bodyHeight+footerHeight); 
    paper.setSize(width, height);
    paper.setImageableArea(0,10,width,height - cm_to_pp(1));  
            
    pf.setOrientation(PageFormat.PORTRAIT);  
    pf.setPaper(paper);    

    return pf;
}
   
    
    
    protected static double cm_to_pp(double cm)
    {            
	        return toPPI(cm * 0.393600787);            
    }
 
protected static double toPPI(double inch)
    {            
	        return inch * 72d;            
    }


public javax.swing.JTable t(){
    return this.billTb;
}
    


public class BillPrintable implements Printable {
    
   
    
    
  public int print(Graphics graphics, PageFormat pageFormat,int pageIndex) 
  throws PrinterException 
  {    
      
      int r= 10;
      ImageIcon icon=new ImageIcon("C:\\Users\\Laiq-P\\Documents\\NetBeansProjects\\SHAPITO RESTAURANT MANAGEMENT SYSTEM\\src\\shapito\\restaurant\\management\\system\\logo.jpg"); 
      int result = NO_SUCH_PAGE;    
        if (pageIndex == 0) {                    
        
            Graphics2D g2d = (Graphics2D) graphics;                    
            double width = pageFormat.getImageableWidth();                               
            g2d.translate((int) pageFormat.getImageableX(),(int) pageFormat.getImageableY()); 



          //  FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));
        
        try{
            int y=20;
            int yShift = 10;
            int headerRectHeight=15;
           // int headerRectHeighta=40;
            
                
            g2d.setFont(new Font("Monospaced",Font.PLAIN,9));
            g2d.drawImage(icon.getImage(), 70, 20, 90, 90, rootPane);y+=yShift+90;
            g2d.drawString("-------------------------------------",12,y);y+=yShift;
            g2d.drawString("SHAPITO RESTAURANT MANAGEMENT SYSTEM   ",12,y);y+=yShift;
            g2d.drawString("FAST NUCES LAHORE         ",12,y);y+=yShift;
            g2d.drawString("shapito-ltd.com ",12,y);y+=yShift;
            g2d.drawString("www.facebook.com/shapito-ltd ",12,y);y+=yShift;
            g2d.drawString("        +923097920947      ",12,y);y+=yShift;
            g2d.drawString("--------------------------------------",12,y);y+=headerRectHeight;
            g2d.drawString("Customer Name   " + nameCustomerDetail,10,y);y+=yShift;
            g2d.drawString(" Item Name      Quantity      Price   ",10,y);y+=yShift;
            g2d.drawString("--------------------------------------",10,y);y+=headerRectHeight;
            javax.swing.JTable t = t();
            DefaultTableModel model = (DefaultTableModel) t.getModel();
            Vector data = model.getDataVector();
            Vector row;       
            for (int i = 0; i < t.getRowCount(); i++) {
                row = (Vector) data.elementAt(i);
                g2d.drawString(" "+ row.elementAt(1)+ "           " + row.elementAt(3)+ "           " + row.elementAt(4),10,y);
                y+=yShift;
            }
            g2d.drawString("-------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Total amount:               "+sum+" Rs   ",10,y);y+=yShift;
            g2d.drawString("**************************************",10,y);y+=yShift;
            g2d.drawString("       THANK YOU COME AGAIN            ",10,y);y+=yShift;
            g2d.drawString("**************************************",10,y);y+=yShift;
            g2d.drawString("       SOFTWARE BY: SHAPITO LTD          ",10,y);y+=yShift;
            g2d.drawString("   CONTACT: shapito0786@gmail.com       ",10,y);y+=yShift;       
           

    }
    catch(Exception e){
    e.printStackTrace();
    }

              result = PAGE_EXISTS;    
          }    
          return result;    
      }
   }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PrName;
    private javax.swing.JTextField PrPrice;
    private javax.swing.JTextField PrQuantity;
    private javax.swing.JTable ProductList;
    private javax.swing.JLabel PrtotalPrice;
    private javax.swing.JButton RemoveBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton addBtn1;
    private javax.swing.JButton addBtn2;
    private javax.swing.JTable billTb;
    private javax.swing.JComboBox<String> filterCategory;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel name;
    private javax.swing.JButton printBtn;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
