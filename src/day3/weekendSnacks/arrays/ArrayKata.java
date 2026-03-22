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
    
    public int[] evenNumbersIn(int[] numbers) {
        int count = noOfEvenNumbersIn(numbers);
        int[] evenNumbers = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[index++] = number;
            }
        }
        return evenNumbers;
    }

    public int[] oddNumbersIn(int[] numbers) {
        int count = noOfOddNumbersIn(numbers);
        int[] oddNumbers = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers[index++] = number;
            }
        }
        return oddNumbers;
    }

    public int[] squareNumbersIn(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (isSquare(number)) {
                count++;
            }
        }

        int[] squareNumbers = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (isSquare(number)) {
                squareNumbers[index++] = number;
            }
        }
        return squareNumbers;
    }

    private boolean isSquare(int number) {
        if (number < 0) {
            return false;
        }
        int i = 0;
        while (i++ < number) {
            if (i * i == number) {
                return true;
            }
        }
        return false;
    }
}
