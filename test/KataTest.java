import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import day3.weekendSnacks.Kata;

public class KataTest {

    @Test
    public void testIsEven() {
        assertTrue(Kata.isEven(4));
        assertFalse(Kata.isEven(5));
        assertTrue(Kata.isEven(0));
        assertFalse(Kata.isEven(-3));
    }

    @Test
    public void testIsPrimeNumber() {
        assertTrue(Kata.isPrimeNumber(2));
        assertTrue(Kata.isPrimeNumber(7));
        assertFalse(Kata.isPrimeNumber(1));
        assertFalse(Kata.isPrimeNumber(4));
        assertFalse(Kata.isPrimeNumber(0));
        assertFalse(Kata.isPrimeNumber(-5));
    }

    @Test
    public void testSubtract() {
        assertEquals(7, Kata.subtract(10, 3));
        assertEquals(7, Kata.subtract(3, 10));
        assertEquals(0, Kata.subtract(5, 5));
        assertEquals(5, Kata.subtract(-2, 3));
    }

}
