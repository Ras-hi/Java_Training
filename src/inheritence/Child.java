package inheritence;

public class Child extends Parent{
	 void display() {
		 System.out.println(b);  //non-static variables are inherited
		 System.out.println(a);  //static variable are inherited
		 
		 message(); //non-static methods are inherited
		 print(); // static methods are inherited
		 
		//constructors, private members and initializers do not get inherited.
	}
}
