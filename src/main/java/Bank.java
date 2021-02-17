import java.util.ArrayList;

public class Bank {

    int bankId;
    String navn;
    String by;
    ArrayList<Customer> customerList;


    public Bank(int bankId, String navn, String by) {
        this.bankId = bankId;
        this.navn = navn;
        this.by = by;
        customerList = new ArrayList<Customer>();
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public void removeCustomer(Customer customer){
        customerList.remove(customer);
    }
}
