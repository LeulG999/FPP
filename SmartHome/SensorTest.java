package SmartHome;
public class SensorTest {
public static void main(String[] args){
    Sensor[] sen=new Sensor[5];
    sen[0]=new LightSensor("Kitchen",30);
    sen[1]=new TemperatureSensor("Living-Room",60);
    sen[2]=new SoundSensor("Bed-Room",200);
    sen[3]=new LightSensor("Bath-room",120);
    sen[4]=new TemperatureSensor("Master-BedRoom",78);

    for(Sensor o:sen){
        if(o!=null) {
            System.out.println(o);
        }
        else{
            System.out.println("No sensor Found");
        }
    }
}
}
