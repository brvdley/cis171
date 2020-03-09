import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class gradeTranslationOwensTest {

	@Test
	void testLetterGrade() {
		char[] result = {'A'};
		double[] input = {89};
		char[] result1 = {'B'};
		double[] input1 = {79};
		char[] result2 = {'C'};
		double[] input2 = {69};
		char[] result3 = {'D'};
		double[] input3 = {59};
		char[] result4 = {'F'};
		double[] input4 = {58};
		char[] result5 = {'B'};
		double[] input5 = {85.3};
		assertArrayEquals(result, gradeTranslationOwens.letterGrade(input));
		assertArrayEquals(result1, gradeTranslationOwens.letterGrade(input1));
		assertArrayEquals(result2, gradeTranslationOwens.letterGrade(input2));
		assertArrayEquals(result3, gradeTranslationOwens.letterGrade(input3));
		assertArrayEquals(result4, gradeTranslationOwens.letterGrade(input4));
		assertArrayEquals(result5, gradeTranslationOwens.letterGrade(input5));
	}

}
