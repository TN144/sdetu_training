package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate Object
		
		BankAccount acc1 = new BankAccount();
		
		// acc1.name - "Roger Hue";
		// With Encapsulation : public API methods
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("23858530397");
		System.out.println(acc1.getSsn());
		
		acc1.accountNumber = "92839496";
		acc1.setRate();
		acc1.increaseRate();

		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc1.accountNumber = "92839496";
		
		BankAccount acc3 = new BankAccount("Savings Account", 200000);
		acc1.accountNumber = "92839496";
		
//		
//		// Demo for inheritance
//		CDAccount cd1 = new CDAccount();
//		cd1.checkBalance();
	}

}
