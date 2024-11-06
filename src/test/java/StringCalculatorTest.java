import org.example.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    StringCalculator strCal = new StringCalculator();

    @Test
    public void addEmptyStringTest(){
        assertEquals(0, strCal.add("")); // for empty string
        assertEquals(1, strCal.add("1")); // for single value
        assertEquals(9, strCal.add("9")); //for single value
        assertEquals(14,strCal.add("5,9")); // handling two comma values
        assertEquals(9, strCal.add("2,7"));
        assertEquals(10, strCal.add("1,2,3,4")); //handling any amount of numbers
        assertEquals(13, strCal.add("1\n5,7")); //handling new lines
        assertEquals(16, strCal.add("1\n4\n7,4"));
        assertEquals(3, strCal.add("//;\n1;2")); //handling different delimeter
        assertEquals(8, strCal.add("//|\n2|3|3"));
        assertEquals(3, strCal.add("//;\n1;2"));
    }
}
