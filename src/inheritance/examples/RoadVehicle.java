package inheritance.examples;

public class RoadVehicle extends Vehicle {
    public void travelsOnRoad(){
        System.out.println("travels on road");
    }
    public void Start(){
        System.out.println("RoadVehicle started");
    }
    public void Stop(){
        System.out.println("RoadVehicle stopped");
    }
    public void fuel(){
        System.out.println("RoadVehicle fueled");
    }
}
