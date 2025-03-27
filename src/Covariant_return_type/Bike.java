package Covariant_return_type;

public class Bike extends Vehicle{
//	public Vehicle getObject() {
//		return new Bike();// upcasted
//	}
	public Bike getObject() {
		return new Bike();// covariant return type example// viceversa doesnt work 
	}
}
