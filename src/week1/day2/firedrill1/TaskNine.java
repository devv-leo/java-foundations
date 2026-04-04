package week1.day2.firedrill1;

public class TaskNine {
    public static void main(String[] args) {
        
        long sum = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                long result = i;
                for (int j = 0; j < 5; j++) {
                    sum = sum + result; 
                    result = result * i;
                }
            }
        }
        
        long square = sum * sum; 
        
        System.out.println(square); 
    }
}
