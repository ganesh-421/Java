import java.sql.*;

public class Update {
    static final String DB_URL = "jdbc:mysql://localhost:3306/Employee";
    static final String USER = "ganesh";
    static final String PASS = "gunace123";
    static final String QUERY = "SELECT * FROM emp";

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        ) {
            String sql = "UPDATE emp SET age = 19 WHERE id = 4 ";
            stmt.executeUpdate(sql);
            ResultSet rs = stmt.executeQuery(QUERY);
            while(rs.next()){
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("First Name: " + rs.getString("fname"));
                System.out.println("Last Name: " + rs.getString("lname"));
                System.out.println("Age: " + rs.getInt("age"));

            }
            rs.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
}
