package day1;

import java.util.Scanner;

public class GreatPyramidBuildRate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter estimated number of stones used: ");
        long totalStones = input.nextLong();

        System.out.print("Enter average weight of each stone (kg): ");
        double stoneWeightKg = input.nextDouble();

        System.out.print("Enter number of years taken to build: ");
        int years = input.nextInt();

        double totalWeightKg = totalStones * stoneWeightKg;

        int days  = years * 365;
        int hours = days  * 24;
        int minutes = hours * 60;

        System.out.printf("\nTotal weight of pyramid : %,.0f kg%n", totalWeightKg);
        System.out.printf("Weight placed per year  : %,.2f kg%n", totalWeightKg / years);
        System.out.printf("Weight placed per day   : %,.2f kg%n", totalWeightKg / days);
        System.out.printf("Weight placed per hour  : %,.2f kg%n", totalWeightKg / hours);
        System.out.printf("Weight placed per minute: %,.2f kg%n", totalWeightKg / minutes);

        input.close();
    }
}