import static org.junit.Assert.*;

import org.junit.Test;

public class testArabicToRomanNumerals {

	RomanConverter converter;
	
	@Before
	public void setup() {
		converter = new RomanConverter;
	}
	
	@After
	public void teardown() {
		converter = null;
	}
	
	@Test
	public void testCreation() {
		assertNotNull(converter);
	}

}
