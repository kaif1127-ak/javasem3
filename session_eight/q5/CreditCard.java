
public class CreditCard implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card.");
        return true;
    }
}
