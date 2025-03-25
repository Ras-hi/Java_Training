package relationships;

public class Car {
	private String color;
	private int maxSpeed;
	public void carInfo() {
		System.out.println("Car color= "+color+" Max speed= "+maxSpeed);
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setSpeed(int maxSpeed) {
		this.maxSpeed=maxSpeed;
	}
}
class Maruti extends Car{
	public void MarutiStartDemo() {
		Engine MarutiEngine= new Engine();
		MarutiEngine.start();
	}
}
