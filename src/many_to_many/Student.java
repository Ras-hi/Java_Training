package many_to_many;

public class Student {
	private String name;
	private int[] subjects;//array to store which subjects the student is enrolled in 
	public Student(String name, int numberOfSubjects) {
		this.name=name;
		this.subjects=new int[numberOfSubjects];	
	}
	public String getname() {
		return name ;
	}
	public void enrolInSubject(int subjectIdx) {
		subjects[subjectIdx]=1;
	}
	public int[]getSubjects(){
		return subjects;
	}
	public String toString() {
		return "Student{name='"+name+"'}";
	}
}
