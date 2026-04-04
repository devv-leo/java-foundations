package week1.day1;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        int weightPounds = input.nextInt();

        System.out.print("Enter your height in inches: ");
        int heightInches = input.nextInt();

        double bmi = (double)(weightPounds * 703) / (heightInches * heightInches);

        System.out.printf("%nYour BMI = %.1f%n%n", bmi);

        System.out.println("BMI Categories:");
        System.out.println("Underweight : below 18.5");
        System.out.println("Normal : 18.5 - 24.9");
        System.out.println("Overweight : 25.0 - 29.9");
        System.out.println("Obese : 30.0 and above");

        if (bmi < 18.5) {
            System.out.println("\nYour category: Underweight");
        } else if (bmi < 25.0) {
            System.out.println("\nYour category: Normal weight");
        } else if (bmi < 30.0) {
            System.out.println("\nYour category: Overweight");
        } else {
            System.out.println("\nYour category: Obese");
        }

        input.close();
    }
}