package PaymentManager;

public class MakePayment {
	private Payment[] payments;
	private int cnts;
	public MakePayment(int size) {
		this.payments=new Payment[size];
		this.cnts=0;
	}
	public void addPayment(Payment p) {
		if(cnts<payments.length) {
			payments[cnts++]=p;
			System.out.println(p.getType()+" Payment added.");
		}
		else {
			System.out.println("The no of process is full. ");
		}
	}
	public void processAllPayments() {
		if(cnts==0) {
			System.out.println("No Payment in Process.");
			return ;
		}
		System.out.println("Proceessing all payments: ");
		for(int i =0;i<cnts;i++) {
			payments[i].process();
		}
		
	}
}
