import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import day3.weekendSnacks.arrays.StudentGrade;

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

}
