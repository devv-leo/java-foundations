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

        String phoneBookOptions = """
                Options:
                1. Type of view
                2. Memory status
                0. Back
                """;

        String messagesMenu = """
                Messages:
                1. Write messages
                2. Inbox
                3. Outbox
                4. Picture messages
                5. Templates
                6. Smileys
                7. Message settings
                8. Info service
                9. Voice mailbox number
                10. Service command editor
                0. Back
                """;

        String messageSettings = """
                Message settings:
                1. Set 1
                2. Common
                0. Back
                """;

        String messageSet1 = """
                Set 1:
                1. Message centre number
                2. Messages sent as
                3. Message validity
                0. Back
                """;

        String messageCommon = """
                Common:
                1. Delivery reports
                2. Reply via same centre
                3. Character support
                0. Back
                """;

        String callRegister = """
                Call register:
                1. Missed calls
                2. Received calls
                3. Dialled numbers
                4. Erase recent call lists
                5. Show call duration
                6. Show call costs
                7. Call cost settings
                8. Prepaid credit
                0. Back
                """;

        String showCallDuration = """
                Show call duration:
                1. Last call duration
                2. All calls' duration
                3. Received calls' duration
                4. Dialled calls' duration
                5. Clear timers
                0. Back
                """;

        String showCallCosts = """
                Show call costs:
                1. Last call cost
                2. All calls' cost
                3. Clear counters
                0. Back
                """;

        String callCostSettings = """
                Call cost settings:
                1. Call cost limit
                2. Show costs in
                0. Back
                """;

        while (true) {
            System.out.println(mainMenu);
            switch (inputCollector.nextInt()) {

                case 1 -> {
                    System.out.println(phoneBookMenu);
                    switch (inputCollector.nextInt()) {
                        case 1  -> System.out.println("Search");
                        case 2  -> System.out.println("Service Nos.");
                        case 3  -> System.out.println("Add name");
                        case 4  -> System.out.println("Erase");
                        case 5  -> System.out.println("Edit");
                        case 6  -> System.out.println("Assign tone");
                        case 7  -> System.out.println("Send b'card");
                        case 8  -> {
                            System.out.println(phoneBookOptions);
                            switch (inputCollector.nextInt()) {
                                case 1 -> System.out.println("Type of view");
                                case 2 -> System.out.println("Memory status");
                                case 0 -> System.out.println("Back");
                                default -> System.out.println("Invalid option.");
                            }
                        }
                        case 9  -> System.out.println("Speed dials");
                        case 10 -> System.out.println("Voice tags");
                        case 0  -> System.out.println("Back");
                        default -> System.out.println("Invalid option.");
                    }
                }

                case 2 -> {
                    System.out.println(messagesMenu);
                    switch (inputCollector.nextInt()) {
                        case 1  -> System.out.println("Write messages");
                        case 2  -> System.out.println("Inbox");
                        case 3  -> System.out.println("Outbox");
                        case 4  -> System.out.println("Picture messages");
                        case 5  -> System.out.println("Templates");
                        case 6  -> System.out.println("Smileys");
                        case 7  -> {
                            System.out.println(messageSettings);
                            switch (inputCollector.nextInt()) {
                                case 1 -> {
                                    System.out.println(messageSet1);
                                    switch (inputCollector.nextInt()) {
                                        case 1 -> System.out.println("Message centre number");
                                        case 2 -> System.out.println("Messages sent as");
                                        case 3 -> System.out.println("Message validity");
                                        case 0 -> System.out.println("Back");
                                        default -> System.out.println("Invalid option.");
                                    }
                                }
                                case 2 -> {
                                    System.out.println(messageCommon);
                                    switch (inputCollector.nextInt()) {
                                        case 1 -> System.out.println("Delivery reports");
                                        case 2 -> System.out.println("Reply via same centre");
                                        case 3 -> System.out.println("Character support");
                                        case 0 -> System.out.println("Back");
                                        default -> System.out.println("Invalid option.");
                                    }
                                }
                                case 0  -> System.out.println("Back");
                                default -> System.out.println("Invalid option.");
                            }
                        }
                        case 8  -> System.out.println("Info service");
                        case 9  -> System.out.println("Voice mailbox number");
                        case 10 -> System.out.println("Service command editor");
                        case 0  -> System.out.println("Back");
                        default -> System.out.println("Invalid option.");
                    }
                }

                case 3 -> System.out.println("Chat");

                case 4 -> {
                    System.out.println(callRegister);
                    switch (inputCollector.nextInt()) {
                        case 1 -> System.out.println("Missed calls");
                        case 2 -> System.out.println("Received calls");
                        case 3 -> System.out.println("Dialled numbers");
                        case 4 -> System.out.println("Erase recent call lists");
                        case 5 -> {
                            System.out.println(showCallDuration);
                            switch (inputCollector.nextInt()) {
                                case 1 -> System.out.println("Last call duration");
                                case 2 -> System.out.println("All calls' duration");
                                case 3 -> System.out.println("Received calls' duration");
                                case 4 -> System.out.println("Dialled calls' duration");
                                case 5 -> System.out.println("Clear timers");
                                case 0 -> System.out.println("Back");
                                default -> System.out.println("Invalid option.");
                            }
                        }
                        case 6 -> {
                            System.out.println(showCallCosts);
                            switch (inputCollector.nextInt()) {
                                case 1 -> System.out.println("Last call cost");
                                case 2 -> System.out.println("All calls' cost");
                                case 3 -> System.out.println("Clear counters");
                                case 0 -> System.out.println("Back");
                                default -> System.out.println("Invalid option.");
                            }
                        }
                        case 7 -> {
                            System.out.println(callCostSettings);
                            switch (inputCollector.nextInt()) {
                                case 1 -> System.out.println("Call cost limit");
                                case 2 -> System.out.println("Show costs in");
                                case 0 -> System.out.println("Back");
                                default -> System.out.println("Invalid option.");
                            }
                        }
                        case 8  -> System.out.println("Prepaid credit");
                        case 0  -> System.out.println("Back");
                        default -> System.out.println("Invalid option.");
                    }
                }

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