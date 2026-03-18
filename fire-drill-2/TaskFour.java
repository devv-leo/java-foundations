import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 10 scores.");

        for (int i = 0; i < 10; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            int score = scanner.nextInt();
            
            if (i % 2 == 0) {
                sum += score;
            }
        }

        System.out.println("Sum of even indexes is " + sum);
        
    }
}
