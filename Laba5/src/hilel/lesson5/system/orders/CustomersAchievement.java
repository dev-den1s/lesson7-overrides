package hilel.lesson5.system.orders;

import java.math.BigDecimal;

public class CustomersAchievement {
    private BigDecimal total_price_o;
    private BigDecimal total_price_ship;

    public CustomersAchievement() {
        this.total_price_o = BigDecimal.ZERO;
        this.total_price_ship = BigDecimal.ZERO;
    }

    public CustomersAchievement(BigDecimal total_price_o, BigDecimal total_price_ship) {
        this.total_price_o = this.getTotal_price_o().add(total_price_o);
        this.total_price_ship = this.getGetTotal_price_ship().add(total_price_ship);
    }

    public void setAll(BigDecimal a, BigDecimal b) {
        this.total_price_o = a;
        this.total_price_ship = b;
    }

    public BigDecimal getTotal_price_o() {
        return total_price_o;
    }

    public BigDecimal getGetTotal_price_ship() {
        return total_price_ship;
    }

    // set total earnings for orders and for shipping
    public void addToTotalPrice(Order order) {
        BigDecimal priceO = BigDecimal.ZERO;
        BigDecimal priceShip = BigDecimal.ZERO;
        // set total earnings for orders

        for (Product product :
                order.getProduct()) {
            priceO = priceO.add(product.getCost());
        }
        this.total_price_o = this.total_price_o.add(priceO);

        //set total earnings for shipping
        if (order.getDetails() != null) {
            priceShip = priceShip.add(order.getDetails().getCostOfShipping());
        }
        this.total_price_ship = this.total_price_ship.add(priceShip);
    }

}
