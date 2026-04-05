import org.junit.jupiter.api.Test;

import week3.day1.SlidingWindow;

import static org.junit.jupiter.api.Assertions.*;

public class LargestKSumTest {
    
    @Test
    public void testFindLargestKSumWithValidInput() {
        assertFalse(SlidingWindow.findLargestKSum(new int[]{1, 5, 6, 9, 3, 2}, 3));
    }
    
    @Test
    public void testFindLargestKSumWithKGreaterThanArrayLength() {
        assertFalse(SlidingWindow.findLargestKSum(new int[]{1, 2, 3}, 5));
    }

    @Test
    public void testFindLargestKSumWithKEqualsArrayLength() {
        assertFalse(SlidingWindow.findLargestKSum(new int[]{1, 2, 3, 4}, 4));
    }
}
