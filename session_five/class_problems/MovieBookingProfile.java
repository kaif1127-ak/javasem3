
public class MovieBookingProfile {
    private String name;
    private boolean confirmed;
    private String otp;

    public MovieBookingProfile() {
        this.name = "";
        this.confirmed = false;
    }

    public MovieBookingProfile(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public void setOtp(String otp) {
        if (otp == null || !otp.matches("\\d{4,6}")) {
            throw new IllegalArgumentException(
                    "OTP must contain 4 to 6 digits");
        }

        this.otp = otp;
    }

    public static void main(String[] args) {
        MovieBookingProfile p =
                new MovieBookingProfile("Rahul Dev");

        p.setConfirmed(true);
        p.setOtp("4471");

        System.out.println("Name: " + p.getName());
        System.out.println("Confirmed: " + p.isConfirmed());
        System.out.println("OTP set successfully");
    }
}
