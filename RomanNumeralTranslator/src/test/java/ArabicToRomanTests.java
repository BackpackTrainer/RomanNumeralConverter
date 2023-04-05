import org.example.ArabicToRomanTranslator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArabicToRomanTests {


    String result;
    ArabicToRomanTranslator UUT;

    @BeforeEach
    public void setup(){
        UUT = new ArabicToRomanTranslator();
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
    @CsvFileSource(resources = "ArabicToRoman.txt")
    public void translate(int input, String expectedResult){

        result = UUT.translate(input);

        assertEquals(expectedResult, result);
    }
}
