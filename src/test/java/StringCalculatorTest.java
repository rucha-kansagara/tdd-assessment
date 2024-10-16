import com.tss.wicp.StringCalculator;
import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void addEmptyString() {
        Assert.assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void addSingleValue() {
        Assert.assertEquals(5, StringCalculator.add("5"));
    }

    @Test
    public void addMultipleValueCommaSeparated() {
        Assert.assertEquals(26, StringCalculator.add("5,6,7,8"));
    }

    @Test
    public void addMultipleValueCommaOrNewLineSeparated() {
        Assert.assertEquals(26, StringCalculator.add("5\n6,7\n8"));
    }

    @Test
    public void addMultipleValueCustomDelimiter() {
        Assert.assertEquals(26, StringCalculator.add("//;\n5;6;7;8"));
    }


}
