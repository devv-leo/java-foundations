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
        
        if (percentage < 50) {
            return basePay;
        }
        
        return basePay;
    }
}
