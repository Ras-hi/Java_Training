package UmlQ1;

public class FullTimeEmployee extends Employee{
	private int bonus;private String jobType;
	FullTimeEmployee(String name, double salary, int bonus, String jobType){
		super(name,salary);
		this.bonus=bonus;
		this.jobType=jobType;
	}
	public void EmployeeInfo() {
		super.EmployeeInfo();
		System.out.println("Bonus:"+bonus);
		
	}
	public void JobRole() {
		super.EmployeeInfo();
		System.out.println("JobRole:"+jobType);
	}
	
	
}
