package day3.weekendSnacks;

public class BackToSender {
    public static void main(String[] args) {
        
    }
    
    public static int calculateWage(int successfulDeliveries) {
        if (successfulDeliveries < 0 || successfulDeliveries > 100) {
            return 0;
        }
        
        int percentage = (successfulDeliveries * 100) / 100;
        int basePay = 5000;
        int totalPay = basePay;
        
        if (percentage < 50) {
            totalPay = totalPay + (successfulDeliveries * 160);
        } else if (percentage >= 50 && percentage < 60) {
            totalPay = totalPay + (successfulDeliveries * 200);
        } else if (percentage >= 60 && percentage < 70) {
            totalPay = totalPay + (successfulDeliveries * 250);
        } else {
            totalPay = totalPay + (successfulDeliveries * 500);
        }
        
        return totalPay;
    }
}
