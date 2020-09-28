package com.kirillkozlovsky.section4;

@SuppressWarnings("ALL")
public class Exercises {

    // Coding Exercise 1a
    public static long toMilesPerHour(double kilometersPerHour) {
        return (kilometersPerHour >= 0) ? Math.round(kilometersPerHour / 1.609) : -1;
    }

    // Coding Exercise 1b
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }

    // Coding Exercise 2
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0)
            System.out.println("Invalid Value");
        else {
            int remainingKiloBytes, megaBytes;
            megaBytes = kiloBytes / 1024;
            remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }

    // Coding Exercise 3
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23)
            return false;
        return isBarking && (hourOfDay < 8 || hourOfDay > 22);
    }

    // Coding Exercise 4
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999)
            return false;
        if (year % 4 == 0 && year % 100 != 0)
            return true;
        return year % 400 == 0;
    }

    // Coding Exercise 5
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        return (int) (num1 * 1000) - (int) (num2 * 1000) == 0;
    }

    // Coding Exercise 6
    public static boolean hasEqualSum(int num1, int num2, int sum) {
        return num1 + num2 == sum;
    }

    // Coding Exercise 7a
    public static boolean hasTeen(int num1, int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    // Coding Exercise 7b
    public static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }

    // Coding Exercise 8a
    public static double area(double radius) {
        return (radius >= 0) ? radius * radius * Math.PI : -1;
    }

    // Coding Exercise 8b
    public static double area(double x, double y) {
        return (x >= 0 && y >= 0) ? x * y : -1;
    }

    // Coding Exercise 9
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0)
            System.out.println("Invalid Value");
        else {
            long minutesInHour = 60, hoursInDay = 24, daysInYear = 365;
            long minutesInDay = minutesInHour * hoursInDay;
            long minutesInYear = minutesInDay * daysInYear;
            long years = minutes / minutesInYear;
            long days = minutes / minutesInDay;
            long remainingDays = days % daysInYear;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }

    // Coding Exercise 10
    public static void printEqual(int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0)
            System.out.println("Invalid Value");
        else {
            if (num1 == num2 && num2 == num3)
                System.out.println("All numbers are equal");
            else if (num1 != num2 && num2 != num3 && num1 != num3)
                System.out.println("All numbers are different");
            else
                System.out.println("Neither all are equal or different");
        }
    }

    // Coding Exercise 11
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int lowerTemperatureLimit = 25;
        int upperTemperatureLimit = 35;
        int upperTemperatureLimitSummer = 45;
        if (!summer) {
            return temperature >= lowerTemperatureLimit && temperature <= upperTemperatureLimit;
        } else return temperature >= lowerTemperatureLimit && temperature <= upperTemperatureLimitSummer;
    }
}
