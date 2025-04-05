package UMLQ2;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle car =new Car("Tesla",0);
		Vehicle bike=new Bike("Yamaha",0);
		Vehicle truck=new Truck("Volvo",0);
		car.start();
		car.accelerate(45);
		car.brake(3);
		car.displayType();
		System.out.println("Car speed: "+car.getCurrentSpeed());
		car.stop();
		System.out.println("------------------------------------------");
		bike.start();
		bike.accelerate(45);
		bike.brake(3);
		bike.displayType();
		System.out.println("Car speed: "+bike.getCurrentSpeed());
		bike.stop();
		System.out.println("------------------------------------------");
		truck.start();
		truck.accelerate(45);
		truck.brake(3);
		truck.displayType();
		System.out.println("Car speed: "+truck.getCurrentSpeed());
		truck.stop();
		System.out.println("------------------------------------------");
	}
}
