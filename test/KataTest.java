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

}
