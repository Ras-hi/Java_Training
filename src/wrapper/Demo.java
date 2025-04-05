package wrapper;

public class Demo {
	public static void main(String[] args) {
		int a=10;
		//Integer x=new Integer(a);//boxing 
		Integer y=a;//auto boxing
		Integer z=Integer.valueOf(y);//boxing
		
		int r=y.intValue();//unboxing
		Character ch ='a';//auto boxing 
		char c=ch;//auto unboxing 
		Integer l=10;
		Integer b=10; // they are wrapper classes so they will be auto unboxed and then used 
		System.out.println(a==b);// automatically converts to 10==10 it works for every operator relationsal /conditional 
		//works for only the eight classes int, short,long , bool, double,float ,char,byte t
		Integer i =10;
		Short s=2;
		Long m =(long)s+i;
		String str=(String)(s+l);//not possible because typecasting cant be done in string 
	}
}
