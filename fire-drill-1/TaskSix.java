public class TaskSix {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                int result = i; // target the number (4 or 8)
                for (int j = 0; j < 5; j++) {
                    System.out.print(result + " ");
                    result = result * i;
                }
            }
        }
    }
}
