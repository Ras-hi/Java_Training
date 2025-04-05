package exception_handling_q;
public class InvalidPinException extends Exception{//custom exception class 
	private String mssg;
	public InvalidPinException(String mssg) {
		this.mssg=mssg;
	}
	public String getMessage() {
		return mssg;
	}
}
