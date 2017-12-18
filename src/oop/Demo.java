package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	
	void eat(){
		System.out.println(email);
	}
	
	void sleep(){
		System.out.println(name + " is sleeping");
	}
}

public class Demo {
	// Instantiating an Object
	public static void main(String[] args) {
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "8462096431";
		
		// Abstraction
		person1.walk();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		
//		// Person
//		
//		// Attributes, variables, adjectives, descriptors
//		String name = "Joe";
//		String email = "joe@testemail.com";
//		String phone = "7893874839";
//		
//		// Action, activity, behaviour
//		//System.out.println(name + " is walking");
//		walking(name);
//		System.out.println(name + " is eating");
//		
//		// What if we wanted to do this for another person? //
//		// Copy n Paste a change inputs -- Not most efficient //
//		String name2 = "Sarah";
//		String email2 = "sarah@testemail.com";
//		String phone2 = "835390254";
//		
//		// Action, activity, behaviour
//		//System.out.println(name2 + " is walking");
//		walking(name2);
//		System.out.println(name2 + " is eating");
//		
//		// What about binding attributes and properties together?
//	}
//	
//	// Enhance by adding funtions to minimize code
//	static void walking(String name){
//		System.out.println(name + " is walking");
	}

}