package weekendSnacks.week1;

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
    
    public int sumOfEvenarrayOfIntegersIn(int[] arrayOfIntegers) {
        int sum = 0;
        for (int arrayOfInteger : arrayOfIntegers) {
            if (arrayOfInteger % 2 == 0) {
                sum += arrayOfInteger;
            }
        }
        return sum;
    }
    
    public int sumOfOddarrayOfIntegersIn(int[] arrayOfIntegers) {
        int sum = 0;
        for (int arrayOfInteger : arrayOfIntegers) {
            if (arrayOfInteger % 2 != 0) {
                sum += arrayOfInteger;
            }
        }
        return sum;
    }

    public int[] maximumAndMinimumOf(int[] arrayOfIntegers) {
        int[] result = new int[2];
        result[0] = maximumIn(arrayOfIntegers);
        result[1] = minimumIn(arrayOfIntegers);
        return result;
    }

    public int noOfOddarrayOfIntegersIn(int[] arrayOfIntegers) {
        int count = 0;
        for (int number : arrayOfIntegers) {
            if (number % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int noOfEvenarrayOfIntegersIn(int[] arrayOfIntegers) {
        int count = 0;
        for (int number : arrayOfIntegers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    
    public int[] evenarrayOfIntegersIn(int[] arrayOfIntegers) {
        int count = noOfEvenarrayOfIntegersIn(arrayOfIntegers);
        int[] evenarrayOfIntegers = new int[count];
        int index = 0;
        for (int number : arrayOfIntegers) {
            if (number % 2 == 0) {
                evenarrayOfIntegers[index++] = number;
            }
        }
        return evenarrayOfIntegers;
    }

    public int[] oddarrayOfIntegersIn(int[] arrayOfIntegers) {
        int count = noOfOddarrayOfIntegersIn(arrayOfIntegers);
        int[] oddarrayOfIntegers = new int[count];
        int index = 0;
        for (int number : arrayOfIntegers) {
            if (number % 2 != 0) {
                oddarrayOfIntegers[index++] = number;
            }
        }
        return oddarrayOfIntegers;
    }

    public int[] squarearrayOfIntegersIn(int[] arrayOfIntegers) {
        int count = 0;
        for (int number : arrayOfIntegers) {
            if (isSquare(number)) {
                count++;
            }
        }

        int[] squarearrayOfIntegers = new int[count];
        int index = 0;
        for (int number : arrayOfIntegers) {
            if (isSquare(number)) {
                squarearrayOfIntegers[index++] = number;
            }
        }
        return squarearrayOfIntegers;
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
