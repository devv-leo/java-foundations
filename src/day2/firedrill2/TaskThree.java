package day2.firedrill2;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 10 scores.");

        for (int i = 0; i < 10; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            int score = scanner.nextInt();
            sum += score;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum/10);
        
    }
}

