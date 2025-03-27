package inheritence;

public class Vehicle {
	String name;
	String engineType;
	
	public Vehicle() {
		System.out.println("no argumented constructor");
	}
	
	public Vehicle(String name, String engineType) {
		super();
		this.name=name;
		this.engineType= engineType;
		System.out.println("Vehicle Parent Class");
	}
	
	public void display() {
		System.out.print(this.name +"  "+this.engineType);
	}
	
}
