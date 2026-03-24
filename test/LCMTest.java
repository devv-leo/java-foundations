import day5.LCM;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LCMTest {
    
    @Test
    public void testLCM() {
        assertEquals(12, LCM.lcm(4, 6));
        assertEquals(30, LCM.lcm(6, 10));
    }
    
    @Test
    public void testMultipleNumbers() {
        assertEquals(12, LCM.lcm(2, 3, 4));
        assertEquals(60, LCM.lcm(1, 2, 3, 4, 5, 6));
        assertEquals(300, LCM.lcm(50, 20, 30));
    }
}
