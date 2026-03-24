package day4;

public class amountToWords {
    public static void main(String[] args) {

    }

    public static String convertAmountToWords(int amount) {
        if (amount == 0) {
            return "zero";
        }

        if (amount < 0 || amount > 999999) {
            return "Amount out of range (0-999999)";
        }

        return convertNumber(amount);
    }

    private static String convertNumber(int number) {
        if (number == 0) {
            return "";
        }

        String result = "";

        if (number >= 1000) {
            int thousands = number / 1000;
            result += convertNumber(thousands) + " thousand";
            number %= 1000;
            if (number > 0) {
                result += " ";
            }
        }

        if (number >= 100) {
            int hundreds = number / 100;
            result += getOnes(hundreds) + " hundred";
            number %= 100;
            if (number > 0) {
                result += " ";
            }
        }

        if (number > 0) {
            if (number < 20) {
                result += getOnes(number);
            } else {
                int tens = number / 10;
                result += getTens(tens);
                int ones = number % 10;
                if (ones > 0) {
                    result += " " + getOnes(ones);
                }
            }
        }

        return result;
    }

    private static String getOnes(int number) {
        return switch (number) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            case 10 -> "ten";
            case 11 -> "eleven";
            case 12 -> "twelve";
            case 13 -> "thirteen";
            case 14 -> "fourteen";
            case 15 -> "fifteen";
            case 16 -> "sixteen";
            case 17 -> "seventeen";
            case 18 -> "eighteen";
            case 19 -> "nineteen";
            default -> "";
        };
    }

    private static String getTens(int number) {
        return switch (number) {
            case 2 -> "twenty";
            case 3 -> "thirty";
            case 4 -> "forty";
            case 5 -> "fifty";
            case 6 -> "sixty";
            case 7 -> "seventy";
            case 8 -> "eighty";
            case 9 -> "ninety";
            default -> "";
        };
    }
}
