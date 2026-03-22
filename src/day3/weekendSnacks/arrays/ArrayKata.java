package day3.weekendSnacks.arrays;

public class ArrayKata {

    public int maximumIn(int[] arrayOfIntegers) {
        int max = arrayOfIntegers[0];
        for (int i = 1; i < arrayOfIntegers.length; i++) {
            if (arrayOfIntegers[i] > max) {
                max = arrayOfIntegers[i];
            }
        }
        return max;
    }

    public int minimumIn(int[] arrayOfIntegers) {
        int min = arrayOfIntegers[0];
        for (int i = 1; i < arrayOfIntegers.length; i++) {
            if (arrayOfIntegers[i] < min) {
                min = arrayOfIntegers[i];
            }
        }
        return min;
    }

    public int sumOf(int[] arrayOfIntegers) {
        int sum = 0;
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            sum += arrayOfIntegers[i];
        }
        return sum;
    }
    
    public int sumOfEvenNumbersIn(int[] arrayOfIntegers) {
        int sum = 0;
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            if (arrayOfIntegers[i] % 2 == 0) {
                sum += arrayOfIntegers[i];
            }
        }
        return sum;
    }
    
    public int sumOfOddNumbersIn(int[] arrayOfIntegers) {
        int sum = 0;
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            if (arrayOfIntegers[i] % 2 != 0) {
                sum += arrayOfIntegers[i];
            }
        }
        return sum;
    }
    
}
