package UmlQ1;

public class PartTimeEmployee extends Employee{
	private int workingHours;private String designation;
	PartTimeEmployee(String name, double salary, int workingHours, String designation){
		super(name,salary);
		this.workingHours=workingHours;
		this.designation=designation;
	}
	public void EmployeeInfo() {
		super.EmployeeInfo();
		System.out.println("Working Hours: "+workingHours);
	}
	public void Designation() {
		super.EmployeeInfo();
		System.out.println("Designation:"+designation);
	}
	public void JobRole() {
		System.out.println("job role of an part time employee is a cloud engineer.");
	}
}
