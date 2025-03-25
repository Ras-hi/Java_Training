package many_to_one;

public class Driver {
	public static void main(String[] args) {
		Bank b =new Bank("SBI");
		Customer c1=new Customer(1,"Rohit", b);
		Customer c2=new Customer(2,"Rajit", b);
		Customer c3=new Customer(3,"Rakulpreett", b);
		c1.display();c2.display();c3.display();
	}
}
