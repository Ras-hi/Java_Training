package inheritence;

public class Car extends Vehicle {
	int price;
	//car class now contains 4 data members[name,engType,display(), price]
	public Car(String name,String engineType,int price) {
	//	super();
		super(name,engineType);
//		
//		this.name=name;
//		this.engineType=type;
		this.price=price;
		System.out.println("Car Child Class");
	}
	
}
