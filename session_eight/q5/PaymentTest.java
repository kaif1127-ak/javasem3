
public class PaymentTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Kaif");

        Order emptyOrder = new Order(customer);
        emptyOrder.checkout(new CreditCard());

        System.out.println();

        Order order = new Order(customer);
        order.addProduct(new Product("Keyboard", 1500));
        order.addProduct(new Product("Mouse", 500));

        order.checkout(new PayPal());
        order.checkout(new CreditCard());
    }
}

