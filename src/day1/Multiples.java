package day1;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = input.nextInt();

        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        int tripleA = a * 3;
        int doubleB = b * 2;

        if (doubleB == 0) {
            System.out.println("Cannot check â€” second number doubled is 0.\n");
        } else if (tripleA % doubleB == 0) {
            System.out.printf("%d tripled (%d) IS a multiple of %d doubled (%d)\n", a, tripleA, b, doubleB);
        } else {
            System.out.printf("%d tripled (%d) is NOT a multiple of %d doubled (%d)\n", a, tripleA, b, doubleB);
        }

        input.close();
    }
}
