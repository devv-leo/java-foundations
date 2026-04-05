package week2.day2;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(50, 20, 30));
        System.out.println(lcm(1, 2, 3, 4, 5, 6));
    }

    public static int lcm(int... numbers) {
        if (numbers.length == 0) return 0;
        if (numbers.length == 1) return numbers[0];
        
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        int lcm = max;
        
        while (true) {
            boolean divisible = true;
            for (int num : numbers) {
                if (lcm % num != 0) {
                    divisible = false;
                    break;
                }
            }
            
            if (divisible) {
                return lcm;
            }
            
            lcm += max;
        }
    }
}
