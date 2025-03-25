package many_to_one;

public class Customer {
	int id;
	String cname;
	Bank b;
	public Customer(int id,String cname, Bank b) {
		this.id=id;
		this.cname=cname;
		this.b=b;
	}
	public void display() {
		System.out.println(this.id+" "+this.cname+" "+this.b.bname);
	}
}
