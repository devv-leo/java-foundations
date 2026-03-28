package weekendSnacks.week1;

import java.util.Scanner;

public class StudentGrade {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many students do you have?");
        int numberOfStudents = scanner.nextInt();
        
        System.out.println("How many subject do they offer?");
        int numberOfSubjects = scanner.nextInt();
        
        System.out.println("Saving >>>>>>>>>>>>");
        System.out.println("Saved successfully");
        
        int[][] grades = new int[numberOfStudents][numberOfSubjects];
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Entering score for student " + (i + 1));
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.println("Enter score for subject " + (j + 1));
                int grade = scanner.nextInt();
                while (grade < 0 || grade > 100) {
                    System.out.println("Invalid grade! Enter between 0 and 100: ");
                    grade = scanner.nextInt();
                }
                grades[i][j] = grade;
                System.out.println("Saving >>>>>>>>>>>>");
                System.out.println("Saved successfully");
            }
        }
        
        double[] studentAverages = calculateStudentAverages(grades);
        double classAverage = calculateClassAverage(studentAverages);
        int highest = findHighest(grades);
        int lowest = findLowest(grades);
        
        System.out.println("*******************");
        System.out.println("**Class Average: " + classAverage);
        System.out.println("**Highest Score: " + highest);
        System.out.println("**Lowest Score: " + lowest);
        System.out.println("*******************");
        
        scanner.close();
    }
    
    public static double[] calculateStudentAverages(int[][] grades) {
        double[] averages = new double[grades.length];
        for (int i = 0; i < grades.length; i++) {
            int sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            averages[i] = (double) sum / grades[i].length;
        }
        return averages;
    }
    
    public static double calculateClassAverage(double[] studentAverages) {
        double sum = 0;
        for (double avg : studentAverages) {
            sum += avg;
        }
        return sum / studentAverages.length;
    }
    
    public static int findHighest(int[][] grades) {
        int max = grades[0][0];
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                if (grades[i][j] > max) {
                    max = grades[i][j];
                }
            }
        }
        return max;
    }
    
    public static int findLowest(int[][] grades) {
        int min = grades[0][0];
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                if (grades[i][j] < min) {
                    min = grades[i][j];
                }
            }
        }
        return min;
    }
}
