/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;
import View.BuyAuto;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author Dell
 */
public class Stock implements Comparable<Stock>{
    private String name;
    private float price;
    private int quantity;
    private String username;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Override
    public int compareTo(Stock o) {
        return this.username.compareTo(o.username);
    }
    public HashMap<String,PriorityQueue<Stock>> GetSQLToHashMapListSell(){
        HashMap<String,PriorityQueue<Stock>> map = new HashMap<>();
        String sql = "Select * from [ListSell]";
        TreeSet<String> set = new TypeStock().TreeSetSQLTypeStock();
        ConnectionServer conn = new ConnectionServer();
        try {
            for(String nameStock : set){
                PriorityQueue<Stock> q = new PriorityQueue<>(new CompareIncresePrice1());
                Connection cn = conn.getConnectionSQL();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    Stock s = new Stock();
                    s.setName(rs.getString(1));
                    s.setPrice(rs.getFloat(2));
                    s.setQuantity(rs.getInt(3));
                    s.setUsername(rs.getString(4));
                    String a = s.getName();
                    if(a.equalsIgnoreCase(nameStock)){
                        q.add(s);
                    }
                }
                map.put(nameStock, q);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return map;
    } 
    public HashMap<String,PriorityQueue<Stock>>  GetSQLToHashMapListBuy(){
        HashMap<String,PriorityQueue<Stock>> map = new HashMap<>();
        String sql = "Select * from [ListBuy]";
        TreeSet<String> set = new TypeStock().TreeSetSQLTypeStock();
        ConnectionServer conn = new ConnectionServer();
        try {
            for(String nameStock : set){
                PriorityQueue<Stock> q = new PriorityQueue<>(new CompareReducePrice1());
                Connection cn = conn.getConnectionSQL();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    Stock s = new Stock();
                    s.setName(rs.getString(1));
                    s.setPrice(rs.getFloat(2));
                    s.setQuantity(rs.getInt(3));
                    s.setUsername(rs.getString(4));
                    String a = s.getName();
                    if(a.equalsIgnoreCase(nameStock)){
                        q.add(s);
                    }
                }
                map.put(nameStock, q);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return map;
    }
    
    public PriorityQueue<Stock> GetPriorityQueueStock(){
        PriorityQueue<Stock> q = new PriorityQueue<>(new CompareNameStock());
        String sql = "Select * from [Stock]";
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Stock s = new Stock();
                s.setName(rs.getString(1));
                s.setQuantity(rs.getInt(2));
                s.setUsername(rs.getString(3));
                q.add(s);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return q;
    }
    public PriorityQueue<Stock> GetPriorityQueueListSell(){
        PriorityQueue<Stock> q = new PriorityQueue<>(new CompareIncresePrice1());
        String sql = "Select * from [ListSell]";
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Stock s = new Stock();
                s.setName(rs.getString(1));
                s.setPrice(rs.getFloat(2));
                s.setQuantity(rs.getInt(3));
                s.setUsername(rs.getString(4));
                q.add(s);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return q;
    }
    public PriorityQueue<Stock> GetPriorityQueueListBuy(){
        PriorityQueue<Stock> q = new PriorityQueue<>(new CompareReducePrice1());
        String sql = "Select * from [Listbuy]";
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Stock s = new Stock();
                s.setName(rs.getString(1));
                s.setPrice(rs.getFloat(2));
                s.setQuantity(rs.getInt(3));
                s.setUsername(rs.getString(4));
                q.add(s);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return q;
    }
    public TreeSet<Stock> GetTreeSetStock(){
        TreeSet<Stock> set = new TreeSet<>();
        String sql = "Select * from [Stock]";
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Stock s = new Stock();
                s.setName(rs.getString(1));
                s.setQuantity(rs.getInt(2));
                s.setUsername(rs.getString(3));
                set.add(s);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return set;
    }
    
    //////---------------------------------------------------------------------------------------------
    public void AddStockSQL(Stock st){
        String sql = "INSERT INTO [Stock]" +
        "VALUES ('" + st.getName()+"' , '" + st.getQuantity()+ "' , '"+st.getUsername()+ "')";
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement stm = cn.createStatement();
            stm.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    } 
    public void UpdateStockSQL(Stock st){
        String sql = "update [Stock] set quantity +="+ st.getQuantity() + "where namestock = '" + st.getName() 
                                                                       +"' and username = '"+st.getUsername()+"'";
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement stm = cn.createStatement();
            stm.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void DeleteStockSQLStock(Stock s){
        String sql = "delete [Stock] where namestock = '"+s.getName()+"' and quantity='" 
                        + s.getQuantity()+"' and username='" 
                        + s.getUsername()+"'" ;
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement st = cn.createStatement(); 
            st.executeUpdate(sql);
        } catch (Exception e){
            System.out.println("loi delete" + e);
        }
    }
    //////////////////////---------------------------------------------------------------------
    public void AddListSellSQL(Stock st){
        String sql = "INSERT INTO [ListSell]" +
        "VALUES ('" + st.getName()+"' , '" + st.getPrice()+"' , '" +st.getQuantity()+ "' , '"+st.getUsername()+ "')";
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement stm = cn.createStatement();
            stm.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Loi Insert Listsell " + e);
        }
    } 
    public void UpdateListSellSQL(Stock st){
        String sql = "update [ListSell] set quantity +="+ st.getQuantity() + "where namestock = '" + st.getName()
                                                                            +"' and username = '"+st.getUsername()
                                                                             +"' and price = '"+st.getPrice()+"'";
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement stm = cn.createStatement();
            stm.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Loi update listsell " + e);
        }
    }
    public void UpdateListSellSQL1(Stock st){
        String sql = "update [ListSell] set quantity -="+ st.getQuantity() + "where namestock = '" + st.getName()
                                                                            +"' and username = '"+st.getUsername()
                                                                             +"' and price = '"+st.getPrice()+"'";
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement stm = cn.createStatement();
            stm.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Loi update listsell " + e);
        }
    }
    public void DeleteListSellSQL(Stock s){
            String sql = "delete [ListSell] where namestock = '"+s.getName()+"' and price='"
                        +s.getPrice()+"' and quantity='"  
                        + s.getQuantity()+"' and username='" 
                        + s.getUsername()+"'" ;
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement st = cn.createStatement(); 
            st.executeUpdate(sql);
        } catch (Exception e){
            System.out.println("loi delete" + e);
        }
    }
