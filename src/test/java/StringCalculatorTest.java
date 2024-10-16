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
}
