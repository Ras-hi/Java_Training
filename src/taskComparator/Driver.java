package taskComparator;

public class Driver {
	 public static void main(String[] args) {
		Person p1=new Person(12,"Rashi");
		Person p2=new Person(20,"kittu");
		if(p1.compareTo(p2)>0) {
			System.out.println("p1 is greater ");
		}
		else if(p1.compareTo(p2)<0) {
			System.out.println("p2 is greater ");
		}
		else {
			System.out.println("Both are equal");
		}
	}
}