///---------------------------------------------------------------------------------------------
    public void AddListBuySQL(Stock st){
        String sql = "INSERT INTO [ListBuy]" +
        "VALUES ('" + st.getName()+"' , '" + st.getPrice()+"' , '" +st.getQuantity()+ "' , '"+st.getUsername()+ "')";
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement stm = cn.createStatement();
            stm.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Loi Insert ListBuy " + e);
        }
    } 
    public void UpdateListBuySQL(Stock st){
        String sql = "update [ListBuy] set quantity +="+ st.getQuantity() + "where namestock = '" + st.getName()
                                                                            +"' and username = '"+st.getUsername()
                                                                             +"' and price = '"+st.getPrice()+"'";
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement stm = cn.createStatement();
            stm.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Loi update ListBuy " + e);
        }
    }
    public void UpdateListBuySQL1(Stock st){
        String sql = "update [ListBuy] set quantity -="+ st.getQuantity() + "where namestock = '" + st.getName()
                                                                            +"' and username = '"+st.getUsername()
                                                                             +"' and price = '"+st.getPrice()+"'";
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement stm = cn.createStatement();
            stm.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Loi update ListBuy " + e);
        }
    } 
    public void DeleteListBuySQL(Stock s){
        String sql = "delete [ListBuy] where namestock = '"+s.getName()+"' and price='"
                        +s.getPrice()+"' and quantity='"  
                        + s.getQuantity()+"' and username='" 
                        + s.getUsername()+"'";
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement st = cn.createStatement(); 
            st.executeUpdate(sql);
        } catch (Exception e){
            System.out.println("loi delete ListBuy" + e);
        }
    }
    /////////////////////////////-----------------------------------------------------------
    public boolean CheckStock(Stock st){
        PriorityQueue<Stock> q = new PriorityQueue<>();
        q = new Stock().GetPriorityQueueStock();
        while(q.size() > 0){
            Stock s = q.poll();
            if(s.getName().equalsIgnoreCase(st.getName()) && s.getUsername().equalsIgnoreCase(st.getUsername())){
                return true;
            }
        }
        return false;
    }
    public void UpdateMoneySeller(Stock st){
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
    public void UpdateMoneyBuyer(Stock st){
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
    public void DeleteListBuySQLZero(){
            String sql = "delete [ListBuy] where quantity = '"+0+"'"; 
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement st = cn.createStatement(); 
            st.executeUpdate(sql);
        } catch (Exception e){
            System.out.println("loi delete" + e);
        }
    }
    public void DeleteListSellSQLZero(){
            String sql = "delete [ListSell] where quantity = '"+0+"'"; 
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement st = cn.createStatement(); 
            st.executeUpdate(sql);
        } catch (Exception e){
            System.out.println("loi delete" + e);
        }
    }
    public void UpdateAgainStock(){
        String sql = "update [Stock] set quantity +="+ 0 + "where namestock = '" + 0                                                        +"' and username = '"+0+"'";
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement stm = cn.createStatement();
            stm.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        Stock st = new Stock(); 
    }
    
}
class CompareIncresePrice1 implements Comparator<Stock>{
    @Override
    public int compare(Stock s1 , Stock s2){
       if( s1.getPrice() > s2.getPrice()){
          return 1; 
       }else if(s1.getPrice() < s2.getPrice()) return -1 ;
       else return 0;
    }
}
class CompareReducePrice1 implements Comparator<Stock>{
    @Override
    public int compare(Stock s1 , Stock s2){
       if( s1.getPrice() < s2.getPrice()){
          return 1; 
       }else if(s1.getPrice() > s2.getPrice()) return -1 ;
       else return 0;
    }
}
class CompareNameStock implements Comparator<Stock>{
    @Override
    public int compare(Stock s1 , Stock s2){
       return s1.getName().compareTo(s2.getName());
    }
}

