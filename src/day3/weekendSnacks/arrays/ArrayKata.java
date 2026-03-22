package day3.weekendSnacks.arrays;

public class ArrayKata {

    public int maximumIn(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public int minimumIn(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public int sumOf(int[] numbers) {
        int sum = 0;
        for (int arrayOfInteger : numbers) {
            sum += arrayOfInteger;
        }
        return sum;
    }
    
    public int sumOfEvenNumbersIn(int[] numbers) {
        int sum = 0;
        for (int arrayOfInteger : numbers) {
            if (arrayOfInteger % 2 == 0) {
                sum += arrayOfInteger;
            }
        }
        return sum;
    }
    
    public int sumOfOddNumbersIn(int[] numbers) {
        int sum = 0;
        for (int arrayOfInteger : numbers) {
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
    
}
