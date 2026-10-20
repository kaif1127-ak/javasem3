
public class NormalWash implements WashCycle {

    @Override
    public int getDuration() {
        return 45;
    }

    @Override
    public double getCharge() {
        return 30.0;
    }

    @Override
    public String getType() {
        return "Normal";
    }
}
