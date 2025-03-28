package abstraction_task;

public abstract class Payment {
	private double amount;
	private String transactionId;
	public Payment(double amount, String transactionId) {
		this.amount= amount;
		this.transactionId =transactionId;
	}
	public double getAmount() {//getter
		return amount ;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public double applyDiscount() {
		return (amount>500)?amount*0.10:0.0;
	}
	public abstract void processPayment();//abstract method that is to be implemented in subclasses 
}
