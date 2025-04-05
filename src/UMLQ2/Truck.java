package UMLQ2;

public class Truck extends AbstractVehicle{

	public Truck(String name, int speed) {
		super(name, speed);
		// TODO Auto-generated constructor stub
	}
	public void start() {
		System.out.println(name+" truck is starting.");
	}
	public void stop() {
		System.out.println(name+" truck has stopped.");
	}
	public void displayType() {
		System.out.println("This is a truck.");
	}

}
