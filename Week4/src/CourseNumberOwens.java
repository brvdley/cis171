
public class CourseNumberOwens {

	public static void main(String[] args) {

	}
	
	public static boolean validateCourseNumber(String course) {
		if (course.length() == 6 && Character.isUpperCase(course.charAt(0)) && Character.isUpperCase(course.charAt(1)) && Character.isUpperCase(course.charAt(2))) {
			if (Character.isDigit(course.charAt(3)) && Character.isDigit(course.charAt(4)) && Character.isDigit(course.charAt(5))) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
}
}
