package util;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {
        Input.getString("Please enter a string.");

        System.out.println("Input.yesNo(\"please enter a string.\") = " + Input.yesNo("please enter a string."));

        Scanner scanner = new Scanner(System.in);
        if (Input.yesNo("Do you like whole numbers?[y/n]")) {
            System.out.print("Please enter two whole numbers. ");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            if (number1 > number2) {
                System.out.println("Input.getInt(number2, number1) = " + Input.getInt(number2, number1, "Please enter a whole number between these two numbers."));
            } else if (number1 < number2){
                System.out.println("Input.getInt(number1, number2) = " + Input.getInt(number1, number2, "Please enter a whole number between these two numbers."));
            } else {
                System.out.println("Input.getInt() = " + Input.getInt("Please a whole number."));
            }
        } else {
            System.out.print("Please enter two decimal numbers. ");
            double decimal1 = scanner.nextDouble();
            double decimal2 = scanner.nextDouble();
            if (decimal1 > decimal2) {
                System.out.println("Input.getDouble(decimal2, decimal1) = " + Input.getDouble(decimal2, decimal1, "Please enter a whole number between these two numbers."));
            } else if (decimal1 < decimal2) {
                System.out.println("Input.getDouble(decimal1, decimal2) = " + Input.getDouble(decimal1, decimal2, "Please enter a whole number between these two numbers."));
            } else {
                System.out.println("Input.getDouble() = " + Input.getDouble("Please enter a decimal number."));
            }
        }
    }
}
