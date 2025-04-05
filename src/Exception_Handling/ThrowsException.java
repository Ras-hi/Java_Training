package Exception_Handling;
import java.sql.SQLException;
public class ThrowsException {
	public static void main(String[] args) {
//		try {
//			div(10,2);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		div(10,2);// we get an underline exception if we use checked exceptions like SQLException but if we use runtime exception that are unchecked we dont get any underlines 
	}
	public static void div(int x,int y) throws RuntimeException{
		System.out.println(x/y);
	}
}
