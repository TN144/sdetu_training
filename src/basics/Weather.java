package basics;

public class Weather {
	public static void main(String[] args) {
		// This program will give suggestions of what to wear based on weather
		
		int temperature = 65;
		String sunCondition = "OverCast";
		
		if (temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and t-shirt");
		} else if (temperature > 60 && sunCondition == "Sunny") {
			System.out.println("It's a little cooler. Wear long sleeve and jeans.");
			System.out.println("Bring a hat for the sun!");
		} else {
			System.out.println("Looks cold. Bring a sweater.");
		}
	}
}
