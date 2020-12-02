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
public class BankAccount {
    public float money;
    public String bankAccount;
    
    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
    
    
    public TreeSet<Bank> GetDataSQLToTree(){
        TreeSet<Bank> set = new TreeSet<>();
        String sql = "Select * from BankAccount";
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Bank b = new Bank();
                b.bankAccount = rs.getString(1);
                b.money = rs.getFloat(2);
                set.add(b);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return set;
    }
    public static void main(String[] args) {
        System.out.println(new BankAccount().GetDataSQLToTree());
    }
    
    
}
