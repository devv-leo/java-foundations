import org.junit.Test;
import week4.day1.DivideWithoutOperator;

import static org.junit.Assert.*;

public class DivideWithoutOperatorTest {
    
    @Test
    public void testDivide() {
        assertEquals(5, DivideWithoutOperator.divide(10, 2));
        assertEquals(3, DivideWithoutOperator.divide(9, 3));

    }
    
    @Test
    public void testDivideZero() {
        assertEquals(0, DivideWithoutOperator.divide(5, 10));
        assertEquals(0, DivideWithoutOperator.divide(0, 5));
    }

    @Test
    public void testDivideByOne() {
        assertEquals(10, DivideWithoutOperator.divide(10, 1));
        assertEquals(50, DivideWithoutOperator.divide(50, 1));
    }
}
