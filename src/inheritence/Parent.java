package inheritence;

public class Parent {
	static int a=10;
	int b=20;
	
	static void print() {
		System.out.println("static method");
	}
	
	public void message() {
		System.out.println("non static method");
	}
	
	static{
		System.out.println("static initializer");
	}
	
	{
		System.out.println("not-static initializer");
	}
	
	Parent(){
		
	}
}
