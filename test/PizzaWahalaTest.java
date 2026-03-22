import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import day3.weekendSnacks.PizzaWahala;

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

}
