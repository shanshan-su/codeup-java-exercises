package grades;

import java.util.*;

public class GradesApplication {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        Student alex = new Student("alex");
        alex.addGrade(Arrays.asList(80, 97, 75));

        Student andrew = new Student("andrew");
        andrew.addGrade(Arrays.asList(99, 90, 86));

        Student victor = new Student("victor");
        victor.addGrade(Arrays.asList(70, 75, 81));

        Student john = new Student("john");
        john.addGrade(Arrays.asList(70, 77, 85));

        students.put("althoms", alex);
        students.put("anwalsh", andrew);
        students.put("vhernadez", victor);
        students.put("jpierce", john);

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        System.out.println("|althoms| |anwalsh| |vhernadez| |jpierce|\n");

        do {
            displayMoreInfo(students);
            System.out.println("Would you like to see another student?");
        } while (continueOrNot());

        System.out.println("Goodbye, and have a wonderful day!");

    }

    private static void displayMoreInfo(Map<String, Student> students) {
        System.out.println("What student would you like to see more information on?");
        Scanner scanner = new Scanner(System.in);
        String nameInput = scanner.nextLine();
        if (students.containsKey(nameInput)) {
            System.out.printf("Name: %s - GitHub Username: %s\n", students.get(nameInput).getName(), nameInput);
            System.out.printf("Current Average: %.2f\n\n", students.get(nameInput).getGradeAverage());
        } else {
            System.out.printf("Sorry, no student found with the GitHub username of \"%s\".\n\n", nameInput);
        }
    }

    private static boolean continueOrNot() {
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();

        if (userAnswer.equalsIgnoreCase("y")) {
            return true;
        } else if (userAnswer.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }
}
