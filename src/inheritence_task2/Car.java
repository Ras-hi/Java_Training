package inheritence_task2;

public class Car extends Vehicle{
	private int noOfDoor;
	
	public Car(String vehicleNumber, String brand, String model, int noOfDoor, double rentalPricePerDay,boolean isavailable) {
		
		super(vehicleNumber,brand,model,rentalPricePerDay,isavailable);
		this.noOfDoor=noOfDoor;
		
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println(" "+noOfDoor);
	}

}
