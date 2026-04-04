import org.junit.jupiter.api.Test;

import week2.day3.Factor;

import static org.junit.jupiter.api.Assertions.*;

public class FactorTest {

    @Test
    public void testGetFactors20() {
        int[] result = Factor.getFactors(20);
        int[] expected = {2, 2, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testGetFactors30() {
        int[] result = Factor.getFactors(30);
        int[] expected = {2, 3, 5};
        assertArrayEquals(expected, result);
    }
}
