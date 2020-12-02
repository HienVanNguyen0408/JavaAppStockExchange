
package javaswing;
import java.sql.Connection;
import java.util.TreeSet;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class TypeStock {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public TreeSet<String> TreeSetSQLTypeStock(){
        TreeSet<String> set = new TreeSet<>();
        String sql = "Select * from [TypeStock]";
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String name = rs.getString(1);
                set.add(name);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return set;
    }
    public boolean AddStockSQLTypeStock(String t){
        String sql = "INSERT INTO [TypeStock]" +
        "VALUES ('" + t + "')";
        ConnectionServer conn = new ConnectionServer();
        TreeSet<String> set = new TreeSet<>();
        TypeStock stock = new TypeStock();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement st = cn.createStatement(); 
            set = stock.TreeSetSQLTypeStock();
            if(!set.contains(t)){
                st.executeUpdate(sql);
                return true;
            }
        } catch (Exception e){
            System.out.println("loi add" + e);
        }
        return false; 
    }

    public boolean DeleteStockSQLTypeStock(String t){
        String sql = "delete [TypeStock] where namestock = '"+t+"'";
        ConnectionServer conn = new ConnectionServer();
        TreeSet<String> set = new TreeSet<>();
        TypeStock stock = new TypeStock();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement st = cn.createStatement(); 
            set = stock.TreeSetSQLTypeStock();
            if(set.contains(t) && !"".equals(t)){
                st.executeUpdate(sql);
                return true;
            }
        } catch (Exception e){
            System.out.println("loi add" + e);
        }
        return false; 
    }
    public boolean CheckNameStock(String name){
        TreeSet<String> set = new TreeSet<>();
        set = new TypeStock().TreeSetSQLTypeStock();
        return set.contains(name);
    }
}
