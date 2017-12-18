package labs;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		StudentDatabase student1 = new StudentDatabase("Johnny", "547393025");
		StudentDatabase student2 = new StudentDatabase("Ben", "473820495");
		StudentDatabase student3 = new StudentDatabase("Valerie", "184956472");

	}
}

class StudentDatabase {
	// Properties of a student database
	private static int staticID = 1000;
	private String userID;
	private String name;
	private String email;
	private String SSN;
	private String phone;
	private String city;
	private String state;
	
	// Constructor
	public StudentDatabase(String name, String SSN) {
		int random = (int) (Math.random() * 100);
		this.email = name + random + "@studentemail.com";
		this.SSN = SSN;
		this.name = name;
		staticID++;
//		System.out.println("Name: " +name+ "   Email: " +(String) email);
		setUserId();
		System.out.println(toString());
	}
	
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int random = (int) (Math.random() * (max - min));
		random = random + min;
		userID = staticID + random + SSN.substring(5);
		System.out.println(userID);
	}
	
	private void enroll() {
		
	}
	private void pay() {
		
	}
	
	private void checkBalance() {
		
	}
	
	private void showCourses() {
		
	}
	
	public String toString() {
		return "[Name: " +name+ " ]\n[Email: " + email + "]\n" + "[User ID: " + userID + "]";
	}
}
