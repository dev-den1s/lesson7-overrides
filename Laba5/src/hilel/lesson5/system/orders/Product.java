package hilel.lesson5.system.orders;
import java.math.BigDecimal;

public class Product {
    private BigDecimal cost;
    private String product_name;
    private int id_product;

    public Product(BigDecimal cost, String product_name, int id_product) {
        this.cost = cost;
        this.product_name = product_name;
        this.id_product = id_product;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getName() {
        return product_name;
    }

    public void setName(String product_name) {
        this.product_name = product_name;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }
}
