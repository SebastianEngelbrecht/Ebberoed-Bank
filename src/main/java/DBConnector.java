import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;

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
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/EbberoedBank?serverTimezone=Europe/Rome", "root", "254736#47697234");
    }

    public int createCustomer(Customer customer) {

        try {

            Connection con = getConnection();


            String query = "insert into KUNDE(KundeId, ByNavn, Navn)" + "values(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, customer.getCustomerId());
            stmt.setString(2, customer.getByNavn());
            stmt.setString(3, customer.getName());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            int customerId = 0;
            if (rs.next()) {
                customerId = rs.getInt(1);
            }
            con.close();
            return customerId;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }






        /*public ArrayList<Customer> showAllCustomers(){

        try {
            ArrayList<Customer> customerArrayList = new ArrayList<>();
            Connection con = getConnection();
            String query = "select * from KUNDE";
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("KundeId");
                String byNavn = rs.getString("ByNavn");
                String navn = rs.getString("Navn");


                ArrayList<Pizza> orderPizzas = getPizzas(id);
                Order order = new Order();
                order.orderId = id;
                order.totalPrice = totalPrice;
                order.pickUpTime = pickUpTime;
                order.pizzas = orderPizzas;
                orders.add(order);
            }
            con.close();
            return orders;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    */

    }


}
