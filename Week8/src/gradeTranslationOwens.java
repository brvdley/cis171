import java.util.Scanner;
//Bradley Owens
public class gradeTranslationOwens {

	final static int A_SCORE = 89;
	final static int B_SCORE = 79;
	final static int C_SCORE = 69;
	final static int D_SCORE = 59;
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("How many scores would you like to enter? ");
		int arraySize = in.nextInt();
		double[] testScores = new double[arraySize];
		for (int i = 0; i < arraySize; i++) {
			System.out.println("Please enter a test score... ");
			testScores[i] = in.nextDouble();
		}
		char[] grades = letterGrade(testScores);
		System.out.println("SCORES ------- GRADES");
		for (int i = 0; i < grades.length; i++) {
			System.out.println(testScores[i] + " ----------- " + grades[i]);
		}

	}
	
	public static char[] letterGrade(double[] arr) {
		char[] letterGrades = new char[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (!(arr[i] >= A_SCORE)) { 
				if (!(arr[i] >= B_SCORE)) {
					if (!(arr[i] >= C_SCORE)) {
						if (!(arr[i] >= D_SCORE)) {
							letterGrades[i] = 'F';
						}
						else if (arr[i] >= D_SCORE) {
							if (arr[i] < C_SCORE) {
								letterGrades[i] = 'D';
							}
						}
					}
					else if (arr[i] >= C_SCORE) {
						if (arr[i] < B_SCORE) {
							letterGrades[i] = 'C';
						}
					}
				}
				else if (arr[i] >= B_SCORE) {
					if (arr[i] < A_SCORE) {
						letterGrades[i] = 'B';
					}
				}
			}
			else {
				letterGrades[i] = 'A';
			}
		}
		return letterGrades;
	}

}
