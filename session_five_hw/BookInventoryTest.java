
public class BookInventoryTest {

    public static void main(String[] args) {

        BookInventory inventory = new BookInventory(3);

        System.out.println("Initial copies: "
                + inventory.getCopiesAvailable());

        inventory.checkOut();
        System.out.println("After checkout: "
                + inventory.getCopiesAvailable());

        inventory.checkOut();
        inventory.checkOut();
        inventory.checkOut(); // No copies left

        System.out.println("After extra checkout attempts: "
                + inventory.getCopiesAvailable());

        inventory.checkIn();
        System.out.println("After check-in: "
                + inventory.getCopiesAvailable());

        inventory.checkIn();
        inventory.checkIn();
        inventory.checkIn(); // Cannot exceed total

        System.out.println("After extra check-in attempts: "
                + inventory.getCopiesAvailable());
    }
}
