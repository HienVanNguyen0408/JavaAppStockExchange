/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author Dell
 */
public class History {
    private String nameStock;
    private float price ;
    private int quantity ;
    private String seller;
    private String username;

    public String getNameStock() {
        return nameStock;
    }

    public void setNameStock(String nameStock) {
        this.nameStock = nameStock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public PriorityQueue<History> GetPriorityQueueMailBox(){
        PriorityQueue<History> q = new PriorityQueue<>(new CompareNameStock1());
        String sql = "Select * from [MailBox]";
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                History h = new History();
                h.setNameStock(rs.getString(1));
                h.setPrice(rs.getFloat(2));
                h.setQuantity(rs.getInt(3)); 
                h.setSeller(rs.getString(4));
                h.setUsername(rs.getString(5));
                q.add(h);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return q;
    }
    public void AddMailBoxSQL(History h){
        String sql = "INSERT INTO [MailBox]" +
        "VALUES ('" + h.getNameStock()+"' , '" + h.getPrice()+ "' , '"+h.getQuantity() + "' , '" + h.getSeller()+ "' , '" + h.getUsername()+ "')";
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement stm = cn.createStatement();
            stm.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class CompareNameStock1 implements Comparator<History>{
    @Override
    public int compare(History s1 , History s2){
       return s1.getNameStock().compareTo(s2.getNameStock());
    }
}
