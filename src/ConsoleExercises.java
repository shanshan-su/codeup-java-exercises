import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        // Exercise 1
        double pi = 3.14159;

        System.out.format("The value of pi is approximately %.2f.%n", pi);

        // Explore the scanner class
        Scanner scanner = new Scanner(System.in);

        // Initialize the string delimiter
        scanner.useDelimiter("\n");

        // 1
        System.out.println("Enter an integer.");
        int userInt = scanner.nextInt();
        System.out.println("You entered " + userInt + ".");  // if input is not an int, it doesn't work

        // 2
        System.out.println("Please enter 3 words.");
        String userString1 = scanner.next();
        String userString2 = scanner.next();
        String userString3 = scanner.next();
        System.out.printf("You entered these three words: %s, %s, %s.\n", userString1, userString2, userString3);
        // only get the first three words if enter more than 3 words.
        // if enter less than 3 words, it will not end when press enter until finish entering 3 words

        // 3
        System.out.println("Please enter a sentence.");
//        String userSentence = scanner.next();
//        System.out.println(userSentence); // only get the first word

        // 4
        String userSentence = scanner.nextLine();
        System.out.println(userSentence);

        // Calculate the perimeter and area of Codeup's classrooms
        // 1
//        System.out.println("Please enter the length and width of the classroom.");
//        String lengthInput = scanner.next();
//        String widthInput = scanner.next();
//        //Converting String into int using Integer.parseInt()
//        int length = Integer.parseInt(lengthInput);
//        int width = Integer.parseInt(widthInput);
//        // 2
//        int area = length * width;
//        int perimeter = 2 * (length + width);
//        System.out.println("The area of the classroom is " + area + " square feet, and the perimeter is " + perimeter + " feet.");

        // use .nextLine() instead of .next()
//        System.out.println("Please enter the length of the classroom.");
//        String lengthInput = scanner.nextLine();
//
//        System.out.println("Please enter the width of the classroom.");
//        String widthInput = scanner.nextLine();
//
//        //Converting String into int using Integer.parseInt()
//        int length = Integer.parseInt(lengthInput);
//        int width = Integer.parseInt(widthInput);
//        int area = length * width;
//        int perimeter = 2 * (length + width);
//        System.out.printf("The area of the classroom is %d square feet, and the perimeter is %d feet.\n", area, perimeter);

        // Bonuses

        // Ask the user to enter length, width and height
        System.out.println("Please enter the length, width and height of the classroom.");

        float length = scanner.nextFloat();
        float width = scanner.nextFloat();
        float height = scanner.nextFloat();

        double area = length * width;
        float perimeter = 2 * (length + width);
        double volume = length * width * height;
        System.out.printf("The area of the classroom is %.2f square feet, and the perimeter is %.2f feet, and the volume is %.2f cube feet.\n", area, perimeter, volume);
    }
}
