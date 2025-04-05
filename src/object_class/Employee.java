package object_class;


public class Employee implements Cloneable{
	private int employee_id;
	private String name; 
	private double salary;
	public Employee(int employee_id, String name ,double salary) {
		this.employee_id=employee_id;
		this.name =name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", name=" + name + ", salary=" + salary + "]";
	}
	// right click ->source-> generate to String 
	public boolean equals(Object o) {
		//o.salary// due to static binding salary is not stored in Object class  hence we need to downcast it 
		if(o instanceof Employee) {
			Employee e =(Employee )o;
			return this.employee_id ==e.employee_id && this.salary==e.salary && this.name.equals(e.name);
		}
		return false;
	}
	//overriding to generate value 
	public int hashCode() {
		return (int)(this.employee_id+this.salary+this.name.hashCode());
	}
	public Employee cloneEmployee(Employee e) {
		try {
			return (Employee)
		}
	}
}
