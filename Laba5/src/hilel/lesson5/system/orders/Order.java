package hilel.lesson5.system.orders;

import java.time.LocalDate;

public class Order {
    private Product[] products;
    private Customer customer;
    private ShippingDetails details;
    private LocalDate date;
    private OrderStatus status;
    private int id_order;

    public Order(Product[] product, Customer customer, ShippingDetails details, LocalDate date, OrderStatus status, int id) {
        this.products = product;
        this.customer = customer;
        this.details = details;
        this.date = date;
        this.status = status;
        this.id_order = id;
    }

    public Product[] getProduct() {
        return products;
    }

    public void setProduct(Product[] product) {
        this.products = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ShippingDetails getDetails() {
        return details;
    }

    public void setDetails(ShippingDetails details) {
        this.details = details;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public int getId() {
        return id_order;
    }

    public void setId(int id) {
        this.id_order = id;
    }
}
