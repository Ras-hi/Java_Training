package Encapsulation;

public class Netbanking {
	int currentBalance=50000;//restricting the direct access and we give a controlled access to the resource by using public getter and setter
	private int pin = 1234;
	public void setBalance(int deposit,int pin) {
		if(this.pin==pin) {
			currentBalance+=deposit;
		}
		else {
			System.out.println("INvALID PIN");
		}
	}
	public void getBalance(int pin) {
		if(this.pin==pin) {
			System.out.println(currentBalance);
		}
		else {
			System.out.println("INVALID PIN");
		}
	}
	public void withdraw(int withdraw,int pin) {
		if(this.pin==pin) {
			if(currentBalance>=withdraw) {
				currentBalance-=withdraw;
				System.out.println(withdraw);
			}
			else {
				System.out.println("INSUFFICIENT BALANCE.");
			}
		}
		else {
			System.out.println("INVALID PIN");
		}
	}
	
}
// data authentication and validation ->encapsulation 