package util;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) throws NumberFormatException {
//        Input.getString("Please enter a string.");

//        System.out.println("Input.yesNo(\"please enter a string.\") = " + Input.yesNo("please enter a string."));

        Scanner scanner = new Scanner(System.in);
        if (Input.yesNo("Would you like to enter whole numbers?[y/n]")) {
            System.out.print("Please enter two whole numbers. ");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            if (number1 > number2) {
                System.out.println("Input.getInt(number2, number1) = " + Input.getInt(number2, number1, "Please enter a whole number between these two numbers."));
            } else if (number1 < number2){
                System.out.println("Input.getInt(number1, number2) = " + Input.getInt(number1, number2, "Please enter a whole number between these two numbers."));
            } else {
                System.out.println(Input.getInt("Please a whole number."));
            }
        } else {
            System.out.print("Please enter two decimal numbers. ");
            double decimal1 = scanner.nextDouble();
            double decimal2 = scanner.nextDouble();
            if (decimal1 > decimal2) {
                System.out.println("Input.getDouble(decimal2, decimal1) = " + Input.getDouble(decimal2, decimal1, "Please enter a decimal number between these two numbers."));
            } else if (decimal1 < decimal2) {
                System.out.println("Input.getDouble(decimal1, decimal2) = " + Input.getDouble(decimal1, decimal2, "Please enter a decimal number between these two numbers."));
            } else {
                System.out.println(Input.getDouble("Please enter a decimal number."));
            }
        }

        try {
            System.out.println("Your number is " + Input.getBinary());
        } catch (NumberFormatException e) {
            System.out.println("The number you entered is NOT a binary.");
        }

        try {
            System.out.println("Your number is " + Input.getHex());
        } catch (NumberFormatException e) {
            System.out.println("The number you entered is NOT a hexidecimal number.");
        }
    }
}
