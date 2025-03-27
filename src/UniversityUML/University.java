package UniversityUML;

public class University {
	private Person[] people;
	private int cnt ;
	public University(int size) {
		people=new Person[size];
		cnt =0;
	}
	public void addPerson(Person p) {
		if(cnt<people.length) {
			people[cnt++]=p;
		}
		else {
			System.out.println("University is full , cannot add more People.");
		}
	}
	public void showPeople() {
		for(int i=0;i<cnt;i++) {
			people[i].displayInfo();
		}
	}
}
