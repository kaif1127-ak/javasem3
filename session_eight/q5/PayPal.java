
public class PayPal implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid Rs." + amount + " using PayPal.");
        return true;
    }
}
