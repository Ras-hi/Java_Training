package method_overriding;

public class Tiger extends Animal{
	public Tiger() {
		super.sound();
	}
	public void sound() {
		System.out.println("Tiger is roaring.");
	}
}
