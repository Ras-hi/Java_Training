package object_class;

public class Driver {
	 public static void main(String[] args) {
		 
		Employee e1=new Employee(123,"Raj",340000);
		Employee e2=new Employee(123,"Raj",340000);
		e1;
//		System.out.println(e1);//it is implicitly calling the toString method
//		System.out.println(e1.toString());
//		System.out.println(e1==e2);
//		System.out.println(e1.equals(e2));
//		System.out.println(e1.hashCode());
//		System.out.println(e2.hashCode());
//		String s ="Raj";
//		System.out.println(s.hashCode());
//		Employee e3=new Employee(12,"Roni", 2000);
		//Object e4=e3.clone(); could not access due to protected access modifier
		
	}   
}
