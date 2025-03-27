package method_overriding;

public class Driver {
	public static void main(String[] args) {
		Dog d=new Dog("Siberian husky");
		d.sound();//nonstatic method will be inherited
		Tiger t=new Tiger();
		t.sound();// the super call 
		Animal a=new Animal();
		a.sound();
		//super.sound
		System.out.println("-----------------------------------------");
		Animal dog =new Dog("Siberian");
		dog.sound();//upcasting 
		System.out.println("-----------------------------------------");
		String dogBreed=( (Dog)d).breed;
		//System.out.println(dogbreed);=> doubt
		//static members can be caleed using class name and object reference
		dog.greet();
	}
}
