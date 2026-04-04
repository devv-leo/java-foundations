import org.junit.jupiter.api.Test;

import week2.day2.TV.Television;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    Television tv = new Television();

    @Test
    void turnOnTelevision() {
        tv.turnOn();
        assertTrue(tv.isOn());
    }

    @Test
    void turnOffTelevision() {
        tv.turnOn();
        tv.turnOff();
        assertFalse(tv.isOn());
    }

}