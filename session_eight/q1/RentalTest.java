
public class RentalTest {
    public static void main(String[] args) {

        Sedan sedan = new Sedan("A", 2000);
        SUV suv = new SUV("B", 3000);

        Customer c1 = new Customer("Customer 1");
        Customer c2 = new Customer("Customer 2");
        Customer c3 = new Customer("Customer 3");

        Rental r1 = null;

        if (sedan.isAvailable()) {
            r1 = new Rental(c1, sedan, 3);
            r1.displayRental();
        }

        if (sedan.isAvailable()) {
            new Rental(c2, sedan, 2);
        } else {
            System.out.println("Customer 2 cannot rent Sedan A: already rented.");
        }

        if (r1 != null) {
            r1.returnVehicle();
        }

        if (suv.isAvailable()) {
            Rental r2 = new Rental(c3, suv, 5);
            r2.displayRental();
        }
    }
}
