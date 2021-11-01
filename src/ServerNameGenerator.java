import java.util.Scanner;

public class ServerNameGenerator {
    static String[] adjectives = {"fearless", "absurd", "impeccable", "outstanding", "prestigious", "heartfelt", "vital", "gorgeous", "packed", "thrilled"};

    static String[] nouns = {"time", "person", "year", "month", "day", "date", "weather", "world", "way", "help"};

    public static String getElement(String[] array) {
        int random = (int)(Math.random() * array.length - 1);
        return array[random];
    }

    public static void main(String[] args) {
        boolean userContinue;
        do {
            String adjective = getElement(adjectives);
            String noun = getElement(nouns);
            System.out.println("Here is your server name:");
            System.out.printf("%s-%s\n", adjective, noun);
            System.out.print("Continue?[y/n] ");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.next();
            userContinue = userInput.equalsIgnoreCase("y");
        } while (userContinue);

    }
}
