package interfaces;

public interface C extends A,B{
	default void check() {//default method => object refernce
		System.out.println(A.a);// c
		System.out.println(B.a);
		//message// static method are not inherited
		A.message();
		print();
	}
	@Override
	default void print() {
		// TODO Auto-generated method stub
		A.super.print(); //concept of shadowing in this prospect too
		
	}
	public static void main(String[] args) {
		//this.check();//cannot access a default method in static context of an interface
		//super.message();//Cannot use super in a static context
		//static and nonstatic initializers?
		
	}
	
	
}	
