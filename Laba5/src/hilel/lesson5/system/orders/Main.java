package hilel.lesson5.system.orders;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Order[] orders = getOrdersArray();

        OrderPrinter printer = new OrderPrinter();
        //ex1
        //System.out.println(printer.printOrders(orders));

        //ex2
        //System.out.println(printer.printOrdersWaitedForDelivery(orders));

        //ex3
        // System.out.println(printer.getProductsAndQuantity(orders));

        //ex4
        System.out.println(printer.printCustomersEarnings(orders));

    }

    public static Order[] getOrdersArray() {
        Product[] product_warehouse = new Product[2];
        product_warehouse[0] = new Product(BigDecimal.valueOf(15.00), "Shoes Martens", 1);
        product_warehouse[1] = new Product(BigDecimal.valueOf(15.00), "Red Glass", 2);

        //order 1
        Product[] products1 = new Product[2];
        products1[0] = product_warehouse[0];
        products1[1] = product_warehouse[1];

        Customer customer1 = new Customer("Denis", 1);
        ShippingDetails shippingDetails1 = new ShippingDetails(BigDecimal.valueOf(5.00), "Nowoursynowska 161B");
        LocalDate date1 = LocalDate.now();
        Order order1 = new Order(products1, customer1, shippingDetails1, date1, OrderStatus.WaitingForDelivery, 1);

        //order 2
        Product[] products2 = new Product[1];
        products2[0] = product_warehouse[0];
        Customer customer2 = new Customer("Vadim", 7);
        ShippingDetails shippingDetails2 = new ShippingDetails(BigDecimal.valueOf(5.00), "Natalii Uzhvij 82");
        LocalDate date2 = LocalDate.now();
        Order order2 = new Order(products2, customer2, null/*shippingDetails2*/, date2, OrderStatus.Delivered, 2);

        Order[] orders = new Order[]{order1, order2};
        orders[0] = order1;
        orders[1] = order2;
        return orders;
    }

}
