package week1.weekendSnacks.arrays;

import java.util.Scanner;

public class Checkout {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of items: ");
        int numberOfItems = scanner.nextInt();
        
        double[] items = new double[numberOfItems];
        
        for (int i = 0; i < numberOfItems; i++) {
            System.out.print("Enter price for item " + (i + 1) + ": ");
            items[i] = scanner.nextDouble();
        }
        
        double subtotal = calculateSubtotal(items);
        double discount = calculateDiscount(subtotal);
        double total = subtotal - discount;
        
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount: " + discount);
        System.out.println("Total: " + total);
        
        scanner.close();
    }
    
    public static double calculateSubtotal(double[] items) {
        double sum = 0;
        for (double price : items) {
            sum += price;
        }
        return sum;
    }
    
    public static double calculateDiscount(double subtotal) {
        if (subtotal >= 200) {
            return subtotal * 0.10;
        } else if (subtotal >= 100) {
            return subtotal * 0.05;
        } else if (subtotal >= 50) {
            return subtotal * 0.03;
        } else {
            return 0;
        }
    }
}
