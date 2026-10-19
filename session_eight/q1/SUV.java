
public class SUV extends Vehicle {

    public SUV(String vehicleName, double pricePerDay) {
        super(vehicleName, pricePerDay);
    }

    @Override
    public String getCategory() {
        return "SUV";
    }
}
