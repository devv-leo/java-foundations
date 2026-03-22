package day3.weekendSnacks.methods;

public class BackToSender {
    static void main(String[] args) {
        System.out.println("80 deliveries: " + calculateWage(80));
        System.out.println("25 deliveries: " + calculateWage(25));
        System.out.println("70 deliveries: " + calculateWage(70));
        System.out.println("100 deliveries: " + calculateWage(100));
    }
    
    public static int calculateWage(int successfulDeliveries) {
        if (successfulDeliveries < 0 || successfulDeliveries > 100) {
            return 0;
        }
        
        int totalPay = 5000;

        if (successfulDeliveries < 50) {
            totalPay = totalPay + (successfulDeliveries * 160);
        } else if (successfulDeliveries < 60) {
            totalPay = totalPay + (successfulDeliveries * 200);
        } else if (successfulDeliveries < 70) {
            totalPay = totalPay + (successfulDeliveries * 250);
        } else {
            totalPay = totalPay + (successfulDeliveries * 500);
        }
        
        return totalPay;
    }
}
