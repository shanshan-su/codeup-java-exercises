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

//        long i = 2;
//        System.out.println(i);
//        do {
//            System.out.println(i);
//            i = i * i;
//        } while (i < 1000000);

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

        for (long i = 2; i < 1000000; i *= i) {
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
                if (i < 10 & square < 10) {
                    System.out.println(i + "      | " + square + "       | " + cube);
                } else if (i < 10 & square < 100) {
                    System.out.println(i + "      | " + square + "      | " + cube);
                } else if (i >= 10 & square < 1000) {
                    System.out.println(i + "     | " + square + "     | " + cube);
                } else if (i >= 10 & square < 10000) {
                    System.out.println(i + "     | " + square + "    | " + cube);
                } else if (i >= 100 & square < 100000) {
                    System.out.println(i + "    | " + square + "   | " + cube);
                } else if (i >= 100 & square < 1000000) {
                    System.out.println(i + "    | " + square + "  | " + cube);
                } else if (i >= 1000 & square < 10000000) {
                    System.out.println(i + "   | " + square + " | " + cube);
                }
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
//            char letterGrade = 'G';
//            if (grade >= 0 & grade <= 59) {
//                letterGrade = 'F';
//            } else if (grade >= 60 & grade <= 66) {
//                letterGrade = 'D';
//            } else if (grade >= 67 & grade <= 79) {
//                letterGrade = 'C';
//            } else if (grade >= 80 & grade <= 87) {
//                letterGrade = 'B';
//            } else if (grade >= 88 & grade <= 100) {
//                letterGrade = 'A';
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
            if (grade >= 0 & grade < 65) {
                letterGrade = "E/F";
            } else if (grade >= 65 & grade <= 66) {
                letterGrade = "D";
            } else if (grade >= 67 & grade <= 69) {
                letterGrade = "D+";
            } else if (grade >= 70 & grade <= 72) {
                letterGrade = "C-";
            } else if (grade >= 73 & grade <= 76) {
                letterGrade = "C";
            } else if (grade >= 77 & grade <= 79) {
                letterGrade = "C+";
            } else if (grade >= 80 & grade <= 82) {
                letterGrade = "B-";
            } else if (grade >= 83 & grade <= 86) {
                letterGrade = "B";
            } else if (grade >= 87 & grade <= 89) {
                letterGrade = "B+";
            } else if (grade >= 90 & grade <= 92) {
                letterGrade = "A-";
            } else if (grade >= 93 & grade <= 96) {
                letterGrade = "A";
            } else if (grade >= 97 & grade <= 100) {
                letterGrade = "A+";
            }
            System.out.println("Your corresponding letter grade is " + letterGrade);
            System.out.print("\nWould you like to continue? (Note: only 'YES' make you continue)\n");
            String userInput = scanner.next();
            continueOrNot = userInput.equalsIgnoreCase("yes");
        } while (continueOrNot);

        System.out.println("I'm sorry that you're leaving.");
    }
}
