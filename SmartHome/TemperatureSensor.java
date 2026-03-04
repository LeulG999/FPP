package SmartHome;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TemperatureSensor implements Sensor {
    private String location;
    private LocalTime lastUpdated;
    private double temperature;
public TemperatureSensor(String location, double temperature){
      this.location=location;
      this.temperature=temperature;
}
    @Override
    public SensorType getSensorType() {
        return SensorType.TEMPERATURE;
    }

    @Override
    public double getReading() {
        return temperature;
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
        if(temperature>30){
            return "Please turn on the AC";
        }
        else if(temperature<18){
            return "Please turn on the Heater";
        }
        return "Temperature is in normal range";
    }
    @Override
    public String toString(){
        return "Sensor Type: "+getSensorType()+"\n"+"Reading: "+getReading()+"\n"+"Location: "+getLocation()+"\n"+"Last Updated: "+getLastUpdated().format(DateTimeFormatter.ofPattern("hh:mm a"))+"\n"+"Action: "+performAction()+"\n";
    }
}
