package inheritance.examples;

public class MainInheritanceClass {
    public static void main(String[] args) {
        System.out.println("-------------vehicle is  parent class --------------");
        Vehicle vehicle=new Vehicle();
        vehicle.Start();
        vehicle.Stop();
        vehicle.fuel();
//        Vehicle V;
//        v.AirVehicle();
//        V.Start();


        System.out.println("-----------------AirVehicle is child class--------------");
        AirVehicle airvehicle=new AirVehicle();
        airvehicle.Start();
        airvehicle.Stop();
        airvehicle.fuel();
        airvehicle.travelsOnAir();

        System.out.println("-----------------WaterVehicle is child class--------------");
        WaterVehicle watervehicle=new WaterVehicle();
        watervehicle.Start();
        watervehicle.Stop();
        watervehicle.fuel();
        watervehicle.travelsOnWater();


        System.out.println("-----------------RoadVehicle is child class--------------");
        RoadVehicle roadvehicle=new RoadVehicle();
        roadvehicle.Start();
        roadvehicle.Stop();
        roadvehicle.fuel();
        roadvehicle.travelsOnRoad();


    }
}
