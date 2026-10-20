
public class QuickWash implements WashCycle {

    @Override
    public int getDuration() {
        return 30;
    }

    @Override
    public double getCharge() {
        return 20.0;
    }

    @Override
    public String getType() {
        return "Quick";
    }
}

