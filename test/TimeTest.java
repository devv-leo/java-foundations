import day4.Time;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TimeTest {
    public static void main(String[] args) {

        Time time = new Time();

        displayTime("After time object is created", time);
        System.out.println();

        time.setTime(13, 27, 6);
        displayTime("After calling setTime", time);
        System.out.println();

        try {
            time.setTime(99, 99, 99);
        }
        catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }

        try {
            time.setTime(12, 99, 39);
        }
        catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }

        try {
            time.setTime(19, 29, 60);
        }
        catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }

        displayTime("After calling setTime with invalid values", time);
    }

    private static void displayTime(String header, Time t) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());
    }



    @Test
    void testUniversalTime() {
        Time time = new Time();
        time.setTime(13, 27, 6);
        assertEquals("13:27:06", time.toUniversalString());
    }

    @Test
    void testStandardTime() {
        Time time = new Time();
        time.setTime(13, 27, 6);
        assertEquals("1:27:06 PM", time.toString());
    }

    @Test
    void testInvalidTime() {
        Time time = new Time();
        assertThrows(IllegalArgumentException.class, () -> {
            time.setTime(99, 99, 99);
        });
    }
}