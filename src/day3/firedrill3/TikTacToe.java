public class TikTacToe {
    public static void main(String... args) {
        char[][] characters = {
                {'x', 'o', 'x'},
                {'x', 'x', 'o'},
                {'o', 'x', 'x'}
        };

        for (char[] character : characters) {
            for (char c : character) {
//                System.out.print(c);
                if (c == 'x') {
                    System.out.print(1);
                }
                if (c == 'o') {
                    System.out.print(0);
                }
            }
            System.out.print("\n");
        }
    }
}
