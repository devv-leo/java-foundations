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
        for (int arrayOfInteger : arrayOfIntegers) {
            sum += arrayOfInteger;
        }
        return sum;
    }
    
    public int sumOfEvenNumbersIn(int[] arrayOfIntegers) {
        int sum = 0;
        for (int arrayOfInteger : arrayOfIntegers) {
            if (arrayOfInteger % 2 == 0) {
                sum += arrayOfInteger;
            }
        }
        return sum;
    }
    
    public int sumOfOddNumbersIn(int[] arrayOfIntegers) {
        int sum = 0;
        for (int arrayOfInteger : arrayOfIntegers) {
            if (arrayOfInteger % 2 != 0) {
                sum += arrayOfInteger;
            }
        }
        return sum;
    }

    public int[] maximumAndMinimumOf(int[] numbers) {
        int[] result = new int[2];
        result[0] = maximumIn(numbers);
        result[1] = minimumIn(numbers);
        return result;
    }

    public int noOfOddNumbersIn(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int noOfEvenNumbersIn(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
