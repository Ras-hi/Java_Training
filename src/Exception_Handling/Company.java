package Exception_Handling;

public class Company {
	static Company e=new Company();
	Company(){
		
	}
	public static void main(String[] args) {
		Company c=new Company();
	}
}
//different scopes non static initializer and local initializer 
// company constructor is called from the main method and the object will be created in stack then that will store the non static initializer or variable 
// and that itself calls the constructor which leads to an infinite loop 
//static members dont get loaded into the object , it gets stored before the main is even executed 

