import java.util.Scanner;

public class Exercises {

    public static double area(double radius) {
        return (radius >= 0) ? radius * radius * Math.PI : -1;
    }

    public static double area(double x, double y) {
        return (x >= 0 && y >= 0) ? x * y : -1;
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23)
            return false;
        return isBarking && (hourOfDay < 8 || hourOfDay > 22);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        return (int) (num1 * 1000) - (int) (num2 * 1000) == 0;
    }

    public static boolean hasEqualSum(int num1, int num2, int sum) {
        return num1 + num2 == sum;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0)
            return -1;
        int sum = 0;
        while (number != 0) {
            int currentDigit = number % 10;
            if (currentDigit % 2 == 0)
                sum += currentDigit;
            number /= 10;
        }
        return sum;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;
        int firstDigit = number;
        while (firstDigit > 9)
            firstDigit /= 10;
        return number % 10 + firstDigit;
    }

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

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999)
            return false;
        if (year % 4 == 0 && year % 100 != 0)
            return true;
        return year % 400 == 0;
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0)
            System.out.println("Invalid Value");
        else {
            int remainingKiloBytes, megaBytes;
            megaBytes = kiloBytes / 1024;
            remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
            /*
            if (remainingKiloBytes != 0)
                System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
            else
                System.out.println(kiloBytes + " KB = " + megaBytes + " MB");
            */
        }
    }

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

    public static void printNumberInWord(int num) {
        switch (num) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999)
            return -1;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year))
                    return 29;
                else
                    return 28;
            default:
                return -1;
        }
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0, temp = Math.abs(number);
        while (temp != 0) {
            reverse = reverse * 10 + (temp % 10);
            temp /= 10;
        }
        System.out.println(reverse);
        return reverse == Math.abs(number);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int lowerTemperatureLimit = 25;
        int upperTemperatureLimit = 35;
        int upperTemperatureLimitSummer = 45;
        if (!summer) {
            return temperature >= lowerTemperatureLimit && temperature <= upperTemperatureLimit;
        } else return temperature >= lowerTemperatureLimit && temperature <= upperTemperatureLimitSummer;
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 > 99 || num1 < 10 || num2 > 99 || num2 < 10)
            return false;
        if (num1 % 10 == num2 % 10 || num1 % 10 == num2 / 10 % 10)
            return true;
        else return num1 / 10 % 10 == num2 % 10 || num1 / 10 % 10 == num2 / 10 % 10;
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        return (kilometersPerHour >= 0) ? Math.round(kilometersPerHour / 1.609) : -1;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }

    public static boolean isOdd(int number) {
        return number > 0 && number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start > end || start <= 0)
            return -1;
        int sum = 0;
        for (int i = start; i <= end; i++)
            if (isOdd(i))
                sum += i;
        return sum;
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    public static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3))
            return false;
        return (num1 % 10 == num2 % 10 || num1 % 10 == num3 % 10 || num2 % 10 == num3 % 10);
    }

    public static boolean isValid(int num) {
        return (num >= 10 && num <= 1000);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int smallerNum = Math.min(first, second);
        if (smallerNum < 10)
            return -1;
        int divisor = 2, greatestDivisor = 1;
        while (divisor <= smallerNum) {
            if (first % divisor == 0 && second % divisor == 0)
                greatestDivisor = divisor;
            divisor++;
        }
        return greatestDivisor;
    }

    public static void printFactors(int number) {
        if (number < 1)
            System.out.println("Invalid Value");
        int factor = 1;
        while (factor <= number) {
            if (number % factor == 0)
                System.out.println(factor);
            factor++;
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1)
            return false;
        int divisor = 1, factorsSum = 0;
        while (divisor <= number / 2) {
            if (number % divisor == 0)
                factorsSum += divisor;
            divisor++;
        }
        return (factorsSum == number);
    }

    public static void numberToWords(int number) {
        if (number < 0)
            System.out.println("Invalid Value");
        if (number == 0)
            System.out.println("Zero");
        else {
            int reversedNumber = reverse(number);
            int digitCountReversed = getDigitCount(reversedNumber);
            while (reversedNumber != 0) {
                switch (reversedNumber % 10) {
                    case 0:
                        System.out.print("Zero");
                        break;
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;
                }
                if (reversedNumber > 9)
                    System.out.print(" ");
                reversedNumber /= 10;
            }
            for (int i = 0; i < getDigitCount(number) - digitCountReversed; i++)
                System.out.print(" Zero");
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;
        int count = 1;
        while (number >= 10) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + (number % 10);
            number /= 10;
        }
        return reversedNumber;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        int usedBig = 0, wanted = goal / 5;
        usedBig = Math.min(bigCount, wanted);
        return goal - 5 * usedBig <= smallCount;
    }

    public static int getLargestPrime(int number) {
        if (number < 2)
            return -1;
        int largestPrime = -1;
        for (int factor = 2; factor <= number; factor++) {
            if (number % factor == 0) {
                boolean isPrimeFactor = true;
                for (int i = 2; i < factor; i++)
                    if (factor % i == 0) {
                        isPrimeFactor = false;
                        break;
                    }
                if (isPrimeFactor && factor > largestPrime)
                    largestPrime = factor;
            }
        }
        return largestPrime;
    }

    public static void printSquareStar(int number) {
        if (number < 5)
            System.out.println("Invalid Value");
        else {
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if (i == 0 || i == number - 1) // first and last row
                        System.out.print("*");
                    else if (j == 0 || j == number - 1) // first and last column
                        System.out.print("*");
                    else if (i == j) // main diagonal (\)
                        System.out.print("*");
                    else if (j == number - i - 1) // secondary diagonal (/)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }


    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            boolean isAnInt = Scanner.hasNextInt();
            if (isAnInt)
                int number = Scanner.nextInt();
        }
        Scanner.close();
    }
}
