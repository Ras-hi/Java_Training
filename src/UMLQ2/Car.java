package UMLQ2;

public class Car extends AbstractVehicle{

	public Car(String name, int speed) {
		super(name, speed);
		// TODO Auto-generated constructor stub
	}
	public void start() {
		System.out.println(name+" Car started.");
	}
	public void stop() {
		System.out.println(name+" car stopped.");
	}
	public void displayType() {
		System.out.println("This is a car.");
	}

}
