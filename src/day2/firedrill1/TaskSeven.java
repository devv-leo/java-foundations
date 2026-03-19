public class TaskSeven {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                int result = i;
                int sum = 0;
                
                for (int j = 0; j < 5; j++) {
                    sum = sum + result;
                    result = result * i; 
                }
                
                System.out.print(sum + " "); 
            }
        }
    }
}