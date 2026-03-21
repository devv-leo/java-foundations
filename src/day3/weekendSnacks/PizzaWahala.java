package day3.weekendSnacks;
import java.util.Scanner;

public class PizzaWahala {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of guests: ");
        int guests = scanner.nextInt();

        String menu = """
                Enter the Pizza Type:
                Press 1 -> Sapa Size (4 slices)
                Press 2 -> Small Money (6 slices)
                Press 3 -> Big Boys (8 slices)
                Press 4 -> Odogwu (12 slices)
                """;

        System.out.print(menu);
        int pizzaType = scanner.nextInt();
        scanner.close();
    
        int pricePerBox = 0;
        int slices = 0;
        String size;
        switch (pizzaType) {
            case 1 -> {
                slices = 4;
                pricePerBox = 2500;
                size = "Sapa size";
            }
            case 2 -> {
                slices = 6;
                pricePerBox = 2900;
                size = "Small money size";
            }
            case 3 -> {
                slices = 8;
                pricePerBox = 4000;
                size = "Big boys size";
            }
            case 4-> {
                slices = 12;
                pricePerBox = 5200;
                size = "Odogwu size";
            }
            default -> {
                System.out.println("Please pick a valid value");
                return;
            }
        }

        int boxes = (int) Math.ceil((double) guests / slices);
        int leftoverSlices = slices * boxes - guests;
        int totalPrice = boxes * pricePerBox;
    
    }
    
}
