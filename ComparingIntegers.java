import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int square = number * number;

        if (number > 100) System.out.printf("%d is greater than 100%n", number);
        if (number == 100) System.out.printf("%d is equal to 100%n", number);
        if (number < 100) System.out.printf("%d is less than 100%n", number);


    }
}