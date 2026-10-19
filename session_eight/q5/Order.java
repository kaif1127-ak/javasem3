
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<Product> products = new ArrayList<>();
    private boolean paid = false;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product product) {
        if (!paid) {
            products.add(product);
        } else {
            System.out.println("Cannot modify a paid order.");
        }
    }

    public double getTotal() {
        double total = 0;

        for (Product product : products) {
            total += product.getPrice();
        }

        return total;
    }

    public void checkout(PaymentMethod method) {
        if (products.isEmpty()) {
            System.out.println("Cannot pay for an empty order.");
            return;
        }

        if (paid) {
            System.out.println("Order is already paid.");
            return;
        }

        if (method.pay(getTotal())) {
            paid = true;
            System.out.println("Order for " + customer.getName()
                    + " is Paid.");
        } else {
            System.out.println("Payment failed. Order remains unpaid.");
        }
    }
}
