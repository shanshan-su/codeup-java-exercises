package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    public static String getString() {
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public static boolean yesNo() {
        scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }

    static int getInt(int min, int max) {
        int integer = getInt();
        while (integer < min || integer > max) {
            System.out.printf("Please enter an integer between %d and %d.\n", min, max);
            scanner = new Scanner(System.in);
            integer = scanner.nextInt();
        }
        return integer;
    }

    static int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        return getInt(min, max);
    }

    public static int getInt() {
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static int getInt(String prompt) {
        System.out.println(prompt);
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static double getDouble(double min, double max) {
        double decimal = getDouble();
        while (decimal < min || decimal > max) {
            System.out.printf("Please enter an decimal between %f and %f.\n", min, max);
            scanner = new Scanner(System.in);
            decimal = scanner.nextDouble();
        }
        return decimal;
    }

    static double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        return getDouble(min, max);
    }

    public static double getDouble() {
        scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();
    }
}
