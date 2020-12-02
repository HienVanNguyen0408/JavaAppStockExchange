/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import static View.Login.username;
import java.sql.Connection;
import java.sql.Statement;
import java.util.TreeSet;
import javaswing.ConnectionServer;
import javaswing.TypeStock;
import java.util.Comparator;
import java.util.PriorityQueue;
import javaswing.History;
import javaswing.Stock;

import javaswing.Trader;
import javaswing.TreeTrader;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class Home extends javax.swing.JFrame {
    static ConnectionServer conn = new ConnectionServer();
    private static DefaultTableModel defaultTableModel1 = new DefaultTableModel();
    private static DefaultTableModel defaultTableModel2 = new DefaultTableModel();
    public Home() {
        initComponents();
        this.ShowMoneyUser();
        
        this.AddItemComboBox();
        this.AddItemComboBox1();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_Money = new java.awt.Label();
        lb_Username = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_ListBuyStock = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        cb_listSell = new javax.swing.JComboBox<>();
        button3 = new java.awt.Button();
        button1 = new java.awt.Button();
        btn_AddStock = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_ListSellStock1 = new javax.swing.JTable();
        cb_ListBuyStock = new javax.swing.JComboBox<>();
        btn_Buy = new java.awt.Button();
        btn_Sell = new java.awt.Button();
        btn_BuyAuto = new java.awt.Button();
        button2 = new java.awt.Button();
        btn_Update = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_Money.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lb_Money.setName(""); // NOI18N

        lb_Username.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        tb_ListBuyStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tb_ListBuyStock);

        jPanel2.setBackground(new java.awt.Color(240, 170, 180));

        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setText("Stock Exchange");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        cb_listSell.setName(""); // NOI18N
        cb_listSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ListSellActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(240, 240, 240));
        button3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button3.setLabel("Logout");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout(evt);
            }
        });

        button1.setActionCommand("Stock");
        button1.setBackground(new java.awt.Color(240, 240, 240));
        button1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button1.setLabel("Add Money");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        btn_AddStock.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_AddStock.setLabel("Add Stock");
        btn_AddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddStockActionPerformed(evt);
            }
        });

        tb_ListSellStock1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_ListSellStock1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ListSellStock1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_ListSellStock1);

        cb_ListBuyStock.setName(""); // NOI18N
        cb_ListBuyStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ListBuyStockActionPerformed(evt);
            }
        });

        btn_Buy.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_Buy.setLabel("Buy");
        btn_Buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuyActionPerformed(evt);
            }
        });

        btn_Sell.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_Sell.setLabel("Sell");
        btn_Sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SellActionPerformed(evt);
            }
        });

        btn_BuyAuto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_BuyAuto.setLabel("Buy Auto");
        btn_BuyAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuyAutoActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button2.setLabel("History");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        btn_Update.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_Update.setLabel("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lb_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lb_Money, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Buy, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_AddStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Sell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_BuyAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_ListBuyStock, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cb_listSell, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_Money, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_ListBuyStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_listSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(btn_AddStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Sell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_BuyAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Buy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))))
        );

        button1.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        this.dispose();
        new AddMoney().setVisible(true);
    }//GEN-LAST:event_button1ActionPerformed
    // button logout
    private void btnLogout(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
        
    }//GEN-LAST:event_btnLogout
    
    //button add stock
    private void btn_AddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddStockActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AddStock().setVisible(true);
    }//GEN-LAST:event_btn_AddStockActionPerformed
    //combobox list buy
    private void cb_ListBuyStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ListBuyStockActionPerformed
        // TODO add your handling code here:
        String item = (String)cb_ListBuyStock.getSelectedItem();
        defaultTableModel2.setColumnCount(0);
        defaultTableModel2.setRowCount(0);
        this.AddTableListBuy(item);
    }//GEN-LAST:event_cb_ListBuyStockActionPerformed
    
    //combobox list sell
    private void cb_ListSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ListSellActionPerformed
        // TODO add your handling code here:
        String item = (String)cb_listSell.getSelectedItem();
        defaultTableModel1.setColumnCount(0);
        defaultTableModel1.setRowCount(0);
        this.AddTableListSell(item);
        
    }//GEN-LAST:event_cb_ListSellActionPerformed

    //buttom buy auto
    private void btn_BuyAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuyAutoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new BuyAuto().setVisible(true);
    }//GEN-LAST:event_btn_BuyAutoActionPerformed
    
    //button sell
    private void btn_SellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SellActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Sell().setVisible(true);
    }//GEN-LAST:event_btn_SellActionPerformed

    
    // button buy 
    private void btn_BuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuyActionPerformed
        // TODO add your handling code here:
        PriorityQueue<Stock> queue = new PriorityQueue<>(new CompareIncresePrice());
        queue = new Stock().GetPriorityQueueListSell();
        for(Stock st : queue){
            String s = st.getName()+"##"+st.getPrice()+"##"+st.getQuantity()+"##"+st.getUsername();
            if(s.equalsIgnoreCase(data)){
                if(money >= st.getPrice() * st.getQuantity()){
                   javax.swing.JOptionPane.showMessageDialog(rootPane, money +" > " + st.getPrice() * st.getQuantity() +": Buy Success" ); 
                   this.UpdateMoneySeller(st);
                   money = money - st.getPrice() * st.getQuantity();
                   lb_Money.setText(String.valueOf(money));
                   st.setUsername(username);
                   this.UpdateMoneyBuyer(st);
                   this.UpdateListSell();
                   this.UpdateStock(st);
                   // them lich su
                   History h = new History();
                   h.setNameStock(st.getName());
                   h.setPrice(st.getPrice());
                   h.setQuantity(st.getQuantity());
                   h.setSeller(user);
                   h.setUsername(username);
                   new History().AddMailBoxSQL(h);
                   
                }else{
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Money Not enough" ); 
                }
            }       
        }
        this.UpdateTableSell();
    }//GEN-LAST:event_btn_BuyActionPerformed

    private void tb_ListSellStock1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ListSellStock1MouseClicked
        // TODO add your handling code here:
        int index = tb_ListSellStock1.getSelectedRow();
        TableModel model = tb_ListSellStock1.getModel();
        String nameS = model.getValueAt(index,0).toString();
        String price = model.getValueAt(index,1).toString();
        String quantity = model.getValueAt(index,2).toString();
        String username = model.getValueAt(index,3).toString();
        data = nameS+"##"+price+"##"+quantity+"##"+username;
        user = username;
        javax.swing.JOptionPane.showMessageDialog(null, "Name Stock:"+nameS+"\nPrice: "+price+"\nQuantity: "+quantity +"\nUsername : "+username);
    }//GEN-LAST:event_tb_ListSellStock1MouseClicked

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // TODO add your handling code :
        new BuyAuto().ConditionBuyAuto();
        new Stock().DeleteListBuySQLZero();
        new Stock().DeleteListSellSQLZero();
        this.UpdateTableSell();
        this.UpdateTableBuy();
        money = new TreeTrader().GetMoney(username);
        lb_Money.setText(String.valueOf(money)+"$");
               
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MailBox().setVisible(true);
    }//GEN-LAST:event_button2ActionPerformed
    private void UpdateTableSell(){
        defaultTableModel1.setRowCount(0);
        PriorityQueue<Stock> q1 = new PriorityQueue<>(new CompareIncresePrice()); 
        q1 = new Stock().GetPriorityQueueListSell();
        for(Stock st : q1){
            String data1[] = new String[4];
            data1[0] = st.getName();
            data1[1] = String.valueOf(st.getPrice());
            data1[2] = String.valueOf(st.getQuantity());
            data1[3] = st.getUsername();
            defaultTableModel1.addRow(data1); 
        }
    }
    private void UpdateTableBuy(){
        defaultTableModel2.setRowCount(0);
        PriorityQueue<Stock> q2 = new PriorityQueue<>(new CompareReducePrice()); 
        q2 = new Stock().GetPriorityQueueListBuy();
        for(Stock st : q2){
            String data1[] = new String[4];
            data1[0] = st.getName();
            data1[1] = String.valueOf(st.getPrice());
            data1[2] = String.valueOf(st.getQuantity());
            data1[3] = st.getUsername();
            defaultTableModel2.addRow(data1); 
        }
    }
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Home().setVisible(true);
            }
        });
    }
    private void AddItemComboBox(){
        cb_listSell.addItem("All");
        TypeStock st = new TypeStock();
        TreeSet<String> set = new TreeSet<>();
        set = st.TreeSetSQLTypeStock();
        for(String name : set){
           cb_listSell.addItem(name); 
        }
    }
    private void AddItemComboBox1(){
        cb_ListBuyStock.addItem("All");
        TypeStock st = new TypeStock();
        TreeSet<String> set = new TreeSet<>();
        set = st.TreeSetSQLTypeStock();
        for(String name : set){
           cb_ListBuyStock.addItem(name); 
        }
    }
    private void AddTableListSell(String s){
        PriorityQueue<Stock> queue = new PriorityQueue<>(new CompareIncresePrice()); 
        queue = new Stock().GetPriorityQueueListSell();
        tb_ListSellStock1.setModel(defaultTableModel1);
        
        defaultTableModel1.addColumn("Name");
        defaultTableModel1.addColumn("Price");
        defaultTableModel1.addColumn("Quantity");
        defaultTableModel1.addColumn("Username");

        while(queue.size() > 0){
            Stock a = queue.poll();
            if(s.equalsIgnoreCase("All")){
                String data1[] = new String[4];
                data1[0] = a.getName();
                data1[1] = String.valueOf(a.getPrice());
                data1[2] = String.valueOf(a.getQuantity());
                data1[3] = a.getUsername();
                defaultTableModel1.addRow(data1);  
            }
            if(s.equalsIgnoreCase(a.getName())){
                String data1[] = new String[4];
                data1[0] = a.getName();
                data1[1] = String.valueOf(a.getPrice());
                data1[2] = String.valueOf(a.getQuantity());
                data1[3] = a.getUsername();
                defaultTableModel1.addRow(data1);    
            }
        }
    }
    private void AddTableListBuy(String s){
        PriorityQueue<Stock> queue = new PriorityQueue<>(new CompareReducePrice()); 
        queue = new Stock().GetPriorityQueueListBuy();
        tb_ListBuyStock.setModel(defaultTableModel2);
        defaultTableModel2.addColumn("Name");
        defaultTableModel2.addColumn("Price");
        defaultTableModel2.addColumn("Quantity");
        defaultTableModel2.addColumn("Username");

        while(queue.size() > 0){
            Stock a = queue.poll();
            if(s.equalsIgnoreCase("All")){
                String data1[] = new String[4];
                data1[0] = a.getName();
                data1[1] = String.valueOf(a.getPrice());
                data1[2] = String.valueOf(a.getQuantity());
                data1[3] = a.getUsername();
                defaultTableModel2.addRow(data1);  
            }
            if(s.equalsIgnoreCase(a.getName())){
                String data1[] = new String[4];
                data1[0] = a.getName();
                data1[1] = String.valueOf(a.getPrice());
                data1[2] = String.valueOf(a.getQuantity());
                data1[3] = a.getUsername();
                defaultTableModel2.addRow(data1);    
            }
        }
    }
    private void ShowMoneyUser(){
        TreeSet<Trader> set = new TreeTrader().TreeSetSQL();
        for( Trader t : set){
            if(t.getUsername().equalsIgnoreCase(username)){
                money = t.getMoney();
                lb_Money.setText(String.valueOf(money+"$"));
                lb_Username.setText(username);
            }
        }
    }
    
    public void UpdateStock(Stock st){
        if(new Stock().CheckStock(st)){
            new Stock().UpdateStockSQL(st);
        }else{
            st.setUsername(username);
            new Stock().AddStockSQL(st);
        }
    }
    
    private Stock GetStockOder(){
        PriorityQueue<Stock> q = new PriorityQueue<>(new CompareIncresePrice());
        q = new Stock().GetPriorityQueueListSell();
        for(Stock st : q){
            String s = st.getName()+"##"+st.getPrice()+"##"+st.getQuantity()+"##"+st.getUsername();
            if(s.equalsIgnoreCase(data)){
               return st;
            }
        }
        return null;
    }
    private void UpdateListSell(){
       new Stock().DeleteListSellSQL(GetStockOder());
    }
        
    public void UpdateListBuy(){
    }
    private void UpdateMoneySeller(Stock st){
        String sql = "update [User] set Money +="+ st.getPrice() * st.getQuantity()+ "where username = '" + st.getUsername()+"'";                                                    
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement stm = cn.createStatement();
            stm.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private void UpdateMoneyBuyer(Stock st){
        String sql = "update [User] set Money -="+ st.getPrice() * st.getQuantity()+ "where username = '" + st.getUsername()+"'";                                                    
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement stm = cn.createStatement();
            stm.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    private static float money;
    private static String data;
    private static String user;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_AddStock;
    private java.awt.Button btn_Buy;
    private java.awt.Button btn_BuyAuto;
    private java.awt.Button btn_Sell;
    private java.awt.Button btn_Update;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private javax.swing.JComboBox<String> cb_ListBuyStock;
    private javax.swing.JComboBox<String> cb_listSell;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private java.awt.Label lb_Money;
    private java.awt.Label lb_Username;
    private javax.swing.JTable tb_ListBuyStock;
    private javax.swing.JTable tb_ListSellStock1;
    // End of variables declaration//GEN-END:variables

    
    
// buy : 

}
class CompareIncresePrice implements Comparator<Stock>{
    @Override
    public int compare(Stock s1 , Stock s2){
       if( s1.getPrice() > s2.getPrice()){
          return 1; 
       }else if(s1.getPrice() < s2.getPrice()) return -1 ;
       else return 0;
    }
}
class CompareReducePrice implements Comparator<Stock>{
    @Override
    public int compare(Stock s1 , Stock s2){
       if( s1.getPrice() < s2.getPrice()){
          return 1; 
       }else if(s1.getPrice() > s2.getPrice()) return -1 ;
       else return 0;
    }
}



