package PaymentManager;
import java.util.*;
public class Payment {
	private String type;
	public Payment(String type) {
		this.type= type;
	}
	public void process() {
		System.out.println("Payment processing.");
	}
	public String getType() {
		return type;
	}
}
