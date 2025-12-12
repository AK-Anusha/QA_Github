package DB_tests;

import java.sql.*;
import org.testng.annotations.Test;

public class DatabaseValidation {

    @Test
    public void validateUsers() throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM users");
        if(rs.next()) {
            System.out.println("User count: " + rs.getInt(1));
        }
        con.close();
    }
}
