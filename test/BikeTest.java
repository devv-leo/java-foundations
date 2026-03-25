import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    Bike bike;

    @BeforeEach
    public void setUp() {
        bike = new Bike();
    }

    @Test
    public void bikeShouldTurnOn() {
        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void bikeShouldTurnOff() {
        bike.turnOn();
        bike.turnOff();
        assertFalse(bike.isOn());
    }
}