public class MainMenu {

    Customer customer;
    Account account = new Account(customer);

    public void mainMenuLoop() throws BankException {
        boolean running = true;

        while (running) {
            showMenu();
            switch (Input.getInt("Vælg 1-5: ")) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    showTransactions();
                    break;
                case 4:
                    showBalance();
                    break;
                case 5:
                    running = false;
                    break;
            }

        }
    }

    private void showMenu () {
        System.out.println("****** Ebberød Bank - Menu ******");
        System.out.println("[1] deposit [2] withdraw [3] ShowTransactions [4] ShowBalance [5] Afslut");
    }

    private void deposit () throws BankException {
        System.out.println("**** Deposit money *******");
        int amount = Input.getInt("Indtast beløb: ");
        System.out.println("the money has ben deposited and your current balance is: " + account.depositAmount(amount));
    }

    public void withdraw() throws BankException {
        System.out.println("**** Wtihdraw money *******");
        int amount = Input.getInt("Indtast beløb: ");
        System.out.println("the money has ben withdrawn and your current balance is: " + account.withDrawAmount(amount));
    }

    private void showTransactions() {
        System.out.println("**** Show transactions *******");

        System.out.println(account.getTransactions().toString());

    }

    private void showBalance(){
        System.out.println("**** Show balance *******");
        System.out.println("your current balance is: " + account.getBalance());

    }
}