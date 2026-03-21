package day3.weekendSnacks;

public class Kata {
    public static void main(String[] args) {
        System.out.println("isEven(4): " + isEven(4));
        System.out.println("isPrimeNumber(7): " + isPrimeNumber(7));
        System.out.println("subtract(10, 3): " + subtract(10, 3));
        System.out.println("divide(10, 3): " + divide(10, 3));
        System.out.println("factorOf(6): " + factorOf(6));
    }
    
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
    
}
