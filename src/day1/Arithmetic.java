package day1;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = input.nextInt();

        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        int squareA = a * a;
        int squareB = b * b;
        int sum = squareA + squareB;
        int difference = squareA - squareB;

        System.out.printf("Square of %d is %d\n", a, squareA);
        System.out.printf("Square of %d is %d\n", b, squareB);
        System.out.printf("Sum of the squares is %d\n", sum);
        System.out.printf("Difference of the squares = %d\n", difference);

        input.close();
    }
}
