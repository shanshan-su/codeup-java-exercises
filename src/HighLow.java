import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        // 5. Game Development 101
        // get a random number between 1 and 100
        int random = (int)(Math.random() * 100 + 1);

        // ask the user to guess the number
        System.out.println("Guess the number between 1 and 100.");
        Scanner scanner = new Scanner(System.in);

        // get userInput
        int userInput = scanner.nextInt();
        do {
            if (userInput > random) {
                System.out.println("LOWER");
            } else {
                System.out.println("HIGHER");
            }
            System.out.println("Try again.");
            userInput = scanner.nextInt();
        } while (userInput != random);

        System.out.println("GOOD GUESS!");

    }
}
