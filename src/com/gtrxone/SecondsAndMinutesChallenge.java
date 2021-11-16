package com.gtrxone;

public class SecondsAndMinutesChallenge {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value"; // constant

    public static String getDurationString(long minutes, long seconds) {
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;

            String hourString = hours + "h ";
            if (hours < 10) {
                hourString = "0" + hourString;
            }

            String minutesString = remainingMinutes + "m ";
            if (remainingMinutes < 10) {
                minutesString = "0" + minutesString;
            }

            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }

            return hourString + minutesString + secondsString;
        }
        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(long seconds) {
        if (seconds > 0) {
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
        return INVALID_VALUE_MESSAGE;
    }
}
