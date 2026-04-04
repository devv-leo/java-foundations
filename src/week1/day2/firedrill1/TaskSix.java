package week1.day2.firedrill1;

public class TaskSix {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                int result = i;
                for (int j = 0; j < 5; j++) {
                    System.out.print(result + " ");
                    result = result * i;
                }
            }
        }
    }
}

