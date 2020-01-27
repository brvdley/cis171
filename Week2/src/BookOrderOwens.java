import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class BookOrderOwens {
	
	public static void main(String[] args) {
		double subTotal;
		double taxAmount;
		double shipAmount;
		double totalPrice;
		final double bookPrice = 9.50;
		final double taxRate = .055;
		final double shipRate = 1.50;
		int sentinel = 0;
		
		Scanner bookAmount = new Scanner(System.in);
		while(sentinel != -1) {
		sentinel = 0;
		System.out.println("Input number of books. Price per book is $9.50.");
		int numBooks = bookAmount.nextInt();
		System.out.println("Number of books: " + numBooks);
		subTotal = (double) numBooks * bookPrice;
		Double theSub = BigDecimal.valueOf(subTotal)
			    .setScale(2, RoundingMode.HALF_UP)
			    .doubleValue();
		System.out.println("Sub Total: $" + theSub);
		taxAmount = (double) subTotal * taxRate;
		Double theTax = BigDecimal.valueOf(taxAmount)
			    .setScale(2, RoundingMode.HALF_UP)
			    .doubleValue();
		System.out.println("Tax Amount: $" + theTax);
		shipAmount = (double) numBooks * shipRate;
		Double theShipping = BigDecimal.valueOf(shipAmount)
			    .setScale(2, RoundingMode.HALF_UP)
			    .doubleValue();
		System.out.println("Shipping Costs: $" + theShipping);
		totalPrice = subTotal + taxAmount + shipAmount;
		Double thePrice = BigDecimal.valueOf(totalPrice)
			    .setScale(2, RoundingMode.HALF_UP)
			    .doubleValue();
		System.out.println("Total: $" + thePrice);
		System.out.println("Enter -1 to exit or any other number to continue.");
		sentinel = bookAmount.nextInt();
		}
		bookAmount.close();
	}
	
}
