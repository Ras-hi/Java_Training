package comaprableAndComparator;

public class Driver {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"Rohit",20000);
		Employee e2=new Employee(2,"Roshi", 10000);
		compareBasedOnName(e1,e2);// modulation done 
		compareBasedOnId(e1,e2);//
		compareBasedOnSalary(e1,e2);
		
	}
	public static void compareBasedOnName(Employee e1, Employee e2) {
		if(e1.compareTo(e2)>0) {
			System.out.println("e1 is greater");
		}
		else if(e1.compareTo(e2)<0) {
			System.out.println("e2 is greater");
		}
		else {
			System.out.println("e1 and e2 are equal");
		}
	}
	public static void compareBasedOnId(Employee e1, Employee e2) {
		CompareEmployeeById cid=new CompareEmployeeById();
		if(cid.compare(e1,e2)>0) {
			System.out.println("e1 is greater");
		}
		else if(cid.compare(e1, e2)<0) {
			System.out.println("e2 is greater");
		}
		else {
			System.out.println("e1 and e2 are equal");
		}
	}
	public static void compareBasedOnSalary(Employee e1, Employee e2) {
		CompareEmployeeBySalary csd=new CompareEmployeeBySalary();
		if(csd.compare(e1,e2)>0) {
			System.out.println("e1 is greater");
		}
		else if(csd.compare(e1, e2)<0) {
			System.out.println("e2 is greater");
		}
		else {
			System.out.println("e1 and e2 are equal");
		}
	}
}
