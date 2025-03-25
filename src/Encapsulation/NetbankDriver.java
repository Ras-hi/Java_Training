package Encapsulation;

public class NetbankDriver {
	public static void main(String[] args) {
		Netbanking b =new Netbanking();
		b.getBalance(1236);
		b.setBalance(5000, 1234);
		b.getBalance(1234);
		b.withdraw(100,1234);
		b.getBalance(1234);
	}
}
