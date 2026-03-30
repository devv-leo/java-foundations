import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import day8.LargestKSum;

public class LargestKSumTest {
    
    @Test
    public void testFindLargestKSumWithValidInput() {
        assertFalse(LargestKSum.findLargestKSum(new int[]{1, 5, 6, 9, 3, 2}, 3));
    }
    
    @Test
    public void testFindLargestKSumWithKGreaterThanArrayLength() {
        assertFalse(LargestKSum.findLargestKSum(new int[]{1, 2, 3}, 5));
    }

    @Test
    public void testFindLargestKSumWithKEqualsArrayLength() {
        assertFalse(LargestKSum.findLargestKSum(new int[]{1, 2, 3, 4}, 4));
    }
}
