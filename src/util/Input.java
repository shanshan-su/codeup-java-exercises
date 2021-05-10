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

    public static int getInt(int min, int max) {
        int integer = getInt();
        while (integer < min || integer > max) {
            System.out.printf("Please enter an integer between %d and %d.\n", min, max);
            integer = getInt();
        }
        return integer;
    }

    static int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        return getInt(min, max);
    }

    public static int getInt() throws NumberFormatException {
        try {
            return Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("User did not enter a required integer.");
            return 0;
        }
    }

    public static int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }

    static double getDouble(double min, double max) {
        double decimal = getDouble();
        while (decimal < min || decimal > max) {
            System.out.printf("Please enter an decimal between %f and %f.\n", min, max);
            decimal = getDouble();
        }
        return decimal;
    }

    static double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        return getDouble(min, max);
    }

    public static double getDouble() throws NumberFormatException {
        try {
            return Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("User did not enter a required decimal number.");
            e.printStackTrace(System.out);
            return 0;
        }
    }

    public static double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();
    }
}
