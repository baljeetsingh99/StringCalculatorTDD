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
        assertEquals(14,strCal.add("5,9"));
        assertEquals(9, strCal.add("2,7"));
        assertEquals(13, strCal.add("1\n5,7"));
        assertEquals(16, strCal.add("1\n4\n7,4"));
    }
}
