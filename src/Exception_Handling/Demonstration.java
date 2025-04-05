package Exception_Handling;

public class Demonstration {
	static String s1=null;
	static String s2=s1.toLowerCase();
	public static void main(String[] args) {
		System.out.println(s1);
	}
}

//class loading concept 
//exception created before stack called => exception initializer error because before even you get the 
//stack made we got null pointer exception but since it was caused before the main function staerted 
//this all happened during the class loading process because of static initializer
