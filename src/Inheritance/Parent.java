package Inheritance;

public class Parent {
	static int a =18;
	int b=20;
	static void print() {
		System.out.println("This is a static method.");
	}
	public void mssg() {
		System.out.println("This is a non static method.");
	}
	static {
		System.out.println("Static initializer");
	}
	{
		System.out.println("Non static initializer");
	}
	Parent(){
		System.out.println("Parent");
	}
}
