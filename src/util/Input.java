package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    static String getString() {
        System.out.println("Please enter a string.");
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static boolean yesNo() {
        System.out.println("Please enter a string.");
        scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
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

    static int getInt() {
        System.out.println("Please enter a whole number.");
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

    static double getDouble() {
        System.out.println("Please enter a decimal number.");
        scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

}
