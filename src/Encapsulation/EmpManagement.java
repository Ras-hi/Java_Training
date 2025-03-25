package Encapsulation;

public class EmpManagement {
	private String emp_name ;
	private int emp_id;
	private double emp_salary;
	public String getname() {
		return emp_name;
	}
	public int getid() {
		return emp_id;
	}
	public double getsalary() {
		return emp_salary;
	}
	public void setname(String emp_name) {
		this.emp_name=emp_name;
	}
	public void setid(int emp_id) {
		this.emp_id=emp_id;
	}
	public void setsalary(double emp_salary) {
		this.emp_salary=emp_salary;
	}
	
	
}
