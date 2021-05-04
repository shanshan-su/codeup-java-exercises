import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        talkToBob();
    }

    public static void talkToBob() {
        boolean keepTalking; // boolean for the loop
        Scanner scanner = new Scanner(System.in);
        System.out.println("Arriving without much aplomb, Bob steps into the room to talk to you with his head down.");
        System.out.println("Keeping his head down, Bob steps past you and slinks down into a sitting position nearby.");
        System.out.println("He takes an AirPod out of his ear thay you had missed and looks up at you bordely.");
        do {
            System.out.println("What would you like to say to Bob?");
            String userInput = scanner.nextLine();

            if (userInput.endsWith("?")) {
                // make Bob say "sure"
                System.out.println("Bob looks at his feet, to the wall, and then finally to your eyes.\n\"Sure\" he says.");
            } else if (userInput.endsWith("!")) {
                //He answers 'Whoa, chill out!'
                System.out.println("His eyes pop open in shock from what you said.\nHe raised his arms up saying \"Whoa, chill out!\"");
            } else if (userInput.equals("")) {
                //He says 'Fine. Be that way!'
                System.out.println("Bob rolls his eyes.\n\"Fine. Be that way!\"");
            } else {
                //He answers 'Whatever.'
                System.out.println("Without adjusting himself, Bob mutters \"Whatever\"");
            }

            System.out.println("Would you like to talk to Bob some more? [yes/no]");
            String userContinue = scanner.nextLine();
            if (userContinue.equalsIgnoreCase("yes")) {
                keepTalking = true;
            } else {
                keepTalking = false;
            }
        } while (keepTalking);

    }
}
