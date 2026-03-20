import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import day3.weekendSnacks.BackToSender;

public class BackToSenderTest {

    @Test
    public void testInvalidInputNegative() {
        assertEquals(0, BackToSender.calculateWage(-5));
    }

    @Test
    public void testInvalidInputOverHundred() {
        assertEquals(0, BackToSender.calculateWage(150));
    }

    @Test
    public void testZeroDeliveries() {
        assertEquals(5000, BackToSender.calculateWage(0));
    }
}
