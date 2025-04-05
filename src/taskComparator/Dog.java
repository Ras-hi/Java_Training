package taskComparator;

import java.util.Arrays;

public class Dog implements Comparable {
	int age;
	String name;
	String breed;
	Dog(int age, String name, String breed){
		this.age=age;
		this.name=name;
		this.breed= breed;
	}
	public String toString() {
		return name+" "+age+" "+breed;
	}
	
	public static void main(String[] args) {
		Dog[]dog= new Dog[3];
		dog[0]=new Dog(2,"Bo","hosky");
		dog[1]=new Dog(3,"Bo", "humky");
		dog[2]=new Dog(4,"Bo", "husky");
		Arrays.sort(dog,new CompareByBreed());
		for(Dog d:dog) {
			System.out.println(d);
		}
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Dog d =(Dog)o;
		if(this.name.compareTo(d.name)!=0) {
			return this.name.compareTo(d.name);
		}
		if(this.age-d.age!=0) {
			return this.age-d.age;
		}
		return 0;
		
	}
}
//the dog class does not has the ability to sort on which factor name , age ?
// need to implement comparable interface without that we canot sort non primitive objects 
// unless we do the above 