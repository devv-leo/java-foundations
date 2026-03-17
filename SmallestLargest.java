import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = input.nextInt();

        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        System.out.print("Enter third integer: ");
        int c = input.nextInt();

        int sum = a + b + c;
        int average = sum / 3;
        int product = a * b * c;

        System.out.printf("Sum is %d\n", sum);
        System.out.printf("Average is %d\n", average);
        System.out.printf("Product is %d\n", product);

        input.close();
    }
}