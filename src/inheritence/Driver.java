package inheritence;

public class Driver {
	public static void main(String[] args) {
//  	Bike bike= new Bike("Kawasaki Ninja", "V4");
		Car car= new Car("Ferrari","V8", 10000);
		System.out.println(car.name +" "+car.engineType+" "+car.price );
//		bike.display();
		car.display();
	}

}
