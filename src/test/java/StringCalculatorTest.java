import com.tss.wicp.StringCalculator;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StringCalculatorTest {

    @Test
    public void addEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void addSingleValue() {
        assertEquals(5, StringCalculator.add("5"));
    }

    @Test
    public void addMultipleValueCommaSeparated() {
        assertEquals(26, StringCalculator.add("5,6,7,8"));
    }

    @Test
    public void addMultipleValueCommaOrNewLineSeparated() {
        assertEquals(26, StringCalculator.add("5\n6,7\n8"));
    }

    @Test
    public void addMultipleValueCustomDelimiter() {
        assertEquals(26, StringCalculator.add("//;\n5;6;7;8"));
    }

    @Test
    public void negativeNumber() {
        Exception e = assertThrows(IllegalArgumentException.class,()->{ StringCalculator.add("//;\n-5;6;7;8");});
        assertEquals("Negative numbers not allowed: -5", e.getMessage());
    }


}
