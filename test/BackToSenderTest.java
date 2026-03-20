import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import day3.weekendSnacks.BackToSender;

public class BackToSenderTest {

    @Test
    public void testInvalidInputNegative() {
        assertEquals(0, BackToSender.calculateWage(-5));
    }

}
