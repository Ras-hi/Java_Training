package UmlQ1;



public class Employee {
	private String name;
	private double salary;
	
	Employee(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	public void EmployeeInfo() {
		System.out.println("Employee name:"+name+"\nSalary:"+salary);
	}
	public void JobRole() {
		System.out.println("the default role is Developer.");
	}
}
