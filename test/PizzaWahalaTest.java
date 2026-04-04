import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import week1.weekendSnacks.methods.PizzaWahala;

public class PizzaWahalaTest {

    @Test
    public void testCalculateBoxesSapa() {
        assertEquals(2, PizzaWahala.calculateBoxes(5, 4));
        assertEquals(3, PizzaWahala.calculateBoxes(10, 4));
        assertEquals(1, PizzaWahala.calculateBoxes(4, 4));
        assertEquals(1, PizzaWahala.calculateBoxes(3, 4));
    }

    @Test
    public void testCalculateBoxesSmallMoney() {
        assertEquals(2, PizzaWahala.calculateBoxes(10, 6));
        assertEquals(1, PizzaWahala.calculateBoxes(6, 6));
        assertEquals(2, PizzaWahala.calculateBoxes(7, 6));
        assertEquals(3, PizzaWahala.calculateBoxes(15, 6));
    }


    @Test
    public void testCalculateBoxesBigBoys() {
        assertEquals(2, PizzaWahala.calculateBoxes(15, 8));
        assertEquals(1, PizzaWahala.calculateBoxes(8, 8));
        assertEquals(2, PizzaWahala.calculateBoxes(9, 8));
        assertEquals(3, PizzaWahala.calculateBoxes(20, 8));
    }

    @Test
    public void testCalculateBoxesOdogwu() {
        assertEquals(4, PizzaWahala.calculateBoxes(45, 12));
        assertEquals(1, PizzaWahala.calculateBoxes(12, 12));
        assertEquals(2, PizzaWahala.calculateBoxes(13, 12));
        assertEquals(3, PizzaWahala.calculateBoxes(25, 12));
    }


    @Test
    public void testCalculateLeftoverSlices() {
        assertEquals(3, PizzaWahala.calculateLeftoverSlices(45, 4, 12));
        assertEquals(0, PizzaWahala.calculateLeftoverSlices(12, 1, 12));
        assertEquals(2, PizzaWahala.calculateLeftoverSlices(10, 3, 4));
        assertEquals(5, PizzaWahala.calculateLeftoverSlices(7, 2, 6));
        assertEquals(0, PizzaWahala.calculateLeftoverSlices(8, 1, 8));
    }

    @Test
    public void testCalculatePrice() {
        assertEquals(7500, PizzaWahala.calculatePrice(3, 2500));
        assertEquals(5200, PizzaWahala.calculatePrice(1, 5200));
        assertEquals(8000, PizzaWahala.calculatePrice(2, 4000));
        assertEquals(5800, PizzaWahala.calculatePrice(2, 2900));
        assertEquals(20800, PizzaWahala.calculatePrice(4, 5200));
    }
}
