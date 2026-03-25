import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import day5.bike.Vehicle;

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

    @Test
    public void speedBetweenZeroAndTwentyShouldBeGearOne() {
        bike.speed = 15;
        bike.updateGear();
        assertEquals(1, bike.getGear());
    }

    @Test
    public void speedBetweenTwentyOneAndThirtyShouldBeGearTwo() {
        bike.speed = 25;
        bike.updateGear();
        assertEquals(2, bike.getGear());
    }

    @Test
    public void speedBetweenThirtyOneAndFortyShouldBeGearThree() {
        bike.speed = 35;
        bike.updateGear();
        assertEquals(3, bike.getGear());
    }

    @Test
    public void speedAbovefortyShouldBeGearFour() {
        bike.speed = 45;
        bike.updateGear();
        assertEquals(4, bike.getGear());
    }

    @Test
    public void accelerationOnGearOneShouldIncrementSpeedByOne() {
        bike.speed = 15;
        bike.accelerate();
        assertEquals(16, bike.getSpeed());
    }

    @Test
    public void accelerationOnGearTwoShouldIncrementSpeedByTwo() {
        bike.speed = 24;
        bike.accelerate();
        assertEquals(26, bike.getSpeed());
    }

    @Test
    public void accelerationOnGearThreeShouldIncrementSpeedByThree() {
        bike.speed = 35;
        bike.accelerate();
        assertEquals(38, bike.getSpeed());
    }

    @Test
    public void accelerationOnGearFourShouldIncrementSpeedByFour() {
        bike.speed = 44;
        bike.accelerate();
        assertEquals(48, bike.getSpeed());
    }
}