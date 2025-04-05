package taskComparator;

public class Person implements Comparable{
	int age;
	String name;
	public Person(int age, String name) {
		this.age=age;
		this.name=name;
	}
	public String toString() {
		return age+" "+name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Person p =(Person)o;
		if(this.name.compareTo(p.name)!=0) {
			return this.name.compareTo(p.name);
		}
		if(this.age-p.age!=0) {
			return this.age-p.age;
		}
		return 0;
	}
	
}

//compare based on name if the name is same then compare based on age 
// not allowed to use comparator object only comaparable if both things same return 0 
