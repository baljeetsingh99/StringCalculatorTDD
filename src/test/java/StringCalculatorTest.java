import org.example.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    StringCalculator strCal = new StringCalculator();

    @Test
    public void addEmptyStringTest(){
        assertEquals(0, strCal.add(""));
        assertEquals(1, strCal.add("1"));
        assertEquals(9, strCal.add("9"));
        assertEquals(14, strCal.add("5,9"));
        assertEquals(9, strCal.add("2,7"));
    }
}
