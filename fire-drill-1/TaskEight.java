public class TaskEight {
    public static void main(String[] args) {
        
        int totalSum = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                int result = i;
                for (int j = 0; j < 5; j++) {
                    totalSum = totalSum + result;
                    result = result * i;
                }
            }
        }
        
        System.out.println(totalSum); 
    }
}