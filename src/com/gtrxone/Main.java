package com.gtrxone;

public class Main {

    public static void main(String[] args) {
        String result = SecondsAndMinutesChallenge.getDurationString(500000,50);
        System.out.println(result);

        result = SecondsAndMinutesChallenge.getDurationString(4000);
        System.out.println(result);
    }
}
