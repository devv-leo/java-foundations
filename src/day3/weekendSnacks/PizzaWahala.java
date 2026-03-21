package day3.weekendSnacks;
import java.util.Scanner;

public class PizzaWahala {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of guests: ");
        int guests = scanner.nextInt();
        
        System.out.print("Enter pizza type (Sapa/Small Money/Big boys/Odogwu): ");
        scanner.nextLine();
        String pizzaType = scanner.nextLine();
        
        System.out.println("Guests: " + guests);
        System.out.println("Pizza Type: " + pizzaType);
        
        scanner.close();
    }
    
    public static int calculateBoxes(int guests, String pizzaType) {
        return 0;
    }
    
}
