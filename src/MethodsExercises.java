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

    public static void main(String[] args) {
        System.out.println("Addition: " + add(193, 98765));
        System.out.println("Subtraction: " + subtract(1234567, 76543));
        System.out.println("Multiplication: " + multiple(13, 904));
        System.out.println("Division: " + divide(98, 17));
        System.out.println("Division: " + divide(98, 0));
        System.out.println("Modulus: " + modulus(97, 3));
        System.out.println("Modulus: " + modulus(97, 0));
        System.out.println("Multiplication: " + multipleForLoop(13, 904));
        System.out.println("Multiplication: " + multipleRecursion(13, 904));
    }
}
