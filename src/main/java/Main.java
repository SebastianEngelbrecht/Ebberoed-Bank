
import java.sql.SQLException;
import java.util.List;



public class Main {

    public static void main(String[] args) throws BankException, SQLException, ClassNotFoundException {

            RootMenu rootMenu = new RootMenu();
            rootMenu.rootMenuLoop();
    }
}
