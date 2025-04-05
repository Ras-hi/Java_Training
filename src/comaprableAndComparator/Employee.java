package comaprableAndComparator;

public class Employee implements Comparable{
	 int id;
	 String name;
	 double salary;
	Employee(int id, String name ,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return id+" "+name+" "+salary;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee e=(Employee)o;
//		return this.name.compareTo(e.name);
//		return this.name.compareTo(e.name);//ascending order
		return e.name.compareTo(this.name); // descending order

	}
	
}
