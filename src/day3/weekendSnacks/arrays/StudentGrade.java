package day3.weekendSnacks.arrays;
import java.util.Scanner;

public class StudentGrade {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        int[] grades = new int[numberOfStudents];
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }
        
        scanner.close();
    }
}
