package Composition;

public class Driver {
	public static void main(String[] args) {
		Car c =new Car("Ferrari","V8");
		c.display();
//		c=null;
//		c.display();// without container class  contained class also cannot exist 
		System.out.println("----------------------------------------");
		Phone p =new Phone("vivo", "auec");
		p.display();
	}
}
