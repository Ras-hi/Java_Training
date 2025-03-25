package one_to_many;
import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		Bank b =new Bank(size,"SBI");
		boolean flag=true;
		while(flag) {
			System.out.println("Enter 1 to add customer\nEnter 2 to display customers"+"\nEnter 3 to exit.");
			int choice =sc.nextInt();
			switch(choice) {
				case 1://check reason?
					sc.nextLine();//there are some buffer data to fetch two times called 
					System.out.println("Enter customer name :");
					String name =sc.nextLine();
					Cust customer =new Cust(name);
					b.addCustomer(customer);
					break;
				case 2:
					b.displayCustomers();
					break;
				case 3:
					flag=false;
					break;
			}
		}
	}
}
/// more today hw
///.removing the customer , updating the customer, modify by adding id of the customer ,fetching the customer by his id
