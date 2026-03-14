package SmartHome;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor{
    private String location;
    private LocalTime lastUpdated;
    private double soundLevel;
    public SoundSensor(String location, double soundLevel){
        this.location=location;
        this.soundLevel=soundLevel;
    }
    @Override
    public SensorType getSensorType() {
        return SensorType.SOUND;
    }
    @Override
    public double getReading() {
        return soundLevel;
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
        if(soundLevel>70){
            return "Please turn on noise cancellation";
        }
        return "Sound is within normal range";
    }
    @Override
    public String toString(){
        return "Sensor Type: "+getSensorType()+"\n"+"Reading: "+getReading()+"\n"+"Location: "+getLocation()+"\n"+"Last Updated: "+getLastUpdated().format(DateTimeFormatter.ofPattern("hh:mm a"))+"\n"+"Action: "+performAction()+"\n";
    }
}
