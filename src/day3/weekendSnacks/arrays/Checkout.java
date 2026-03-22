package day3.weekendSnacks.arrays;

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
        
        scanner.close();
    }
    
    public static double calculateSubtotal(double[] items) {
        double sum = 0;
        for (double price : items) {
            sum += price;
        }
        return sum;
    }
}
