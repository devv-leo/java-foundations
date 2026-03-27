package day6;

public class Factor {

    public static int[] getFactors(int number) {
        int count = 0;
        int n = number;
        for (int i = 2; i <= number; i++) {
            while (n % i == 0) {
                count++;
                n /= i;
            }
        }
        
        int[] factors = new int[count];
        int index = 0;
        n = number;
        for (int i = 2; i <= number; i++) {
            while (n % i == 0) {
                factors[index] = i;
                index++;
                n /= i;
            }
        }
        
        return factors;
    }
}
