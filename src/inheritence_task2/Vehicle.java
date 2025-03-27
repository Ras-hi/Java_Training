package inheritence_task2;

public class Vehicle {
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rentalPricePerDay;
	private boolean isavailable;
	
	public Vehicle( String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isavailable) {
		this.vehicleNumber=vehicleNumber;
		this.brand=brand;
		this.model=model;
		this.rentalPricePerDay=rentalPricePerDay;
	}
	
	public void displayDetails(){
		System.out.print(this.vehicleNumber+" "+ this.brand+" "+ this.model+" "+this.rentalPricePerDay+ " "+this.isavailable);
		
	}
	public void rentVehicle(boolean isavailable) {
		this.isavailable=isavailable;
		
	//	System.out.println("---------------------------------");
		if(isavailable==true) {
			System.out.println(this.model+" is available to rent @"+ this.rentalPricePerDay);
		}
		else
			System.out.println(this.model+" is unavailable to rent @"+ this.rentalPricePerDay);
	}

}
