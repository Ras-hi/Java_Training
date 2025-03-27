package UniversityUML;

public class Professor extends Person{
//show designation 
	private String specialization;
	public Professor(String name, int age, String specialization) {
		super(name,age);
		this.specialization=specialization;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println(" Specialization: "+specialization);
	}
	public void designation() {
		System.out.println("The professor is designed.");
	}
	
}
