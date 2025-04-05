package Exception_Handling;

public class CustomException {
	public static void div(int x,int y) throws Exception {
		if(y!=0) {
			System.out.println(x/y);
		}
		else {
			throw new Exception("Denominator is zero.");
		}
	}
	public static void main(String[] args) {
		try {
			div(10,0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Main end");
	}
}
//exceptions are classes , create a class -> inherit any of the exception classes -> initialize a message -> override getmessage() to return the initialized message 