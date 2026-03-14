package SmartHome;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor {
    private String location;
    private LocalTime lastUpdated;
    private double lightLevel;

    public LightSensor(String location, double lightLevel){
        this.location=location;
        this.lightLevel=lightLevel;
    }

    @Override
    public SensorType getSensorType() {
        return SensorType.LIGHT;
    }

    @Override
    public double getReading() {
        return lightLevel;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public LocalTime getLastUpdated() {
        lastUpdated=LocalTime.now();
        return lastUpdated;
    }
    @Override
    public String performAction() {
        if(lightLevel<100){
            return "Light level is too low! Turning on the lights.";
        }
        return "Light is sufficient";
    }
    @Override
    public String toString(){
        return "Sensor Type: "+getSensorType()+"\n"+"Reading: "+getReading()+"\n"+"Location: "+getLocation()+"\n"+"Last Updated: "+getLastUpdated().format(DateTimeFormatter.ofPattern("hh:mm a"))+"\n"+"Action: "+performAction()+"\n";
    }
}
