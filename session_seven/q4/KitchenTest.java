
public class KitchenTest {
    public static void main(String[] args) {
        Blender b = new Blender();

        b.setSpeedLevel(3);
        System.out.println(b.getSpeedLevel());

        try {
            b.setSpeedLevel(9);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid speed rejected");
        }

        System.out.println(b.getSpeedLevel());
        System.out.println(b.prepare());
        System.out.println(b.clean());
    }
}
