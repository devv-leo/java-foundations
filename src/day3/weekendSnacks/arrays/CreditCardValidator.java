package day3.weekendSnacks.arrays;
import java.util.Scanner;

public class CreditCardValidator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello, Kindly Enter Card details to verify:");
        String cardNumber = scanner.nextLine();
        
        scanner.close();
    }
}
