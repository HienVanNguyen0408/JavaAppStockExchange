package javaswing;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnectionServer {

    Connection conn = null;
    public Connection getConnectionSQL(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=StockExchange;username=VanHien;password=VanHien");
            System.out.println("success");
        } catch (Exception e) {
            System.out.println("fail "+ e);
        }
        return conn;
    }
    public void ConnectionSQL(String sql){
        ConnectionServer conn = new ConnectionServer();
        try {
            Connection cn = conn.getConnectionSQL();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                System.out.println("UserName : " + rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println("fail " + e);
        }
    }
    public static void main(String[] args) throws SQLException {
        String sql = "select * from Stock";
        new ConnectionServer().ConnectionSQL(sql);
//          ConnectionServer conn = new ConnectionServer();
//          Connection cnn = conn.getConnection();
//          Statement st = cnn.createStatement();
//          
//          String sql =  "INSERT INTO [User] " + "VALUES ('5','3',14)";
//          st.executeUpdate(sql);
          
            
    }

    

  
   
}
