package one_to_many;

public class Bank {
	Cust[] customer;
	String bankName;
	static int cnt=0;
	public Bank(int size, String bankName){
		this.customer=new Cust[size];
		this.bankName=bankName;
	}
	public void addCustomer(Cust custo) {
		if(cnt<customer.length) {
			customer[cnt++]=custo;
			System.out.println("Customer added");
		}
		else {
			System.out.println("Cannot add customer, the array is full .");
		}
	}
	public void displayCustomers() {
		for(int i =0;i<cnt;i++) {
			System.out.println(customer[i].customerName);
		}
	}
}
