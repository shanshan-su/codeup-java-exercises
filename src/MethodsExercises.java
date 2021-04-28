import java.util.Scanner;

public class MethodsExercises {
    // 1. Basic Arithmetic
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiple(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    // bonus
    public static double multipleForLoop(double num1, double num2) {
        double result = 0;
        for (double i = 1; i <= num2; i++) {
            result += num1;
        }
        return result;
    }

    public static double multipleRecursion(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else {
            return num1 + multiple(num1, num2 - 1);
        }
    }

    // 2. Create a method that validates that user input is in a certain range
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (userInput >= min & userInput <= max) {
            System.out.println(userInput);
            return userInput;
        } else {
            System.out.printf("Enter a number between %d and %d: ", min, max);
            return getInteger(min, max);
        }
    }

    // 3. Calculate the factorial of a number
    public static void calculateFactorial() {
        String answer;
        do {
            System.out.print("Enter a number between 1 and 10: ");
            Scanner scanner = new Scanner(System.in);
            // get user input
            int userInput = scanner.nextInt();

            // check if userInput is between 1 and 10
            if (userInput >= 1 & userInput <= 10) { //yes, do the following
                String calculate = "! =";
                long factorial = 1;

                // calculate factorial
                for (int i = 1; i <= userInput; i++) {
                    factorial *= i;
                    calculate = calculate + " " + i + " x";
                }
                calculate = calculate.substring(0, calculate.length() - 1);
                System.out.println(userInput + calculate + " = " + factorial);
            } else { // no, do this
                System.out.println("The number you entered is not between 1 and 10.");
            }
            System.out.print("Continue?[Y/N] ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("Y"));
    }

    // 3 bonus
    public static long calculateFactorialBonus(int userInput) {
        if (userInput == 0) {
            return 1;
        } else {
            return userInput * calculateFactorialBonus(userInput - 1);
        }
    }

    public static String getFactorial(int userInput) {
        String result = userInput + "! = ";
        if (userInput == 0) {
            return "0!";
        } else if (userInput < 0 || userInput > 20) {
            return "";
        } else if (userInput == 1) {
            return "1! = 1";
        } else {
            for (int i = 1; i < userInput; i++) {
                result = result + i + " x ";
            }
            result = result + userInput;
            return result;
        }
    }

    // 4. Create an application that simulates dice rolling
    public static void rollDice() {
        String answer;
        do {
            System.out.print("How many sides are there on the pair of dice? ");
            Scanner scanner = new Scanner(System.in);
            // get diceSide from user input
            int diceSide = scanner.nextInt();
            System.out.println("Roll the dice.");
            int result1 = (int) (Math.random() * diceSide + 1);
            int result2 = (int) (Math.random() * diceSide + 1);
            System.out.printf("You just rolled %d and %d!\n", result1, result2);
            System.out.print("Would you like to roll the dice again?[Yes/No] ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("Yes"));
    }


    public static void main(String[] args) {
        // 1
        System.out.println("Addition: " + add(193, 98765));
        System.out.println("Subtraction: " + subtract(1234567, 76543));
        System.out.println("Multiplication: " + multiple(13, 904));
        System.out.println("Division: " + divide(98, 17));
        System.out.println("Division: " + divide(98, 0));
        System.out.println("Modulus: " + modulus(97, 3));
        System.out.println("Modulus: " + modulus(97, 0));
        System.out.println("Multiplication: " + multipleForLoop(13, 904));
        System.out.println("Multiplication: " + multipleRecursion(13, 904));

        // 2
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);

        // 3
//        calculateFactorial();

        // 3 bonus
        String answer;
        do {
            System.out.print("Enter a number between 1 and 20: ");
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextInt();
            if (userInput < 0 || userInput > 20) {
                System.out.println("The number you entered is not between 1 and 20.");
            } else {
                long factorial = calculateFactorialBonus(userInput);
                String process = getFactorial(userInput);
                System.out.printf("%s = %d\n", process, factorial);
            }

            System.out.print("Continue?[Y/N] ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("Y"));


        // 4
//        rollDice();
    }
}
