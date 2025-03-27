package inheritence_task2;

public class Bike extends Vehicle {
	private boolean hasGear;

	
	public Bike(String vehicleNumber, String brand, String model, boolean hasGear, double rentalPricePerDay,boolean isavailable) {
		
		super(vehicleNumber,brand,model,rentalPricePerDay,isavailable);
		this.hasGear=hasGear;
}	
	public void displayDetails() {
		super.displayDetails();
		System.out.println(" "+hasGear);
	}


}
