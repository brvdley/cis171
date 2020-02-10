import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CourseNumberOwensTest {

	@Test
	void testValidateCourseNumber() {
		//test for wanted outcome
		assertTrue(CourseNumberOwens.validateCourseNumber("ABC123"));
		//test for characters under limit
		assertFalse(CourseNumberOwens.validateCourseNumber("A123"));
		//test for characters over limit
		assertFalse(CourseNumberOwens.validateCourseNumber("ABC1234"));
		//test for empty
		assertFalse(CourseNumberOwens.validateCourseNumber(""));
		//test for failure with initial course digits rather than letters
		assertFalse(CourseNumberOwens.validateCourseNumber("123ABC"));
		//test for failure without capital course letters
		assertFalse(CourseNumberOwens.validateCourseNumber("abc123"));
		//test for failure with @ symbol
		assertFalse(CourseNumberOwens.validateCourseNumber("AB@123"));
		//test for failure with no digits
		assertFalse(CourseNumberOwens.validateCourseNumber("ABCABC"));
	}

}
