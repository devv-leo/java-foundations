import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import week4.day1.SquareAndSort;

public class SquareAndSortTest {

    @Test
    public void testSquareAndSortBasic() {
        int[] arr = {3, 1, 2, 4};
        SquareAndSort.squareAndSort(arr);
        int[] expected = {1, 4, 9, 16};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSquareAndSortNegativeNumbers() {
        int[] arr = {-3, -1, 2, -4};
        SquareAndSort.squareAndSort(arr);
        int[] expected = {1, 4, 9, 16};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSquareAndSortSingleElement() {
        int[] arr = {5};
        SquareAndSort.squareAndSort(arr);
        int[] expected = {25};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSquareAndSortZero() {
        int[] arr = {0, 1, -1};
        SquareAndSort.squareAndSort(arr);
        int[] expected = {0, 1, 1};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSquareAndSortAlreadySorted() {
        int[] arr = {1, 2, 3, 4};
        SquareAndSort.squareAndSort(arr);
        int[] expected = {1, 4, 9, 16};
        assertArrayEquals(expected, arr);
    }
}
