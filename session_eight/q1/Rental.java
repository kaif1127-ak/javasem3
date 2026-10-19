
public class Rental {
    private Customer customer;
    private Vehicle vehicle;
    private int days;
    private boolean active;

    public Rental(Customer customer, Vehicle vehicle, int days) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
        this.active = true;
        vehicle.rent();
    }

    public void returnVehicle() {
        if (active) {
            vehicle.returnVehicle();
            active = false;
            System.out.println(customer.getCustomerName()
                    + " returned " + vehicle.getVehicleName());
        }
    }

    public void displayRental() {
        System.out.println(customer.getCustomerName() + " rents "
                + vehicle.getCategory() + " " + vehicle.getVehicleName()
                + " for " + days + " days. Cost: Rs."
                + vehicle.calculateRentalCost(days));
    }

    public boolean isActive() {
        return active;
    }
}
