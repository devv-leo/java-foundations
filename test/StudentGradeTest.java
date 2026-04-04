import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import week1.weekendSnacks.arrays.StudentGrade;

public class StudentGradeTest {

    @Test
    public void testCalculateStudentAverages() {
        int[][] grades1 = {{85, 92, 78}, {75, 80, 85}, {90, 70, 80}};
        double[] result1 = StudentGrade.calculateStudentAverages(grades1);
        assertEquals(85.0, result1[0]);
        assertEquals(80.0, result1[1]);
        assertEquals(80.0, result1[2]);
        
        int[][] grades2 = {{100}, {50, 75}};
        double[] result2 = StudentGrade.calculateStudentAverages(grades2);
        assertEquals(100.0, result2[0]);
        assertEquals(62.5, result2[1]);
    }

    @Test
    public void testCalculateClassAverage() {
        double[] studentAverages = {85.0, 80.0, 80.0};
        assertEquals(81.66666666666667, StudentGrade.calculateClassAverage(studentAverages), 0.01);

        double[] studentAverages2 = {75.0, 85.0};
        assertEquals(80.0, StudentGrade.calculateClassAverage(studentAverages2));
    }

    @Test
    public void testFindHighest() {
        int[][] grades1 = {{85, 92, 78}, {75, 80, 85}, {90, 70, 80}};
        assertEquals(92, StudentGrade.findHighest(grades1));

        int[][] grades2 = {{100, 50}, {75, 95}};
        assertEquals(100, StudentGrade.findHighest(grades2));

        int[][] grades3 = {{60, 60}, {60, 60}};
        assertEquals(60, StudentGrade.findHighest(grades3));
    }

    @Test
    public void testFindLowest() {
        int[][] grades1 = {{85, 92, 78}, {75, 80, 85}, {90, 70, 80}};
        assertEquals(70, StudentGrade.findLowest(grades1));

        int[][] grades2 = {{100, 50}, {75, 95}};
        assertEquals(50, StudentGrade.findLowest(grades2));

        int[][] grades3 = {{60, 60}, {60, 60}};
        assertEquals(60, StudentGrade.findLowest(grades3));
    }

    @Test
    public void testEdgeCases() {
        int[][] grades1 = {{85}};
        assertEquals(85, StudentGrade.findHighest(grades1));
        assertEquals(85, StudentGrade.findLowest(grades1));

        int[][] grades2 = {{100, 90, 80, 70, 60}};
        assertEquals(100, StudentGrade.findHighest(grades2));
        assertEquals(60, StudentGrade.findLowest(grades2));
    }
}
