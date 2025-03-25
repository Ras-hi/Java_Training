package Encapsulation;

public class EmpManDriver {
	public static void main(String[] args) {
		EmpManagement e1=new EmpManagement();
		e1.setid(122);
		e1.setname("Rajan");
		e1.setsalary(32000.98);
		int id =e1.getid();
		String name =e1.getname();
		double salary=e1.getsalary();
		System.out.println(id+ " "+name+" "+salary);
	}
}
