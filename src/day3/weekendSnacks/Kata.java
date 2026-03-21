package day3.weekendSnacks;

public class Kata {
    public static void main(String[] args) {
        System.out.println("isEven(4): " + isEven(4));
        System.out.println("isPrimeNumber(7): " + isPrimeNumber(7));
        System.out.println("subtract(10, 3): " + subtract(10, 3));
        System.out.println("divide(10, 3): " + divide(10, 3));
        System.out.println("factorOf(6): " + factorOf(6));
        System.out.println("factorialOf(5): " + factorialOf(5));    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int subtract(int a, int b) {
        if (a > b) {
            return a - b;
        } else {
            return b - a;
        }
    }
    
    public static float divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return (float) a / b;
    }
    
    public static int factorOf(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
    
    public static boolean isSquare(int number) {
        if (number < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }
    
    public static boolean isPalindrome(int number) {
        if (number < 10000 || number > 99999) {
            return false;
        }
        String str = Integer.toString(number);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    
    public static long factorialOf(int number) {
        if (number < 0) {
            return 0;
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
    
}
