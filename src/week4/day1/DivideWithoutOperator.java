package week4.day1;

public class DivideWithoutOperator {
    public static int divide(int num, int divisor) {
        if (divisor > num) {
            return 0;
        }

        int result = 0;
        while (num >= divisor) {
            num = num - divisor;
            result++;
        }

        return result;
    }
}
