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

        String phoneBook = """
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

        String options = """
                Options:
                1. Type of view
                2. Memory status
                0. Back
                """;

        String messages = """
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

        String set1 = """
                Set 1:
                1. Message centre number
                2. Messages sent as
                3. Message validity
                0. Back
                """;

        String common = """
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

        String tones = """
                Tones:
                1. Ringing tone
                2. Ringing volume
                3. Incoming call alert
                4. Composer
                5. Message alert tone
                6. Keypad tones
                7. Warning and game tones
                8. Vibrating alert
                9. Screen saver
                0. Back
                """;

        String settings = """
                Settings:
                1. Call settings
                2. Phone settings
                3. Security settings
                4. Restore factory settings
                0. Back
                """;

        String callSettings = """
                Call settings:
                1. Automatic redial
                2. Speed dialling
                3. Call waiting options
                4. Own number sending
                5. Phone line in use
                6. Automatic answer
                0. Back
                """;

        String phoneSettings = """
                Phone settings:
                1. Language
                2. Cell info display
                3. Welcome note
                4. Network selection
                5. Lights
                6. Confirm SIM service actions
                0. Back
                """;

        String securitySettings = """
                Security settings:
                1. PIN code request
                2. Call barring service
                3. Fixed dialling
                4. Closed user group
                5. Phone security
                6. Change access codes
                0. Back
                """;

        String clock = """
                Clock:
                1. Alarm clock
                2. Clock settings
                3. Date setting
                4. Stopwatch
                5. Countdown timer
                6. Auto update of date and time
                0. Back
                """;

        String back = "0. Back";

        while (true) {
            System.out.println(mainMenu);
            switch (inputCollector.nextInt()) {

                case 1 -> {
                    System.out.println(phoneBook);
                    switch (inputCollector.nextInt()) {
                        case 1 -> {
                            System.out.println("Search\n" + back);
                            inputCollector.nextInt();
                        }
                        case 2 -> {
                            System.out.println("Service Nos.\n" + back);
                            inputCollector.nextInt();
                        }
                        case 3 -> {
                            System.out.println("Add name\n" + back);
                            inputCollector.nextInt();
                        }
                        case 4 -> {
                            System.out.println("Erase\n" + back);
                            inputCollector.nextInt();
                        }
                        case 5 -> {
                            System.out.println("Edit\n" + back);
                            inputCollector.nextInt();
                        }
                        case 6 -> {
                            System.out.println("Assign tone\n" + back);
                            inputCollector.nextInt();
                        }
                        case 7 -> {
                            System.out.println("Send b'card\n" + back);
                            inputCollector.nextInt();
                        }
                        case 8 -> {
                            System.out.println(options);
                            switch (inputCollector.nextInt()) {
                                case 1 -> {
                                    System.out.println("Type of view\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 2 -> {
                                    System.out.println("Memory status\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 0 -> {}
                                default -> System.out.println("Invalid option.");
                            }
                        }
                        case 9 -> {
                            System.out.println("Speed dials\n" + back);
                            inputCollector.nextInt();
                        }
                        case 10 -> {
                            System.out.println("Voice tags\n" + back);
                            inputCollector.nextInt();
                        }
                        case 0  -> {}
                        default -> System.out.println("Invalid option.");
                    }
                }

                case 2 -> {
                    System.out.println(messages);
                    switch (inputCollector.nextInt()) {
                        case 1 -> {
                            System.out.println("Write messages\n" + back);
                            inputCollector.nextInt();
                        }
                        case 2 -> {
                            System.out.println("Inbox\n" + back);
                            inputCollector.nextInt();
                        }
                        case 3 -> {
                            System.out.println("Outbox\n" + back);
                            inputCollector.nextInt();
                        }
                        case 4 -> {
                            System.out.println("Picture messages\n" + back);
                            inputCollector.nextInt();
                        }
                        case 5 -> {
                            System.out.println("Templates\n" + back);
                            inputCollector.nextInt();
                        }
                        case 6 -> {
                            System.out.println("Smileys\n" + back);
                            inputCollector.nextInt();
                        }
                        case 7 -> {
                            System.out.println(messageSettings);
                            switch (inputCollector.nextInt()) {
                                case 1 -> {
                                    System.out.println(set1);
                                    switch (inputCollector.nextInt()) {
                                        case 1 -> {
                                            System.out.println("Message centre number\n" + back);
                                            inputCollector.nextInt();
                                        }
                                        case 2 -> {
                                            System.out.println("Messages sent as\n" + back);
                                            inputCollector.nextInt();
                                        }
                                        case 3 -> {
                                            System.out.println("Message validity\n" + back);
                                            inputCollector.nextInt();
                                        }
                                        case 0  -> {}
                                        default -> System.out.println("Invalid option.");
                                    }
                                }
                                case 2 -> {
                                    System.out.println(common);
                                    switch (inputCollector.nextInt()) {
                                        case 1 -> {
                                            System.out.println("Delivery reports\n" + back);
                                            inputCollector.nextInt();
                                        }
                                        case 2 -> {
                                            System.out.println("Reply via same centre\n" + back);
                                            inputCollector.nextInt();
                                        }
                                        case 3 -> {
                                            System.out.println("Character support\n" + back);
                                            inputCollector.nextInt();
                                        }
                                        case 0  -> {}
                                        default -> System.out.println("Invalid option.");
                                    }
                                }
                                case 0  -> {}
                                default -> System.out.println("Invalid option.");
                            }
                        }
                        case 8 -> {
                            System.out.println("Info service\n" + back);
                            inputCollector.nextInt();
                        }
                        case 9 -> {
                            System.out.println("Voice mailbox number\n" + back);
                            inputCollector.nextInt();
                        }
                        case 10 -> {
                            System.out.println("Service command editor\n" + back);
                            inputCollector.nextInt();
                        }
                        case 0  -> {}
                        default -> System.out.println("Invalid option.");
                    }
                }

                case 3 -> {
                    System.out.println("Chat\n" + back);
                    inputCollector.nextInt();
                }

                case 4 -> {
                    System.out.println(callRegister);
                    switch (inputCollector.nextInt()) {
                        case 1 -> {
                            System.out.println("Missed calls\n" + back);
                            inputCollector.nextInt();
                        }
                        case 2 -> {
                            System.out.println("Received calls\n" + back);
                            inputCollector.nextInt();
                        }
                        case 3 -> {
                            System.out.println("Dialled numbers\n" + back);
                            inputCollector.nextInt();
                        }
                        case 4 -> {
                            System.out.println("Erase recent call lists\n" + back);
                            inputCollector.nextInt();
                        }
                        case 5 -> {
                            System.out.println(showCallDuration);
                            switch (inputCollector.nextInt()) {
                                case 1 -> {
                                    System.out.println("Last call duration\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 2 -> {
                                    System.out.println("All calls' duration\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 3 -> {
                                    System.out.println("Received calls' duration\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 4 -> {
                                    System.out.println("Dialled calls' duration\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 5 -> {
                                    System.out.println("Clear timers\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 0  -> {}
                                default -> System.out.println("Invalid option.");
                            }
                        }
                        case 6 -> {
                            System.out.println(showCallCosts);
                            switch (inputCollector.nextInt()) {
                                case 1 -> {
                                    System.out.println("Last call cost\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 2 -> {
                                    System.out.println("All calls' cost\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 3 -> {
                                    System.out.println("Clear counters\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 0  -> {}
                                default -> System.out.println("Invalid option.");
                            }
                        }
                        case 7 -> {
                            System.out.println(callCostSettings);
                            switch (inputCollector.nextInt()) {
                                case 1 -> {
                                    System.out.println("Call cost limit\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 2 -> {
                                    System.out.println("Show costs in\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 0  -> {}
                                default -> System.out.println("Invalid option.");
                            }
                        }
                        case 8 -> {
                            System.out.println("Prepaid credit\n" + back);
                            inputCollector.nextInt();
                        }
                        case 0  -> {}
                        default -> System.out.println("Invalid option.");
                    }
                }

                case 5 -> {
                    System.out.println(tones);
                    switch (inputCollector.nextInt()) {
                        case 1 -> {
                            System.out.println("Ringing tone\n" + back);
                            inputCollector.nextInt();
                        }
                        case 2 -> {
                            System.out.println("Ringing volume\n" + back);
                            inputCollector.nextInt();
                        }
                        case 3 -> {
                            System.out.println("Incoming call alert\n" + back);
                            inputCollector.nextInt();
                        }
                        case 4 -> {
                            System.out.println("Composer\n" + back);
                            inputCollector.nextInt();
                        }
                        case 5 -> {
                            System.out.println("Message alert tone\n" + back);
                            inputCollector.nextInt();
                        }
                        case 6 -> {
                            System.out.println("Keypad tones\n" + back);
                            inputCollector.nextInt();
                        }
                        case 7 -> {
                            System.out.println("Warning and game tones\n" + back);
                            inputCollector.nextInt();
                        }
                        case 8 -> {
                            System.out.println("Vibrating alert\n" + back);
                            inputCollector.nextInt();
                        }
                        case 9 -> {
                            System.out.println("Screen saver\n" + back);
                            inputCollector.nextInt();
                        }
                        case 0  -> {}
                        default -> System.out.println("Invalid option.");
                    }
                }

                case 6 -> {
                    System.out.println(settings);
                    switch (inputCollector.nextInt()) {
                        case 1 -> {
                            System.out.println(callSettings);
                            switch (inputCollector.nextInt()) {
                                case 1 -> {
                                    System.out.println("Automatic redial\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 2 -> {
                                    System.out.println("Speed dialling\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 3 -> {
                                    System.out.println("Call waiting options\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 4 -> {
                                    System.out.println("Own number sending\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 5 -> {
                                    System.out.println("Phone line in use\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 6 -> {
                                    System.out.println("Automatic answer\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 0  -> {}
                                default -> System.out.println("Invalid option.");
                            }
                        }
                        case 2 -> {
                            System.out.println(phoneSettings);
                            switch (inputCollector.nextInt()) {
                                case 1 -> {
                                    System.out.println("Language\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 2 -> {
                                    System.out.println("Cell info display\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 3 -> {
                                    System.out.println("Welcome note\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 4 -> {
                                    System.out.println("Network selection\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 5 -> {
                                    System.out.println("Lights\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 6 -> {
                                    System.out.println("Confirm SIM service actions\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 0  -> {}
                                default -> System.out.println("Invalid option.");
                            }
                        }
                        case 3 -> {
                            System.out.println(securitySettings);
                            switch (inputCollector.nextInt()) {
                                case 1 -> {
                                    System.out.println("PIN code request\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 2 -> {
                                    System.out.println("Call barring service\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 3 -> {
                                    System.out.println("Fixed dialling\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 4 -> {
                                    System.out.println("Closed user group\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 5 -> {
                                    System.out.println("Phone security\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 6 -> {
                                    System.out.println("Change access codes\n" + back);
                                    inputCollector.nextInt();
                                }
                                case 0  -> {}
                                default -> System.out.println("Invalid option.");
                            }
                        }
                        case 4 -> {
                            System.out.println("Restore factory settings\n" + back);
                            inputCollector.nextInt();
                        }
                        case 0  -> {}
                        default -> System.out.println("Invalid option.");
                    }
                }

                case 7 -> {
                    System.out.println("Call divert\n" + back);
                    inputCollector.nextInt();
                }

                case 8 -> {
                    System.out.println("Games\n" + back);
                    inputCollector.nextInt();
                }

                case 9 -> {
                    System.out.println("Calculator\n" + back);
                    inputCollector.nextInt();
                }

                case 10 -> {
                    System.out.println("Reminders\n" + back);
                    inputCollector.nextInt();
                }

                case 11 -> {
                    System.out.println(clock);
                    switch (inputCollector.nextInt()) {
                        case 1 -> {
                            System.out.println("Alarm clock\n" + back);
                            inputCollector.nextInt();
                        }
                        case 2 -> {
                            System.out.println("Clock settings\n" + back);
                            inputCollector.nextInt();
                        }
                        case 3 -> {
                            System.out.println("Date setting\n" + back);
                            inputCollector.nextInt();
                        }
                        case 4 -> {
                            System.out.println("Stopwatch\n" + back);
                            inputCollector.nextInt();
                        }
                        case 5 -> {
                            System.out.println("Countdown timer\n" + back);
                            inputCollector.nextInt();
                        }
                        case 6 -> {
                            System.out.println("Auto update of date and time\n" + back);
                            inputCollector.nextInt();
                        }
                        case 0  -> {}
                        default -> System.out.println("Invalid option.");
                    }
                }

                case 12 -> {
                    System.out.println("Profiles\n" + back);
                    inputCollector.nextInt();
                }

                case 13 -> {
                    System.out.println("SIM services\n" + back);
                    inputCollector.nextInt();
                }

                case 0 -> {
                    System.out.println("Bye!");
                    return;
                }

                default -> System.out.println("Select a valid option from the menu");
            }
        }
    }
}