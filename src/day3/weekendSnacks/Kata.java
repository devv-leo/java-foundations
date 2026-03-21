package day3.weekendSnacks;

public class Kata {
    public static void main(String[] args) {
        System.out.println("isEven(4): " + isEven(4));
        System.out.println("isPrimeNumber(7): " + isPrimeNumber(7));
        System.out.println("subtract(10, 3): " + subtract(10, 3));
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
    
}
