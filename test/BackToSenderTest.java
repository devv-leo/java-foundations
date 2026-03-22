import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import day3.weekendSnacks.methods.BackToSender;

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

    @Test
    public void testLessThanFiftyPercent() {
        assertEquals(6600, BackToSender.calculateWage(10));
    }

    @Test
    public void testFiftyPercent() {
        assertEquals(15000, BackToSender.calculateWage(50));
    }

    @Test
    public void testFiftyNinePercent() {
        assertEquals(16800, BackToSender.calculateWage(59));
    }

    @Test
    public void testSixtyPercent() {
        assertEquals(20000, BackToSender.calculateWage(60));
    }

    @Test
    public void testSixtyNinePercent() {
        assertEquals(22250, BackToSender.calculateWage(69));
    }

    @Test
    public void testSeventyPercent() {
        assertEquals(40000, BackToSender.calculateWage(70));
    }

    @Test
    public void testHundredPercent() {
        assertEquals(55000, BackToSender.calculateWage(100));
    }
}
