package SmartHome;
import java.time.LocalTime;
    public interface Sensor {
        SensorType getSensorType();
        double getReading();
        String getLocation();
        LocalTime getLastUpdated();
        String performAction();
}
