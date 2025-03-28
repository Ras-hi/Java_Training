package abstraction_task;

public class PaymentSystem {
	public static void main(String[] args) {
		Payment p1=new CreditCardPayment(600.0,"TXN12345");
		p1.processPayment();
		Payment p2= new PayPalPayment(300.0,"TXN67890");
		p2.processPayment();
	}
}
