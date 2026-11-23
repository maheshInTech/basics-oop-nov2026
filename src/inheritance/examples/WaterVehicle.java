package inheritance.examples;

import java.sql.SQLOutput;

public class WaterVehicle  extends Vehicle{
    public void travelsOnWater(){
        System.out.println("travels on water");

    }
    @Override
    public void Start(){
        System.out.println("WaterVehicle started");
    }
    @Override
    public void Stop(){

        super.Stop();
        System.out.println("WaterVehicle stopped");

    }
    @Override
    public void fuel(){
        System.out.println("WaterVehicle fueled");
    }
}
