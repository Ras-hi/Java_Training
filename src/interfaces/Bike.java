package interfaces;

public class Bike implements Vehicle{

	@Override
	public void print() {
		System.out.println(speed);
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Biki ");
		text();
	}

}
