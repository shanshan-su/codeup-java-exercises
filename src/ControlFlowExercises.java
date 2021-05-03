import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // 1 Loop Basics
        // a. While
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

        // b. Do While
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);
//
//        i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        long i = 2L;
//        System.out.println(i);
//        do {
//            System.out.println(i);
//            i = i * i;
//        } while (i < 1_000_000);

        // c. For

        for (int i = 5; i <= 15; i++) {
            System.out.print(i + " ");
        }

        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }

        for (int i = 100; i >= -10; i -= 5) {
            System.out.println(i);
        }

        for (long i = 2L; i < 1_000_000; i *= i) {
            System.out.println(i);
        }

        // 2. Fizzbuzz
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        // 3. Display a table of powers
        Scanner scanner = new Scanner(System.in);
        String continueTheGame;
        do {
            System.out.print("What number would you like to go up to? ");
            int userInt = scanner.nextInt();
            int square;
            int cube;
            System.out.println("\nHere is your table!\n");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= userInt; i++) {
                square = i * i;
                cube = i  * i * i;
                System.out.printf("%-6d | %-7d | %d\n", i, square, cube);
//                if (i < 10 & square < 10) {
//                    System.out.println(i + "      | " + square + "       | " + cube);
//                } else if (i < 10 & square < 100) {
//                    System.out.println(i + "      | " + square + "      | " + cube);
//                } else if (i >= 10 & square < 1000) {
//                    System.out.println(i + "     | " + square + "     | " + cube);
//                } else if (i >= 10 & square < 10000) {
//                    System.out.println(i + "     | " + square + "    | " + cube);
//                } else if (i >= 100 & square < 100000) {
//                    System.out.println(i + "    | " + square + "   | " + cube);
//                } else if (i >= 100 & square < 1000000) {
//                    System.out.println(i + "    | " + square + "  | " + cube);
//                } else if (i >= 1000 & square < 10000000) {
//                    System.out.println(i + "   | " + square + " | " + cube);
//                }
            }

            System.out.println("\nWould you like to continue the game? (Note: only 'YES' let you continue)");
            continueTheGame = scanner.next();
        } while (continueTheGame.equalsIgnoreCase("yes"));

        System.out.println("I'm sorry that you don't want to play our game anymore.\n");


        // 4. Convert given number grades into letter grades
//        boolean continueOrNot;
//         do {
//            System.out.println("What grade did you get form the assessment? (Note: 0 - 100)");
//            int grade = scanner.nextInt();
//            char letterGrade = '';
//            if (grade >= 88) {
//                letterGrade = 'A';
//            } else if (grade >= 80) {
//                letterGrade = 'B';
//            } else if (grade >= 67) {
//                letterGrade = 'C';
//            } else if (grade >= 60) {
//                letterGrade = 'D';
//            } else {
//                letterGrade = 'F';
//            }
//            System.out.println("Your corresponding letter grade is " + letterGrade);
//            System.out.print("\nWould you like to continue? (Note: only 'YES' make you continue)\n");
//            String userInput = scanner.next();
//            continueOrNot = userInput.equalsIgnoreCase("yes");
//        } while (continueOrNot);
//
//        System.out.println("I'm sorry that you're leaving.");

        // Bonus
        boolean continueOrNot;
        do {
            System.out.println("What grade did you get form the assessment? (Note: 0 - 100)");
            int grade = scanner.nextInt();
            String letterGrade = "";
            // going descending orders -- from most specific to least specific
            if (grade >= 97) {
                letterGrade = "A+";
            } else if (grade >= 93) {
                letterGrade = "A";
            } else if (grade >= 90) {
                letterGrade = "A-";
            } else if (grade >= 87) {
                letterGrade = "B+";
            } else if (grade >= 83) {
                letterGrade = "B";
            } else if (grade >= 80) {
                letterGrade = "B-";
            } else if (grade >= 77) {
                letterGrade = "C+";
            } else if (grade >= 73) {
                letterGrade = "C";
            } else if (grade >= 70) {
                letterGrade = "C-";
            } else if (grade >= 67) {
                letterGrade = "D+";
            } else if (grade >= 65) {
                letterGrade = "D";
            } else {
                letterGrade = "E/F";
            }
            System.out.println("Your corresponding letter grade is " + letterGrade);
            System.out.print("\nWould you like to continue? (Note: only 'YES' make you continue)\n");
            String userInput = scanner.next();
            continueOrNot = userInput.equalsIgnoreCase("yes");
        } while (continueOrNot);

        System.out.println("I'm sorry that you're leaving.");
    }
}
