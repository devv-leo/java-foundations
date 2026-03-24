package day8;

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
        switch (number) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }

    private static String getTens(int number) {
        switch (number) {
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }
}
