package Inheritance;

public class Driver {
	public static void main(String[] args) {
		Bike bike =new Bike("Hero","v5");
		Car car=new Car("Ferrari","V8", 2000);
		
		bike.display();
		car.display();
		System.out.println(car.price);
	}
}
