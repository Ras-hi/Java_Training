package Aggregation;

public class BankNm {
	String banknm;
	CustomerNm c;
	public BankNm(String banknm, CustomerNm c) {
		this.banknm= banknm;
		this.c=c;
	}
	public void display() {
		System.out.println(this.banknm+" "+this.c.customerid);
	}
	
}
