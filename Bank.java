/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

/**
 *
 * @author Dell
 */
public class Bank implements Comparable<Bank>{
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
    @Override
    public int compareTo(Bank o) {
        return this.bankAccount.compareTo(o.bankAccount);
    }
    
}
