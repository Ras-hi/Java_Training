package Variable_Shadowing;

public class SubClass extends Super {
	String a= "shack";
	
	static String b;
	
	public void print() {
		System.out.println(a);
		System.out.println(super.a);
		System.out.println(b);
		System.out.println(Super.b);  //static members should be accessed using classname only.
	}
}
