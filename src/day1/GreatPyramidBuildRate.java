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

        input.close();
    }
}