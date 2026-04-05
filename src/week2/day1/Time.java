package week2.day1;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second) {

        ValidateHour(hour);
        ValidateMinute(minute);
        ValidateSecond(second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    static void ValidateHour(int hour) {
        boolean validHour = hour < 0 || hour >= 24;

        if (validHour) {
            throw new IllegalArgumentException("Invalid hour. Please enter an hour between 0 and 23.");
        }
    }


    static void ValidateMinute(int minute) {
        boolean validMinute = minute < 0 || minute >= 60;

        if (validMinute) {
            throw new IllegalArgumentException("Invalid minute. Please enter a minute between 0 and 59.");
        }
    }


    static void ValidateSecond(int second) {
        boolean validSecond = second < 0 || second >= 60;

        if (validSecond) {
            throw new IllegalArgumentException("Invalid second. Please enter a second between 0 and 59.");
        }
    }


    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }


    public String toString() {
        String standardTime = formatStandardTime(13, 27, 6);

        return standardTime;
    }


    static String formatStandardTime(int hour, int minute, int second) {
        int displayHour;
        String period;

        if (hour == 0 || hour == 12) {
            displayHour = 12;
        }
        else {
            displayHour = hour % 12;
        }


        if (hour < 12) {
            period = "AM";
        }
        else {
            period = "PM";
        }

        return String.format("%d:%02d:%02d %s", displayHour, minute, second, period);
    }

}