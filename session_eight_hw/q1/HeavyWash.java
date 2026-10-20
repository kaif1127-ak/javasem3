
public class HeavyWash implements WashCycle {

    @Override
    public int getDuration() {
        return 60;
    }

    @Override
    public double getCharge() {
        return 45.0;
    }

    @Override
    public String getType() {
        return "Heavy";
    }
}
