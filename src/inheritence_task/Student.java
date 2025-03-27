package inheritence_task;

public class Student extends Person{
	private int id;
	public Student(String name,int age,int id){
		super(name,age);
		this.id=id;
	}
	
	public void displayDetails() {
		super.displayDetails();            //super keyword to call the method of Person class
		System.out.println(" ID:"+ this.id);
	}
	
// -------------------- through getters and setters method:--------------------------
	
//	public void setid(int id) {
//		this.id=id;
//	}
//	public void getid() {
//		System.out.println(id);
//	}	

}
