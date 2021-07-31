package hilel.lesson5.system.orders;

import java.math.BigDecimal;
import java.util.*;

public class OrderPrinter {

    public String printOrders(Order[] orders) {
        String printedTable = "=====================\nOrder id: ";
        for (Order order :
                orders) {
            printedTable += getStringOrder(order);
        }
        return printedTable;
    }

    public String printOrdersWaitedForDelivery(Order[] orders) {
        String printedTable = "";
        for (Order order :
                orders) {
            if (order.getStatus() == OrderStatus.WaitingForDelivery) {
                printedTable += getStringOrder(order);
            }
        }
        return printedTable;
    }

    private String getStringOrder(Order order) {
        String printedTable = "";
        BigDecimal totalPrice = BigDecimal.ZERO;
        printedTable += order.getId() + ";\nDate: " + order.getDate() + "\nProducts:\n";
        for (Product product :
                order.getProduct()) {
            //sum total price for the order
            totalPrice = totalPrice.add(product.getCost());
            //print
            printedTable += "Id of product: " + product.getId_product() + "; Product name: "
                    + product.getName() + "; Cost: " + product.getCost() + ";\n";
        }
        printedTable += "Order Status: " + order.getStatus() + ";\n";
        printedTable += "Customer's name: " + order.getCustomer().getCustomer_name() + "; Customer's id: "
                + order.getCustomer().getId_customer() + ";\n";

        //checking the order has shipping details
        boolean isShippingDetails = order.getDetails() != null;
        if (isShippingDetails) {
            //sum total price for the order
            totalPrice = totalPrice.add(order.getDetails().getCostOfShipping());
            //print
            printedTable += "Shipping details:\nCost of shipping: " + order.getDetails().getCostOfShipping() + ";\n"
                    + "Address of delivery: " + order.getDetails().getAdress() + ";\n";
        }
        printedTable += "---------------------\n";
        printedTable += "Total price: " + totalPrice + ";\n";
        printedTable += "=====================\n\n";
        return printedTable;
    }

    private Map<Customer, CustomersAchievement> getCustomers(Order[] orders) {
        Map<Customer, CustomersAchievement> customers_res = new HashMap<>();
        CustomersAchievement customersAchievement = new CustomersAchievement();

        for (Order order :
                orders) {
            if (!customers_res.containsKey(order.getCustomer())) {
                customersAchievement.addToTotalPrice(order);
                customers_res.put(order.getCustomer(), customersAchievement);
            } else {
                customersAchievement = customers_res.get(order.getCustomer());
                customersAchievement.addToTotalPrice(order);
                customers_res.put(order.getCustomer(), customersAchievement);
            }
            //reload our earnings
            customersAchievement = new CustomersAchievement();
        }
        return customers_res;
    }

    public String printCustomersEarnings(Order[] orders) {
        String f_string = "";
        Map<Customer, CustomersAchievement> customers_res = getCustomers(orders);
        for (Map.Entry<Customer, CustomersAchievement> entry :
                customers_res.entrySet()) {
            f_string += "Customer: " + entry.getKey().getCustomer_name() + ";\n"
                    + "Total earnings for orders: " + entry.getValue().getTotal_price_o() + ";\n"
                    + "Total earnings for shipping: " + entry.getValue().getGetTotal_price_ship() + ";\n"
                    + "==========================\n";
        }
        return f_string;
    }


    private Map<Product, Integer> getMapOfProducts(Order[] orders) {
        Map<Product, Integer> quantityOfProducts = new HashMap<>();
        for (Order order :
                orders) {
            for (Product product :
                    order.getProduct()) {
                //checking if the collections already has product from orders
                if (!quantityOfProducts.containsKey(product)) {
                    // if not we add to collection
                    quantityOfProducts.put(product, 1);
                } else {
                    //if yes we increment its quantity
                    quantityOfProducts.put(product, quantityOfProducts.get(product) + 1);
                }
            }
        }
        return quantityOfProducts;
    }

    public String getProductsAndQuantity(Order[] orders) {
        //collect all products and their quantity
        Map<Product, Integer> quantityOfProducts = getMapOfProducts(orders);

        //get it to one str
        String result = "";
        for (Map.Entry<Product, Integer> entry :
                quantityOfProducts.entrySet()) {
            result += "Id of product: " + entry.getKey().getId_product() + ";\nProduct name: " +
                    entry.getKey().getName() + ";\nCost: " + entry.getKey().getCost() + ";\n";
            result += "Quantity: " + entry.getValue() + ";\n";
            result += "==================\n";
        }
        return result;
    }

}
