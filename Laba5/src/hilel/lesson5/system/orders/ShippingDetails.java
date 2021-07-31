package hilel.lesson5.system.orders;

import java.math.BigDecimal;

public class ShippingDetails {
    private BigDecimal costOfShipping;
    private String adress;

    public BigDecimal getCostOfShipping() {
        return costOfShipping;
    }

    public String getAdress() {
        return adress;
    }

    public ShippingDetails(BigDecimal costOfShipping, String adress) {
        this.costOfShipping = costOfShipping;
        this.adress = adress;
    }
}
