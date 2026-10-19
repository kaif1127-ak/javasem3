
public class BankTransfer implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Bank Transfer.");
        return true;
    }
}

