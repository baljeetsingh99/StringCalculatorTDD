import org.example.StringCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StringCalculatorTest {
    private StringCalculator strCal;

    @Before
    public void setUp() {
        strCal = new StringCalculator();
    }

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
        assertEquals(3, strCal.add("//;\n1;2")); //handling different delimeter;
        assertEquals(8, strCal.add("//|\n2|3|3"));
        assertEquals(3, strCal.add("//;\n1;2"));

        assertEquals(11, strCal.GetCalledCount());
        System.out.println(strCal.GetCalledCount());


    }
    @Test
    public void testNegativeNumbersThrowException() throws Exception {
        try {
            strCal.add("1,-2,3,-4");
        } catch (Exception e) {
            assertEquals("Negative numbers not allowed: [-2, -4]", e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testGetCalledCount() throws Exception {

        assertEquals(0, strCal.GetCalledCount());
        strCal.add("1,2");
        assertEquals(1, strCal.GetCalledCount());

        strCal.add("3,4,5");
        assertEquals(2, strCal.GetCalledCount());

        strCal.add("//;\n1;2;3");
        assertEquals(3, strCal.GetCalledCount());
    }



}
