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


    @Test
    public void testDivide() {
        assertEquals(3.33f, Kata.divide(10, 3), 0.01f);
        assertEquals(0, Kata.divide(10, 0));
        assertEquals(2.5f, Kata.divide(5, 2), 0.01f);
    }

    @Test
    public void testFactorOf() {
        assertEquals(4, Kata.factorOf(6));
        assertEquals(2, Kata.factorOf(7));
        assertEquals(1, Kata.factorOf(1));
        assertEquals(6, Kata.factorOf(12));
    }

    @Test
    public void testIsSquare() {
        assertTrue(Kata.isSquare(16));
        assertTrue(Kata.isSquare(0));
        assertTrue(Kata.isSquare(1));
        assertFalse(Kata.isSquare(15));
        assertFalse(Kata.isSquare(-4));
    }


    @Test
    public void testIsPalindrome() {
        assertTrue(Kata.isPalindrome(12321));
        assertTrue(Kata.isPalindrome(45554));
        assertFalse(Kata.isPalindrome(12345));
        assertFalse(Kata.isPalindrome(1234));
        assertFalse(Kata.isPalindrome(123456));
    }

    @Test
    public void testFactorialOf() {
        assertEquals(120, Kata.factorialOf(5));
        assertEquals(1, Kata.factorialOf(0));
        assertEquals(1, Kata.factorialOf(1));
        assertEquals(0, Kata.factorialOf(-3));
        assertEquals(3628800, Kata.factorialOf(10));
    }

    @Test
    public void testSquareOf() {
        assertEquals(49, Kata.squareOf(7));
        assertEquals(0, Kata.squareOf(0));
        assertEquals(1, Kata.squareOf(1));
        assertEquals(100, Kata.squareOf(-10));
    }
}
