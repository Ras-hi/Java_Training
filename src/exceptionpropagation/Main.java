package exceptionpropagation;

public class Main {
	public static void main(String[] args) {
		alpha();
	}
	public static void alpha() {
		System.out.println("alpha");
		beta();
	}
	public static void beta() {
		
		System.out.println("beta");
		gamma();
	}
	public static void gamma() {
		System.out.println("gamma");
		System.out.println(10/0);// the 
		try {
			System.out.println(10/0);
			System.out.println("hi");//not executed as the exception object was created and the control moves to the catch block 11
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception handled.");
			
		}
		System.out.println("end of gamma");
	}
	
	
}
// propagation =>exception object was moving from called stack to caller stack 
//throws=> is used to declare an exception , used to propagate an exception 
//when you use throws the rts knows where to send the 

