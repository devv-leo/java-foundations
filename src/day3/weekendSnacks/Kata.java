package day3.weekendSnacks;

public class Kata {
    public static void main(String[] args) {
        
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
}
