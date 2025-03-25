package Inheritance;

public class Child extends Parent {
	void display() {//non static cannot be accesed in static 
		System.out.println(b);
		System.out.println(a);
		mssg();
		print();
		
	}
}
