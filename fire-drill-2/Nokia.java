import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        String mainMenu = """
                List of Menu Functions:
                1. Phone book
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                0. Exit
                """;

        while (true) {
            System.out.println(mainMenu);
            switch (inputCollector.nextInt()) {
                case 1  -> System.out.println("Phone book");
                case 2  -> System.out.println("Messages");
                case 3  -> System.out.println("Chat");
                case 4  -> System.out.println("Call register");
                case 5  -> System.out.println("Tones");
                case 6  -> System.out.println("Settings");
                case 7  -> System.out.println("Call divert");
                case 8  -> System.out.println("Games");
                case 9  -> System.out.println("Calculator");
                case 10 -> System.out.println("Reminders");
                case 11 -> System.out.println("Clock");
                case 12 -> System.out.println("Profiles");
                case 13 -> System.out.println("SIM services");
                case 0  -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}