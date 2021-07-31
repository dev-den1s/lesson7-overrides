package hilel.lesson5.system.orders;

public class Customer {
    private String customer_name;
    private int id_customer;

    public int getId_customer() {
        return id_customer;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public Customer(String customer_name, int id_customer) {
        this.customer_name = customer_name;
        this.id_customer = id_customer;
    }
}
