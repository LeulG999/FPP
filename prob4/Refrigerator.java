package prob4;
public class Refrigerator implements Appliance {
    private int temperature;
    public Refrigerator(int temperature){
        this.temperature =temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String performFunction() {
        return "Cooling items at temperature: " + getTemperature() + "°C";
    }
}
