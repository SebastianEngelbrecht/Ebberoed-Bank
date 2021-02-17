import java.util.Objects;

public class Customer {

    private int customerId;
    private String byNavn;
    private String name;

    public Customer(int customerId, String byNavn, String name) {
        this.customerId = customerId;
        this.byNavn = byNavn;
        this.name = name;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getByNavn() {
        return byNavn;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getName(), customer.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "name: " + name + "\n";
    }
}
