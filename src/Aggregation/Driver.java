package Aggregation;

public class Driver {
	public static void main(String[] args) {
		Sim s =new Sim(12345667);
		Phone p =new Phone("Nokia", s);
		p.display();
		p=null;
		System.out.println(s.phoneNo);
		System.out.println("-------------------------------------");
		
		CustomerNm c= new CustomerNm(233);
		BankNm b =new BankNm("SBI",c);
		b.display();
		b=null;
		System.out.println(c.customerid);
	}
}
