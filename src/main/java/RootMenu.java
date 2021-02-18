import java.sql.SQLException;

public class RootMenu {
    Bank bank = new Bank(0001, "Ebberød Bank", "Ebberød");
    DBConnector dbConnector = new DBConnector();
    Customer customer;
    Account account;
    public void rootMenuLoop() throws BankException, SQLException, ClassNotFoundException {

        boolean running = true;

        while (running) {
            showMenu();
            switch (Input.getInt("Vælg 1-4: ")) {
                case 1:
                    customerLogin();
                    break;
                case 2:
                    //employer();
                    break;
                case 3:
                    createCustomer();
                    break;
                case 4:
                    running = false;
                    break;
            }
        }
    }

    private void showMenu () {
        System.out.println("****** Ebberød Bank - Start menu ******");
        System.out.println("[1] Cutomer login [2] Employer [3] Create new customer [4] Afslut");
    }

    private void customerLogin () throws BankException {
        System.out.println("**** Customer login *******");
        for (Customer customer : bank.customerList) {
            System.out.println(bank.customerList.indexOf(customer) + 1 + customer.toString());
        }
        int customerId = Input.getInt("To choose a customer type customer number: ");


    }

    /*public void employer() throws BankException {
        System.out.println("**** Employee login *******");
        int amount = Input.getInt("Indtast beløb: ");
        System.out.println("the money has ben withdrawn and your current balance is: " + account.withDrawAmount(amount));
    }*/

    private void createCustomer() throws SQLException, ClassNotFoundException {
        System.out.println("**** Create new customer *******");



        String byNavn = Input.getString("Indtast dit by navn: ");
        String name = Input.getString("Indtast dit fulde navn: ");
        customer = new Customer(byNavn, name, 1, account);

        dbConnector.createCustomer(customer);
        dbConnector.createAccount(account);

    }
}
