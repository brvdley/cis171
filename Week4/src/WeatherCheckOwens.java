import java.util.Scanner;

public class WeatherCheckOwens {
//Bradley Owens
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a season: ");
		String userSeason = in.nextLine().trim();
		
		System.out.print("Please enter a temperature: ");
		double userTemp = in.nextDouble();
		
		
		//way 1
		String result = getWeatherAdvice(userSeason, userTemp);
		System.out.println(result);
		
		//way 2
		//System.out.println(getWeatherAdvice(userSeason, userTemp));
		
		in.close();
		
	}

	public static String getWeatherAdvice(String season, double temp) {
		final double SUMMER_TEMP_MIN = 90;
		final double WINTER_TEMP_MIN = 10;
		final double SPRING_TEMP_MIN = 60;
		final double FALL_TEMP_MIN = 50;
		
		if (season.equals("summer") && temp > SUMMER_TEMP_MIN) {
			return "Wear Something Cool!";
		}
		else if (season.equals("winter") && temp < WINTER_TEMP_MIN) {
			return "Wear Something Warm!";
		}
		else if (season.equals("spring") && temp < SPRING_TEMP_MIN) {
			return "Wear A Jacket!";
		}
		else if (season.equals("fall") && temp < FALL_TEMP_MIN) {
			return "Wear A Coat!";
		}
		else { return "No Advice From Me!"; }
	}
	
	public static boolean isEvenNumber(double userNumber) {
		if (userNumber % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static double addFive(double userNumber) {
		return userNumber + 5;
	}
}
