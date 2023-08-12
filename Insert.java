import java.sql.*;

public class Insert {
    static final String DB_URL = "jdbc:mysql://localhost:3306/Employee";
    static final String USER = "ganesh";
    static final String PASS = "gunace123";

    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = con.createStatement();
        ){
            System.out.println("-------------------Inserting into emp table");
            String sql = "INSERT INTO emp VALUES (1,9,'Ravi','Sharma', 8)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO emp VALUES (2, 11,'Sita','Subedi', 2)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO emp VALUES (3, 12,'Hari','Poudel', 3)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO emp VALUES (4, 13,'Rita','Shahi', 4)";
            stmt.executeUpdate(sql);
            System.out.println("--------------------Inserted successfully!");


        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
