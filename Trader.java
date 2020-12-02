
package javaswing;


public class Trader implements Comparable<Trader>{
    private String username;
    private String password;
    private float money;
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public float getMoney() {
        return money;
    }
    public void setMoney(float money) {
        this.money = money;
    }
    @Override
    public int compareTo(Trader o) {
        return this.username.compareTo(o.username);
    }
}
