import org.example.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    StringCalculator strCal = new StringCalculator();

    @Test
    public void addEmptyStringTest(){
        assertEquals(0, strCal.add(""));
    }
}
