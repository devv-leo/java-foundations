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
}
