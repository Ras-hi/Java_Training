package Aggregation;

public class Phone {
	String name;
	Sim s;
	public Phone(String name, Sim s) {//here in  Sim s means we are passing the reference of the Sim object that was created initially ie it stores the adress of the sim 
		this.name =name;
		this.s=s;
	}
	public void display() {
		System.out.println(this.name+" " +this.s.phoneNo);//this contains the current adress of the phone adress // this.sim.phoneno -current adress of the sim object and its member phone no 
	}
}
