import java.util.Scanner;

public class SquareAndSumDifference {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = input.nextInt();

        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        int squareA = a * a;

        System.out.printf("Square of %d = %d%n", a, squareA);
        
    }
}