import java.util.Scanner;

public class InchesToFeetOwens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inches;
		final int oneFoot=12;
		int feet;
		int remainingInches;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter inches: ");
		inches = in.nextInt();
		feet = inches / oneFoot;
		remainingInches = inches % oneFoot;
		System.out.println(inches + " inches - " + feet + " feet and "+ remainingInches + " inches");
		
	}

}
