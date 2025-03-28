package interfaces;

public class Driver {
	public static void main(String[] args) {
		Vehicle b =new Bike();
		b.start();
		b.print();// can store in parent reference =>polymorphism can be performed
		//b.utility();//not inherited
		Vehicle.utility();
	}
}
