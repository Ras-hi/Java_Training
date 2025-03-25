package Encapsulation;

public class StudentManagementDriver {
	public static void main(String[] args) {
		StudentManagement s1=new StudentManagement();
		s1.fetch("yoyo@gmail.com");
		s1.update("yoyo@gmail.com", "432", 32, 'F');
		s1.fetch("yoyo@gmail.com");
		s1.updatepswd("432","1234","1234");
	}
}
