package prob4;
public class ApplianceTest {
    public static void main(String[] args){
        Appliance[] appliances= new Appliance[5];
        appliances[0]=new WashingMachine(10);
        appliances[1]=new Refrigerator(30);
        appliances[2]=new Microwave(70);
        appliances[3]=new Refrigerator(30);
        appliances[4]=new WashingMachine(30);

        for(Appliance app:appliances){
            System.out.println(app.getClass().getSimpleName());
            System.out.println(app.performFunction());
        }
    }
}
