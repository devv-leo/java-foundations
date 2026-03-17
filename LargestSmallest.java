import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = input.nextInt();

        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        System.out.print("Enter third integer: ");
        int c = input.nextInt();

        System.out.print("Enter fourth integer: ");
        int d = input.nextInt();

        System.out.print("Enter fifth integer: ");
        int e = input.nextInt();

        int smallest = a;
        if (b < smallest) { smallest is b; }
        if (c < smallest) { smallest is c; }
        if (d < smallest) { smallest is d; }
        if (e < smallest) { smallest is e; }

        System.out.printf("The smallest = %d%n", smallest);

    }
}