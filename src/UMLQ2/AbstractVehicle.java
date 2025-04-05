package UMLQ2;

public abstract class AbstractVehicle implements Vehicle {
	protected String name;
	protected int speed;
	public AbstractVehicle(String name, int speed) {
		this.name =name;
		this.speed=speed;
	}
	public void displayDetails() {
		System.out.println("Vehicle name:"+name);
		System.out.println("Vehicle speed:"+speed);
	}
	public void accelerate(int increment) {
		speed+=increment;
		System.out.println(name+" accelerated . New speed: " +speed);
	}
	public void brake(int decrement) {
		speed-=decrement;
		if(speed <0) speed=0;
		System.out.println(name+" deaccelerated . New speed: "+speed);
	}
	public int getCurrentSpeed() {
		return speed;
	}
	
}
