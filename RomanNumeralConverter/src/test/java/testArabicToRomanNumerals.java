import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testArabicToRomanNumerals {

	RomanConverter converter;
	
	@Before
	public void setup() {
		converter = new RomanConverter();
	}
	
	@After
	public void teardown() {
		
	}
	
	@Test
	public void testCreation() {
		assertNotNull(converter);
	}

	@Test
	public void testGivenOne() {
		int input = 1;
		String expectedValue = "I";
		String actualValue;
		
		actualValue = converter.convertToRomanNumerals(input);
		
		assertEquals(expectedValue, actualValue);
	}
	
}
