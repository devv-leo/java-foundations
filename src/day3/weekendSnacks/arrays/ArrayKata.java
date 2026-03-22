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
}
