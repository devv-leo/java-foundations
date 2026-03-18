import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {

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
                """;

        String phoneBookMenu = """
                Phone book:
                1. Search
                2. Service Nos.
                3. Add name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send b'card
                8. Options
                9. Speed dials
                10. Voice tags
                0. Back
                """;

        System.out.println(mainMenu);
        System.out.println(phoneBookMenu);
    }
}