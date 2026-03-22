package day1;

import java.util.Scanner;

public class WorldPopulationGrowth {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter current world population: ");
        long population = input.nextLong();

        System.out.print("Enter annual growth rate (e.g. 0.9 for 0.9%): ");
        double growthRate = input.nextDouble();

        double rate = growthRate / 100;

        long yearOne = (long)(population * (1 + rate));
        long yearTwo = (long)(yearOne * (1 + rate));
        long yearThree = (long)(yearTwo * (1 + rate));
        long yearFour = (long)(yearThree * (1 + rate));
        long yearFive = (long)(yearFour * (1 + rate));

        System.out.printf("After 1 year  : %,d%n", yearOne);
        System.out.printf("After 2 years : %,d%n", yearTwo);
        System.out.printf("After 3 years : %,d%n", yearThree);
        System.out.printf("After 4 years : %,d%n", yearFour);
        System.out.printf("After 5 years : %,d%n", yearFive);

        input.close();
    }
}