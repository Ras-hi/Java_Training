package Exception_Handling;
import java.util.*;
public class ExceptionPropagation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			//input mismatch exception
			System.out.println("enter the numbers");
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println(x/y);
					//y digit was zero-Arithmetic Exception
			int[]arr= {1,2,3};
			System.out.println("enter the index to return ");
			System.out.println(arr[sc.nextInt()]);
						//array indexout of bound exception 
			class.forName("Demo");
		}
		catch(InputMismatchException e) {
			System.out.println("1st case handled.");
		}
		catch(ArithmeticException e) {
			System.out.println();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("3 case handled.");
		}
		catch(Exception e) {
			System.out.println("exception handled");//generic exception catch block is made at the end not in between ->throws code unreachable error 
		}
		
	}
}
