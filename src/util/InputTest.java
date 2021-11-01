package util;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) throws NumberFormatException {
//        Input.getString("Please enter a string.");

//        System.out.println("Input.yesNo(\"please enter a string.\") = " + Input.yesNo("please enter a string."));

        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        if (input.yesNo("Would you like to enter whole numbers?[y/n]")) {
            System.out.print("Please enter two whole numbers. ");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            if (number1 > number2) {
                System.out.println("input.getInt(number2, number1) = " + input.getInt(number2, number1, "Please enter a whole number between these two numbers."));
            } else if (number1 < number2){
                System.out.println("input.getInt(number1, number2) = " + input.getInt(number1, number2, "Please enter a whole number between these two numbers."));
            } else {
                System.out.println(input.getInt("Please a whole number."));
            }
        } else {
            System.out.print("Please enter two decimal numbers. ");
            double decimal1 = scanner.nextDouble();
            double decimal2 = scanner.nextDouble();
            if (decimal1 > decimal2) {
                System.out.println("input.getDouble(decimal2, decimal1) = " + input.getDouble(decimal2, decimal1, "Please enter a decimal number between these two numbers."));
            } else if (decimal1 < decimal2) {
                System.out.println("input.getDouble(decimal1, decimal2) = " + input.getDouble(decimal1, decimal2, "Please enter a decimal number between these two numbers."));
            } else {
                System.out.println(input.getDouble("Please enter a decimal number."));
            }
        }

        try {
            System.out.println("Your number is " + input.getBinary());
        } catch (NumberFormatException e) {
            System.out.println("The number you entered is NOT a binary.");
        }

        try {
            System.out.println("Your number is " + input.getHex());
        } catch (NumberFormatException e) {
            System.out.println("The number you entered is NOT a hex decimal number.");
        }
    }
}
