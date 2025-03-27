package method_overriding;

public class Dog extends Animal{
	String breed;
	public void sound() {
		System.out.println("Dog is barking.");
	}
	public Dog(String breed) {
		this.breed=breed;
	}
	static void greet() {
		System.out.println("Dog is greeting you");
	}
}
