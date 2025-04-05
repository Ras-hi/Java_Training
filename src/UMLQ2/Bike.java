package UMLQ2;

public class Bike extends AbstractVehicle{

	public Bike(String name, int speed) {
		super(name, speed);
		// TODO Auto-generated constructor stub
	}
	public void start() {
		System.out.println(name+" bike is Starting .");
	}
	public void stop() {
		System.out.println(name+" bike has stopped.");
	}
	public void displayType() {
		System.out.println("This is a bike.");
	}
}
