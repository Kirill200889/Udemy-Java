package com.kirillkozlovsky.section5;

import java.util.Scanner; // required for Coding Exercise 27 and later

import static com.kirillkozlovsky.section4.Exercises.isLeapYear; // required for Coding Exercise 13

public class Exercises {

    // Coding Exercise 12
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

    // Coding Exercise 13 (requires Coding Exercise 4)
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

    // Coding Exercise 14a
    public static boolean isOdd(int number) {
        return number > 0 && number % 2 != 0;
    }

    // Coding Exercise 14b
    public static int sumOdd(int start, int end) {
        if (start > end || start <= 0)
            return -1;
        int sum = 0;
        for (int i = start; i <= end; i++)
            if (isOdd(i))
                sum += i;
        return sum;
    }

    // Coding exercise 15
    public static boolean isPalindrome(int number) {
        int reverse = 0, temp = Math.abs(number);
        while (temp != 0) {
            reverse = reverse * 10 + (temp % 10);
            temp /= 10;
        }
        System.out.println(reverse);
        return reverse == Math.abs(number);
    }

    // Coding Exercise 16
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;
        int firstDigit = number;
        while (firstDigit > 9)
            firstDigit /= 10;
        return number % 10 + firstDigit;
    }

    // Coding Exercise 17
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

    // Coding Exercise 18
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 > 99 || num1 < 10 || num2 > 99 || num2 < 10)
            return false;
        if (num1 % 10 == num2 % 10 || num1 % 10 == num2 / 10 % 10)
            return true;
        else return num1 / 10 % 10 == num2 % 10 || num1 / 10 % 10 == num2 / 10 % 10;
    }

    // Coding Exercise 19a
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3))
            return false;
        return (num1 % 10 == num2 % 10 || num1 % 10 == num3 % 10 || num2 % 10 == num3 % 10);
    }

    // Coding Exercise 19b
    public static boolean isValid(int num) {
        return (num >= 10 && num <= 1000);
    }

    // Coding Exercise 20
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

    // Coding Exercise 21
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

    // Coding Exercise 22
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

    // Coding Exercise 23a
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

    // Coding Exercise 23b
    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + (number % 10);
            number /= 10;
        }
        return reversedNumber;
    }

    // Coding Exercise 23c
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

    // Coding Exercise 24
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        int usedBig = 0, wanted = goal / 5;
        usedBig = Math.min(bigCount, wanted);
        return goal - 5 * usedBig <= smallCount;
    }

    // Coding Exercise 25
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

    // Coding Exercise 26
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

    // Coding Exercise 27
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        long average = 0;
        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else
                break;
            scanner.nextLine(); // handle input
        }
        scanner.close();
        if (count != 0)
            average = Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }

    // Coding Exercise 28a
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
            return -1;
        double areaToPaint = width * height;
        int neededBuckets = (int) (Math.ceil(areaToPaint / areaPerBucket));
        int bucketsToBuy = neededBuckets - extraBuckets;
        return (bucketsToBuy > 0) ? bucketsToBuy : 0;
    }

    // Coding Exercise 28b
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0)
            return -1;
        double areaToPaint = width * height;
        int neededBuckets = (int) (Math.ceil(areaToPaint / areaPerBucket));
        return neededBuckets;
    }

    // Coding Exercise 28c
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0)
            return -1;
        int neededBuckets = (int) (Math.ceil(area / areaPerBucket));
        return neededBuckets;
    }
}
