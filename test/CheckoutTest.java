import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import day3.weekendSnacks.arrays.Checkout;

public class CheckoutTest {

    @Test
    public void testCalculateSubtotal() {
        double[] items1 = {10.0, 20.0, 30.0};
        assertEquals(60.0, Checkout.calculateSubtotal(items1));
        
        double[] items2 = {5.5, 15.25, 25.0, 50.0};
        assertEquals(95.75, Checkout.calculateSubtotal(items2));
        
        double[] items3 = {100.0};
        assertEquals(100.0, Checkout.calculateSubtotal(items3));
        
        double[] items4 = {};
        assertEquals(0.0, Checkout.calculateSubtotal(items4));
    }

    @Test
    public void testCalculateDiscount() {
        assertEquals(0.0, Checkout.calculateDiscount(25.0));
        assertEquals(0.0, Checkout.calculateDiscount(49.99));
        
        assertEquals(1.5, Checkout.calculateDiscount(50.0));
        assertEquals(3.0, Checkout.calculateDiscount(100.0));
        assertEquals(7.5, Checkout.calculateDiscount(150.0));
        
        assertEquals(20.0, Checkout.calculateDiscount(200.0));
        assertEquals(30.0, Checkout.calculateDiscount(300.0));
        assertEquals(50.0, Checkout.calculateDiscount(500.0));
    }

    @Test
    public void testEdgeCases() {
        double[] items = {0.0, -10.0, 100.0};
        assertEquals(90.0, Checkout.calculateSubtotal(items));
        
        assertEquals(3.0, Checkout.calculateDiscount(100.0));
        assertEquals(0.0, Checkout.calculateDiscount(0.0));
    }
    /*
    @Test
    public void testDecimalValues() {
        double[] items = {19.99, 5.50, 12.75};
        assertEquals(38.24, Checkout.calculateSubtotal(items));
        
        assertEquals(1.1472, Checkout.calculateDiscount(38.24), 0.01);
        assertEquals(0.0, Checkout.calculateDiscount(49.99), 0.01);
    } */
}
