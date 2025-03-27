package PaymentManager;
import java.util.*;
public class PaymentSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MakePayment mp=new MakePayment(10);
		boolean running =true;
		while(running) {
			System.out.println("\nChoose a payment method:");
			System.out.println("1.Credit");
			System.out.println("2.Debit");
			System.out.println("3.UPI");
			System.out.println("4.Exit & Process Payment.");
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1:
					mp.addPayment(new Payment("Credit"));
					break;
				case 2:
					mp.addPayment(new Payment("Debit"));
					break;
				case 3:
					mp.addPayment(new Payment("UPI"));
					break;
				case 4:
					running =false;
					break;
				default:
					System.out.println("Invalid choice.Please try aagain.");
			}
		}
		sc.close();
		mp.processAllPayments();
	}
}
