package Exception_Handling;


public class UserLogin {
	private int pin =1234;
	public void login(int pin) {
		if(this.pin==pin) {
			System.out.println("user successfuly logged in.0");
		}
		else {
			throw new InvalidPinException("THe user pin is invalid");
		}
	}
	public static void main(String[] args) {
		System.out.println("main start ");
		UserLogin u=new UserLogin();
		u.login(1224);
		System.out.println("main end");
		
	}
}
