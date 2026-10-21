
public class DeliveryTest {
    public static void logAll(DeliveryNote[] notes) {
        for (DeliveryNote note : notes) {
            System.out.println(note.confirmDelivery());
        }
    }

    public static void main(String[] args) {
        ParcelNote p = new ParcelNote("TRK-1");
        LetterNote l = new LetterNote("TRK-2");

        System.out.println(p.confirmDelivery());
        System.out.println(p.confirmDelivery("J. Smith"));

        System.out.println("--- Delivery Log ---");
        DeliveryNote ref = p;
        logAll(new DeliveryNote[]{ref, l});
    }
}
