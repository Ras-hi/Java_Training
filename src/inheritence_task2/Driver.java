package inheritence_task2;

public class Driver {
	public static void main(String[] args) {
		Car c= new Car("BR07","Toyota","06",4,500,true);
		c.displayDetails();
		c.rentVehicle(false);
		
		Bike b= new Bike("BR08","Kawasaki","07",true,350,true);
		b.displayDetails();
		b.rentVehicle(true);
	}
	
	

}
