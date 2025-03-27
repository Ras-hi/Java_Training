package UniversityUML;

public class Main {
	public static void main(String[] args) {
		University u =new University(3);
		Student s1=new Student("Raj",20,101);
		Professor s2=new Professor("Dr. Petu", 45,"Computer Science");
		Student s3= new Student("Ram", 23, 102);
		u.addPerson(s1);
		u.addPerson(s2);
		u.addPerson(s3);
		u.showPeople();
	}
}
