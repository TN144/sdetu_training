package basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		System.out.println("The product of " +numA+ " and " +numB+ " is " +multiplyNumbers(numA, numB));	
	}
	// Prints name
	static void printName() {
		System.out.println("My name is TN");
	}
	// Adds two numbers
	static void addNumbers(int a, int b) {
		int sum = a + b;
		System.out.println("Sum is equal to " +sum);
	}
	
	static int multiplyNumbers(int a, int b) {
		int product = a * b;
		addNumbers(product,product); // CALL ADD METHOD within other method
		return product;
	}
}
