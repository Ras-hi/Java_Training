package interfaces;

public interface Vehicle {
	int speed=10;// should be initialized with some value as it is public static final
	void print();//public abstract method
	void start();
	//static methods->concrete method->why do we need in class ? so that same behaviour everywhere in a class 
	//static methods are inherited 
	//in case of interfaces static methods are not inherited 
	static void utility() {
		System.out.println("this is a static ");
	}
	public static void main(String[] args) {
		utility();
	}
	default void text() {
		System.out.println("This is a default method");
	}
}
