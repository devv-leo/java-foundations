package day3.weekendSnacks.arrays;
import java.util.Scanner;

public class CreditCardValidator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello, Kindly Enter Card details to verify:");
        String cardNumber = scanner.nextLine();
        
        String cardType = getCardType(cardNumber);
        
        scanner.close();
    }
    
    public static String getCardType(String cardNumber) {
        if (cardNumber.startsWith("37")) {
            return "American Express";
        }
        
        char firstDigit = cardNumber.charAt(0);
        
        switch (firstDigit) {
            case '4':
                return "Visa";
            case '5':
                return "MasterCard";
            case '6':
                return "Discover";
            default:
                return "Invalid";
        }
    }
    
    public static boolean isValidLength(String cardNumber, String cardType) {
        int length = cardNumber.length();
        
        switch (cardType) {
            case "Visa":
                return length == 13 || length == 16;
            case "MasterCard":
                return length == 16;
            case "American Express":
                return length == 15;
            case "Discover":
                return length == 16;
            default:
                return false;
        }
    }
    
    public static boolean isValidLuhn(String cardNumber) {
        int sum = 0;
        boolean doubleDigit = false;
        
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(cardNumber.charAt(i));
            
            if (doubleDigit) {
                digit *= 2;
                if (digit > 9) {
                    digit = digit % 10 + 1;
                }
            }
            
            sum += digit;
            doubleDigit = !doubleDigit;
        }
        
        return sum % 10 == 0;
    }
}
