import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import day3.weekendSnacks.arrays.StudentGrade;

public class StudentGradeTest {

    @Test
    public void testCalculateAverage() {
        int[] grades1 = {85, 92, 78};
        assertEquals(85.0, StudentGrade.calculateAverage(grades1));
        
        int[] grades2 = {100, 50, 75};
        assertEquals(75.0, StudentGrade.calculateAverage(grades2));
        
        int[] grades3 = {90};
        assertEquals(90.0, StudentGrade.calculateAverage(grades3));
        
        int[] grades4 = {};
        assertEquals(0.0, StudentGrade.calculateAverage(grades4));
    }

    @Test
    public void testFindHighest() {
        int[] grades1 = {85, 92, 78};
        assertEquals(92, StudentGrade.findHighest(grades1));
        
        int[] grades2 = {100, 50, 75};
        assertEquals(100, StudentGrade.findHighest(grades2));
        
        int[] grades3 = {60, 60, 60};
        assertEquals(60, StudentGrade.findHighest(grades3));
        
        int[] grades4 = {90};
        assertEquals(90, StudentGrade.findHighest(grades4));
    }

    @Test
    public void testFindLowest() {
        int[] grades1 = {85, 92, 78};
        assertEquals(78, StudentGrade.findLowest(grades1));
        
        int[] grades2 = {100, 50, 75};
        assertEquals(50, StudentGrade.findLowest(grades2));
        
        int[] grades3 = {60, 60, 60};
        assertEquals(60, StudentGrade.findLowest(grades3));
        
        int[] grades4 = {90};
        assertEquals(90, StudentGrade.findLowest(grades4));
    }

    @Test
    public void testEdgeCases() {
        int[] grades1 = {85};
        assertEquals(85, StudentGrade.findHighest(grades1));
        assertEquals(85, StudentGrade.findLowest(grades1));
        
        int[] grades2 = {100, 90, 80, 70, 60};
        assertEquals(100, StudentGrade.findHighest(grades2));
        assertEquals(60, StudentGrade.findLowest(grades2));
    }

    @Test
    public void testEmptyArray() {
        int[] grades = {};
        assertEquals(0.0, StudentGrade.calculateAverage(grades));
    }
}
