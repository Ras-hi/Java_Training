package UmlQ1;

public class Main {
	public static void main(String[] args) {
		Employee e1=new FullTimeEmployee("Raj",34500.08, 4500,"Java Developer");
		Employee e2 =new PartTimeEmployee("Roshni", 34000,20, "Associate");
		e1.EmployeeInfo();
		System.out.println();
		e2.EmployeeInfo();
	}
	static void details(Employee e) {
		e.JobRole();
		//instance of operator to check whether employee e is a full time or part time 
		if(e instanceof FullTimeEmployee) {
			e.JobRole();
		}
		else {
			e.JobRole();
		}
		((PartTimeEmployee)e).Designation();
	}
}

