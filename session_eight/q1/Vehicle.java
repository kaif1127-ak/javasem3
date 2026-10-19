
public abstract class Vehicle {
    protected String vehicleName;
    protected double pricePerDay;
    protected boolean available;

    public Vehicle(String vehicleName, double pricePerDay) {
        this.vehicleName = vehicleName;
        this.pricePerDay = pricePerDay;
        this.available = true;
    }

    public abstract String getCategory();

    public double calculateRentalCost(int days) {
        return pricePerDay * days;
    }

    public boolean isAvailable() {
        return available;
    }

    public void rent() {
        available = false;
    }

    public void returnVehicle() {
        available = true;
    }

    public String getVehicleName() {
        return vehicleName;
    }
}
