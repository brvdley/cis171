import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//Bradley Owens
class WeatherCheckOwensTest {

	@Test
	void testGetWeatherAdvice() {
		assertEquals("No Advice From Me!", WeatherCheckOwens.getWeatherAdvice("winter", 70));
		assertEquals("Wear Something Warm!", WeatherCheckOwens.getWeatherAdvice("winter", 0));
		assertEquals("No Advice From Me!", WeatherCheckOwens.getWeatherAdvice("spring", 70));
		assertEquals("Wear Something Cool!", WeatherCheckOwens.getWeatherAdvice("summer", 100));
		assertEquals("Wear A Jacket!", WeatherCheckOwens.getWeatherAdvice("spring", 40));
		assertEquals("Wear A Coat!", WeatherCheckOwens.getWeatherAdvice("fall", 30));
		assertEquals("No Advice From Me!", WeatherCheckOwens.getWeatherAdvice("fall", 70));
	}
	
	@Test
	void testisEvenNumber() {
		assertFalse(WeatherCheckOwens.isEvenNumber(5));
		assertTrue(WeatherCheckOwens.isEvenNumber(4));
		assertTrue(WeatherCheckOwens.isEvenNumber(8));
	}
	
	@Test
	void testAddFive() {
		assertEquals(10.22, WeatherCheckOwens.addFive(5.2145), .01);
		assertEquals(-12.4, WeatherCheckOwens.addFive(-17.4), .0000001);
	}

}

