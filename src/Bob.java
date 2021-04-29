import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        // 2. Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        //
        //Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        //He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        //He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        //He answers 'Whatever.' to anything else.

        int count = 0;
        do {
            System.out.println("Ask Bob a question.");
            String BobAnswers;
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            if (userInput.endsWith("?")) {
                BobAnswers = "Sure";
            } else if (userInput.endsWith("!")) {
                BobAnswers = "Whoa, chill out!";
            } else if (userInput.equals("")) {
                BobAnswers = "Fine. Be that way!";
            } else {
                BobAnswers = "Whatever";
            }
            System.out.println(BobAnswers);
            count++;
        } while (count <= 8);

    }
}
