import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import week1.day3.MultiplyWithoutAsterisk;

public class MultiplyWithoutAsteriskTest {
    
    @Test
    public void testMultiplyPositiveNumbers() {
        assertEquals(6, MultiplyWithoutAsterisk.multiply(2, 3));
        assertEquals(15, MultiplyWithoutAsterisk.multiply(5, 3));
        assertEquals(0, MultiplyWithoutAsterisk.multiply(0, 5));
        assertEquals(1, MultiplyWithoutAsterisk.multiply(1, 1));
    }
    
    @Test
    public void testMultiplyWithNegativeNumbers() {
        assertEquals(-6, MultiplyWithoutAsterisk.multiply(2, -3));
        assertEquals(-6, MultiplyWithoutAsterisk.multiply(-2, 3));
        assertEquals(6, MultiplyWithoutAsterisk.multiply(-2, -3));
    }
    
    @Test
    public void testMultiplyWithZero() {
        assertEquals(0, MultiplyWithoutAsterisk.multiply(5, 0));
        assertEquals(0, MultiplyWithoutAsterisk.multiply(0, 5));
        assertEquals(0, MultiplyWithoutAsterisk.multiply(0, 0));
    }
    
    @Test
    public void testMultiplyLargeNumbers() {
        assertEquals(100, MultiplyWithoutAsterisk.multiply(10, 10));
        assertEquals(1000, MultiplyWithoutAsterisk.multiply(100, 10));
    }
}
