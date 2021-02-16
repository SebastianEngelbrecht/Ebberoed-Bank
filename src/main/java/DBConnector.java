import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class DBConnector {


    public void Example() {
        try {
            Connection con = getConnection();

            String query = "select * from Kunde";
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                //How you want to handle the data you get from the database

            }

        } catch (Exception e) {
        System.out.println(e);

        }
    }













    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/EbberoedBank?serverTimezone=Europe/Rome", "root", "ENTER PASSWORD");
    }

}
