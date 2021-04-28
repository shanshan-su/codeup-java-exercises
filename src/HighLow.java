import java.util.Scanner;

public class HighLow {
    // 5. Game Development 101
    public static void highLowGame() {
        // get a random number between 1 and 100
        int random = (int)(Math.random() * 100 + 1);

        // ask the user to guess the number
        System.out.println("Guess the number between 1 and 100.");
        Scanner scanner = new Scanner(System.in);

        // get userInput
        int userInput = scanner.nextInt();
        int count = 1;

        while (true) {
            if (count > 10) {
                System.out.println("Oops, game over :(");
                break;
            }
            if (userInput < 1 || userInput > 100) {
                System.out.println("Sorry, the number you entered is not between 1 and 100.");
            } else if (userInput > random) {
                System.out.println("LOWER");
            } else if (userInput < random) {
                System.out.println("HIGHER");
            }
            System.out.println("Try again.");
            userInput = scanner.nextInt();
            count++;
            if (userInput == random) {
                System.out.println("GOOD GUESS!");
                System.out.printf("Good job! You've only tried %d times!\n", count);
                break;
            }
        }
    }


    public static void main(String[] args) {
        highLowGame();
    }
}
