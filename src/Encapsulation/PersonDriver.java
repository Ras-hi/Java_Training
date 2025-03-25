package Encapsulation;

public class PersonDriver {
	public static void main(String[] args) {
		Person p1= new Person();
		p1.setName("Rashi Gupta");
		p1.setAge(22);
		p1.setCountry("India");
		String name =p1.getName();
		int age =p1.getAge();
		String country=p1.getCountry();
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Country :"+country);
	}
}
