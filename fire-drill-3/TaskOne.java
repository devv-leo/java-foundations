import java.util.Scanner;

public class TaskOne {
	public static void main(String[] args) {
		Scanner inputCollector = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num1 = inputCollector.nextInt();

		System.out.println("Enter another number");
		int num2 = inputCollector.nextInt();

		int product = 0;

		for (int i = 0; i < Math.abs(num2); i++) {
			product += num1;
		}

		if (num2 < 0) {
            		product = -product;
        	}

		System.out.println("Product is " + product);

	}

}
