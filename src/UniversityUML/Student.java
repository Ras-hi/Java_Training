package UniversityUML;
//override displayinfo 
public class Student extends Person{
	private int studentId;
	public Student(String name, int age,int studentId){
		super(name,age);
		this.studentId=studentId;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println(" StudentID: "+studentId);
	}
	//show student grade
	public void grade() {
		System.out.println("Student is in 12.");
	}
}
