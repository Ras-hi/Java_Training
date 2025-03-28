package abstraction_task;
//concrete class for Credit Card Payment
public class CreditCardPayment extends Payment{
	public CreditCardPayment(double amount, String transactionId) {
		super(amount,transactionId);
	}

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Processing Credit Card Payment....");
		String transactionId=getTransactionId();
		double amount =getAmount();
		double discount=applyDiscount();
		double transactionFee= (amount-discount)*0.02;
		double finalAmount=(amount-discount)+transactionFee;
		System.out.println("Transaction Id: "+transactionId);
		System.out.printf("Original Amount: $%.2f%n",amount);
		System.out.printf("Discount Applied: $%.2f%n",discount);
		System.out.printf("Transaction Fee: $%.2f%n",transactionFee);
		System.out.printf("Final Payable Amount: $%.2f%n",finalAmount);
		System.out.println("Credit Card Payment Succesful !\n");
	}
	
	
}
