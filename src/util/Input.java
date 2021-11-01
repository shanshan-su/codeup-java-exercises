package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo() {
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }

    public int getInt(int min, int max) {
        int integer = getInt();
        while (integer < min || integer > max) {
            System.out.printf("Please enter an integer between %d and %d.\n", min, max);
            integer = getInt();
        }
        return integer;
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        return getInt(min, max);
    }

    public int getInt() throws NumberFormatException {
        try {
            return Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("User did not enter a required integer.");
            return getInt("Please enter a whole number.");
        }
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }

    public double getDouble(double min, double max) {
        double decimal = getDouble();
        while (decimal < min || decimal > max) {
            System.out.printf("Please enter an decimal between %f and %f.\n", min, max);
            decimal = getDouble();
        }
        return decimal;
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        return getDouble(min, max);
    }

    public double getDouble() throws NumberFormatException {
        try {
            return Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("User did not enter a required decimal number.");
            e.printStackTrace(System.out);
            return getDouble();
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();
    }

    public int getBinary() {
        System.out.print("Enter a binary number: ");
        Scanner scanner = new Scanner(System.in);
        String binary = scanner.next();
        return Integer.valueOf(binary, 2);
    }

    public int getHex() {
        System.out.print("Enter a hexidecimal number: ");
        Scanner scanner = new Scanner(System.in);
        String hex = scanner.next();
        return Integer.valueOf(hex, 16);
    }
}
