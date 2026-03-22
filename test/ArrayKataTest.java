import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import day3.weekendSnacks.arrays.ArrayKata;

public class ArrayKataTest {
    
    private ArrayKata arrayKata;
    
    @BeforeEach
    public void setUp() {
        arrayKata = new ArrayKata();
    }
    
    @Test
    public void testMaximumIn() {
        int[] numbers = {3, 7, 2, 9, 5};
        assertEquals(9, arrayKata.maximumIn(numbers));
        
        int[] singleElement = {42};
        assertEquals(42, arrayKata.maximumIn(singleElement));
        
        int[] negativeNumbers = {-5, -2, -8, -1};
        assertEquals(-1, arrayKata.maximumIn(negativeNumbers));
    }
    
    @Test
    public void testMinimumIn() {
        int[] numbers = {3, 7, 2, 9, 5};
        assertEquals(2, arrayKata.minimumIn(numbers));
        
        int[] singleElement = {42};
        assertEquals(42, arrayKata.minimumIn(singleElement));
        
        int[] negativeNumbers = {-5, -2, -8, -1};
        assertEquals(-8, arrayKata.minimumIn(negativeNumbers));
    }
    
    @Test
    public void testSumOf() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(15, arrayKata.sumOf(numbers));
        
        int[] empty = {};
        assertEquals(0, arrayKata.sumOf(empty));
        
        int[] negativeNumbers = {-1, -2, -3};
        assertEquals(-6, arrayKata.sumOf(negativeNumbers));
    }
    
    @Test
    public void testSumOfEvenarrayOfIntegersIn() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        assertEquals(12, arrayKata.sumOfEvenarrayOfIntegersIn(numbers)); // 2+4+6
        
        int[] oddNumbers = {1, 3, 5, 7};
        assertEquals(0, arrayKata.sumOfEvenarrayOfIntegersIn(oddNumbers));
        
        int[] evenNumbers = {2, 4, 6, 8};
        assertEquals(20, arrayKata.sumOfEvenarrayOfIntegersIn(evenNumbers));
    }
    
    @Test
    public void testSumOfOddarrayOfIntegersIn() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        assertEquals(9, arrayKata.sumOfOddarrayOfIntegersIn(numbers)); // 1+3+5
        
        int[] oddNumbers = {1, 3, 5, 7};
        assertEquals(16, arrayKata.sumOfOddarrayOfIntegersIn(oddNumbers));
        
        int[] evenNumbers = {2, 4, 6, 8};
        assertEquals(0, arrayKata.sumOfOddarrayOfIntegersIn(evenNumbers));
    }
    
    @Test
    public void testMaximumAndMinimumOf() {
        int[] numbers = {3, 7, 2, 9, 5};
        int[] result = arrayKata.maximumAndMinimumOf(numbers);
        assertEquals(9, result[0]); // maximum
        assertEquals(2, result[1]); // minimum
        
        int[] singleElement = {42};
        int[] singleResult = arrayKata.maximumAndMinimumOf(singleElement);
        assertEquals(42, singleResult[0]);
        assertEquals(42, singleResult[1]);
    }
    
    @Test
    public void testNoOfOddarrayOfIntegersIn() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        assertEquals(3, arrayKata.noOfOddarrayOfIntegersIn(numbers)); // 1,3,5
        
        int[] oddNumbers = {1, 3, 5, 7};
        assertEquals(4, arrayKata.noOfOddarrayOfIntegersIn(oddNumbers));
        
        int[] evenNumbers = {2, 4, 6, 8};
        assertEquals(0, arrayKata.noOfOddarrayOfIntegersIn(evenNumbers));
    }
    
    @Test
    public void testNoOfEvenarrayOfIntegersIn() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        assertEquals(3, arrayKata.noOfEvenarrayOfIntegersIn(numbers)); // 2,4,6
        
        int[] evenNumbers = {2, 4, 6, 8};
        assertEquals(4, arrayKata.noOfEvenarrayOfIntegersIn(evenNumbers));
        
        int[] oddNumbers = {1, 3, 5, 7};
        assertEquals(0, arrayKata.noOfEvenarrayOfIntegersIn(oddNumbers));
    }
    
    @Test
    public void testEvenarrayOfIntegersIn() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] result = arrayKata.evenarrayOfIntegersIn(numbers);
        assertArrayEquals(new int[]{2, 4, 6}, result);
        
        int[] oddNumbers = {1, 3, 5, 7};
        int[] emptyResult = arrayKata.evenarrayOfIntegersIn(oddNumbers);
        assertArrayEquals(new int[]{}, emptyResult);
        
        int[] evenNumbers = {2, 4, 6, 8};
        int[] allEven = arrayKata.evenarrayOfIntegersIn(evenNumbers);
        assertArrayEquals(new int[]{2, 4, 6, 8}, allEven);
    }
    
    @Test
    public void testOddarrayOfIntegersIn() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] result = arrayKata.oddarrayOfIntegersIn(numbers);
        assertArrayEquals(new int[]{1, 3, 5}, result);
        
        int[] evenNumbers = {2, 4, 6, 8};
        int[] emptyResult = arrayKata.oddarrayOfIntegersIn(evenNumbers);
        assertArrayEquals(new int[]{}, emptyResult);
        
        int[] oddNumbers = {1, 3, 5, 7};
        int[] allOdd = arrayKata.oddarrayOfIntegersIn(oddNumbers);
        assertArrayEquals(new int[]{1, 3, 5, 7}, allOdd);
    }
    
    @Test
    public void testSquarearrayOfIntegersIn() {
        int[] numbers = {1, 2, 3, 4, 5, 9, 16, 20};
        int[] result = arrayKata.squarearrayOfIntegersIn(numbers);
        assertArrayEquals(new int[]{1, 4, 9, 16}, result);
        
        int[] noSquares = {2, 3, 5, 7, 10};
        int[] emptyResult = arrayKata.squarearrayOfIntegersIn(noSquares);
        assertArrayEquals(new int[]{}, emptyResult);
        
        int[] allSquares = {1, 4, 9, 16, 25};
        int[] allSquareResult = arrayKata.squarearrayOfIntegersIn(allSquares);
        assertArrayEquals(new int[]{1, 4, 9, 16, 25}, allSquareResult);
        
        int[] negativeNumbers = {-1, -4, -9, 2, 3};
        int[] negativeResult = arrayKata.squarearrayOfIntegersIn(negativeNumbers);
        assertArrayEquals(new int[]{}, negativeResult); // negative numbers are not perfect squares
    }
}
