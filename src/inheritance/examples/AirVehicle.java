package inheritance.examples;

public class AirVehicle extends Vehicle {
    public void travelsOnAir(){
       // String color="white";
        String color="blue";
        System.out.println("travels on air");
        System.out.println("child color is:"+color);
        System.out.println("parent color is:"+super.color);

    }
    @Override
    public void Start(){
        System.out.println("AirVehicle started");
    }
    @Override
    public void Stop(){
        System.out.println("AirVehicle stopped");
    }
    @Override
    public void fuel(){
        System.out.println("AirVehicle fueled");
    }
}
