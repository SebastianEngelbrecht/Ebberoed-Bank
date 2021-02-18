import java.util.Objects;

public class Customer {

    private int customerId;
    private String byNavn;
    private String name;
    private int bankId;
    private int kontoId;

    public Customer(String byNavn, String name, int bankId, int kontoID) {
        this.byNavn = byNavn;
        this.name = name;
        this.bankId = bankId;
        this.kontoId = kontoID;
    }

    public int getBankId() {
        return bankId;
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

    public int getKontoId() {
        return kontoId;
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
