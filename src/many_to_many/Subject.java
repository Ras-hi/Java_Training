package many_to_many;

public class Subject {
	private String subjectname;
	public Subject(String subjectname) {
		this.subjectname=subjectname;
	}
	public String getSubject() {
		return subjectname;
	}
	public String toString() {
		return "Subject{name='"+subjectname+"'}";
	}
}
