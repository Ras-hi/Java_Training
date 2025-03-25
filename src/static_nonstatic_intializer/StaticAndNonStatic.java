package static_nonstatic_intializer;


public class StaticAndNonStatic {
//	static {
//		System.out.println("3rd multiline static initializer");
//	}
//	static {
//		System.out.println("1st multiline static initializer");
//	}
//	static {
//		System.out.println("2nd multiline static initializer");
//	}
	public StaticAndNonStatic() {
		System.out.println("Constructor");
	}
	{
		System.out.println("1st non static initializer.");
	}
	public static void main(String[] args) {
		System.out.println("main method.");
		StaticAndNonStatic d1 = new StaticAndNonStatic();
	}
}
