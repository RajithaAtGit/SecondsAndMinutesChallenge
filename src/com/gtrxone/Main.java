package com.gtrxone;

public class Main {

    public static void main(String[] args) {
        String result = SecondsAndMinutesChallenge.getDurationString(65,45);
        System.out.println(result);

        result = SecondsAndMinutesChallenge.getDurationString(3000);
        System.out.println(result);
    }
}
