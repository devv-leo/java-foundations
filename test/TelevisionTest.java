import day5.TV.Television;
import org.junit.jupiter.api.Test;

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