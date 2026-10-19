
public class Sedan extends Vehicle {

    public Sedan(String vehicleName, double pricePerDay) {
        super(vehicleName, pricePerDay);
    }

    @Override
    public String getCategory() {
        return "Sedan";
    }
}
