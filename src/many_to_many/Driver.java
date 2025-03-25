package many_to_many;

public class Driver {
	public static void main(String[] args) {
		int numberOfStudents=3;
		int numberOfSubjects=3;
		Subject s1=new Subject("Math");
		Subject s2=new Subject("english");
		Subject s3=new Subject("History");
		//create student 
		Student st1=new Student("Alice", numberOfSubjects);
		Student st2=new Student("Bob", numberOfSubjects);
		Student st3=new Student("Charlie", numberOfSubjects);
		st1.enrolInSubject(0);
		st1.enrolInSubject(1);
		st2.enrolInSubject(1);
		st2.enrolInSubject(2);
		st3.enrolInSubject(0);
		st3.enrolInSubject(2);
		Student[] students= {st1,st2,st3};
		Subject[] subjects= {s1,s2,s3};
		for(Student student:students) {
			System.out.println(student.getname()+" is enrolled in: ");
			for(int i=0;i<subjects.length;i++) {
				if(student.getSubjects()[i]==1) {
					System.out.println(subjects[i].getSubject()+" ");
				}
			}
			System.out.println();
		}
	}
	
	
}
