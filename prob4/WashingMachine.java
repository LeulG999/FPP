package prob4;
public class WashingMachine implements Appliance {
    private int loadCapacity;
    public WashingMachine(int loadCapacity){
        this.loadCapacity=loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int powerLevel) {
        this.loadCapacity = powerLevel;
    }
    public String startWashingCycle(){
        return "Starting wash cycle with load capacity: " + getLoadCapacity()+ " kg.";
    }
     @Override
    public String performFunction(){
        return startWashingCycle();
    }
}
