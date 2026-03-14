package prob4;
public class Microwave implements Appliance{
    private int powerLevel;
    public Microwave(int powerLevel){
        this.powerLevel=powerLevel;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    @Override
    public String performFunction() {
        return "Heating food at power level: " + getPowerLevel() + ".";
    }
}
