/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.TreeSet;
import javaswing.TypeStock;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Admin extends javax.swing.JFrame {
    static TypeStock st = new TypeStock();
    private static DefaultTableModel defaultTableModel = new DefaultTableModel();
    
    public void AddTable(){
        
        TreeSet<String> set = new TreeSet<>();
        tb_ListTypeStock.setModel(defaultTableModel);
        defaultTableModel.addColumn("Name");
        set = st.TreeSetSQLTypeStock();
        for(String name : set){
            String data[] = new String[1];
            data[0] = name; 
            defaultTableModel.addRow(data);
        }  
    }
    public Admin() {
        TreeSet<String> set = new TreeSet<>();
        initComponents();
        this.AddTable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        btn_AddTypeStock = new java.awt.Button();
        label2 = new java.awt.Label();
        txt_TypeStock = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_ListTypeStock = new javax.swing.JTable();
        lb_ListStock = new java.awt.Label();
        btn_Delete = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");

        jPanel1.setBackground(new java.awt.Color(182, 175, 175));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setText("ADMIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        btn_AddTypeStock.setLabel("ADD");
        btn_AddTypeStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddTypeStockActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label2.setText("Name");

        txt_TypeStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TypeStockActionPerformed(evt);
            }
        });

        tb_ListTypeStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_ListTypeStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ListTypeStockMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_ListTypeStock);

        lb_ListStock.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb_ListStock.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lb_ListStock.setText("List Stock");

        btn_Delete.setLabel("DELETE");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_AddTypeStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_TypeStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_ListStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lb_ListStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_TypeStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_AddTypeStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_TypeStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TypeStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TypeStockActionPerformed

    private void btn_AddTypeStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddTypeStockActionPerformed
        //TODO add your handling code here:
        TreeSet<String> set = new TreeSet<>();
        
        String name = txt_TypeStock.getText();
        if(st.AddStockSQLTypeStock(name)){
            set = st.TreeSetSQLTypeStock();
            defaultTableModel.setRowCount(0);
            for(String a : set){
                String data[] = new String[1];
                data[0] = a; 
                defaultTableModel.addRow(data);
            }
            
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Add success " + name + " done");
        }
        txt_TypeStock.setText("");
    }//GEN-LAST:event_btn_AddTypeStockActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        // TODO add your handling code here:
        TreeSet<String> set = new TreeSet<String>();
        String name = txt_TypeStock.getText();
        TypeStock stock = new TypeStock();
        if(stock.DeleteStockSQLTypeStock(name)){
            set = stock.TreeSetSQLTypeStock();
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Deleted "+name+" done");
            defaultTableModel.setRowCount(0);
            for(String a : set){
                String data[] = new String[1];
                data[0] = a; 
                defaultTableModel.addRow(data);
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Not exsist " + name +" in list");
        }
        txt_TypeStock.setText("");
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void tb_ListTypeStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ListTypeStockMouseClicked
        // TODO add your handling code here:
        int index = tb_ListTypeStock.getSelectedRow();
        TableModel model = tb_ListTypeStock.getModel();
        String nameS = model.getValueAt(index,0).toString();
        javax.swing.JOptionPane.showMessageDialog(null, "Type Stock : " + nameS );
    }//GEN-LAST:event_tb_ListTypeStockMouseClicked

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_AddTypeStock;
    private java.awt.Button btn_Delete;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label lb_ListStock;
    private javax.swing.JTable tb_ListTypeStock;
    private java.awt.TextField txt_TypeStock;
    // End of variables declaration//GEN-END:variables
}
