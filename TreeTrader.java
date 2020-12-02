/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import java.sql.Statement;
import java.sql.Connection;
import java.util.Set;
import java.util.TreeMap;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.TreeSet;
/**
 *
 * @author Dell
 */
public class TreeTrader {
    
    static Trader trader ;
    static ConnectionServer conn = new ConnectionServer();
    static TreeTrader tr = new TreeTrader();
    
    public TreeMap<String,Trader> TreeMapSQL(){
        TreeMap<String,Trader> map = new TreeMap<String,Trader>();
        String sql = "Select * from [User]";
        try {
            Connection cn = conn.getConnectionSQL();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Trader t = new Trader();
                t.setUsername(rs.getString(1));
                t.setPassword(rs.getString(2));
                t.setMoney(rs.getFloat(3));
                map.put(t.getUsername(),t);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return map;
    }
    public boolean addTraderSQL(Trader t){
        String sql = "INSERT INTO [User](username,password,money)" +
        "VALUES ('" + t.getUsername() +"' , '" + t.getPassword() + "' , '" + t.getMoney()+ "')";
        try {
            Connection cn = conn.getConnectionSQL();
            Statement st = cn.createStatement();
            
            TreeMap<String,Trader> map;
            map = new TreeMap<String,Trader>();
            map = tr.TreeMapSQL();
            int size = map.size();
            
            map.put(t.getUsername(), t);
            System.out.println(size);
            System.out.println(map.size());
            if( map.size() > size){
                st.executeUpdate(sql);
                return true;
            } 
        } catch (Exception e){
            System.out.println("loi add" + e);
        }
        return false;
    }
    public TreeSet<Trader> TreeSetSQL(){
        TreeSet<Trader> set = new TreeSet<Trader>();
        String sql = "Select * from [User]";
        try {
            Connection cn = conn.getConnectionSQL();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Trader t = new Trader();
                t.setUsername(rs.getString(1));
                t.setPassword(rs.getString(2));
                t.setMoney(rs.getFloat(3));
                set.add(t);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return set;
    }
    
    public boolean CheckTreeLogin(Trader t){
        TreeSet<Trader> set = new TreeSet<Trader>();
        set = tr.TreeSetSQL();
        return set.contains(t);
    }
    public float GetMoney(String user){
        float m = 0 ;
        TreeSet<Trader> set = new TreeTrader().TreeSetSQL() ;
        for(Trader t : set){
            if(t.getUsername().equalsIgnoreCase(user)){
                m = t.getMoney();
            }
        }
        return m;
    }
    public static void main(String[] args) {
        System.out.println(new TreeTrader().TreeSetSQL());;
        
    }
    
    
    
    
    
}
