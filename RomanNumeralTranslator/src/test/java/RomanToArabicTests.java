import org.example.RomanToArabicTranslator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RomanToArabicTests {
    int result;
    RomanToArabicTranslator UUT;

    @BeforeEach
    public void setup(){
        UUT = new RomanToArabicTranslator();
    }
    @AfterEach
    public void tearDown(){
        UUT = null;
    }

    @Test
    public void create(){

        assertNotNull(UUT);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "RomanToArabic.txt")
    public void translate(String input, int expectedResult){

        result = UUT.translate(input);

        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "Complete Roman to Arabic.csv", numLinesToSkip = 1)
    public void translateAll(String input, int expectedResult){

        result = UUT.translate(input);

        assertEquals(expectedResult, result);
    }
}