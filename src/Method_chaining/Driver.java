package Method_chaining;

public class Driver {
	public static void main(String[] args) {
//		Student s =new Student();
//		System.out.println(s);
//		System.out.println(s.setName("Raj"));
//		Driver d =new Driver();
//		System.out.println(d);
//		System.out.println(d.print());
//	}
//	public Driver print() {
//		return this;
//	}
		//method chaining=> 
		Student s1=new Student();
		s1.setId(1).setName("Rashi").display();
		//=>here the return type cannot be set and it depends on the last method used here it is display that is of void datatype hence prints the commands 
		
	}
}
//nameofthecar, engine , horsepower