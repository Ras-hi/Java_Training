package Abstraction;



public abstract class Vehicle {
	abstract void start() ;// if a class contains a incomplete method/abstract methods then the class
		//is considered to be incomplete hence the class is also supposed to be made as abstract
	//abstract int a=10; //a variable cannot be made as abstract 
//	static abstract void print() ;// static methods cannot be overriden , we cannot use two non access modifier on a single component 
	// both are used to change something different 
	//you cannot make a class as static/static abstract because we have to make object of it 
		
	static int a =10; int b=20;// these variables can be of public, private , protected and package level 
	//same with method but abstract methods cannot be made as private 
	//an abstract class can have both abstract as well as concrete methods 
	
	void demo() {
		System.out.println("Welcome");
	}
	static void print(SystemOutput)
}
