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

}
