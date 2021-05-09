package grades;

import java.util.*;

public class GradesApplication {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        Student alex = new Student("Alex");
        alex.addGrade(Arrays.asList(90, 97, 88));

        Student andrew = new Student("Andrew");
        andrew.addGrade(Arrays.asList(99, 90, 86));

        Student victor = new Student("Victor");
        victor.addGrade(Arrays.asList(70, 75, 81));

        Student john = new Student("John");
        john.addGrade(Arrays.asList(70, 77, 85));

        students.put("althoms", alex);
        students.put("anwalsh", andrew);
        students.put("vhernadez", victor);
        students.put("jpierce", john);


        alex.recordAttendance("2021-05-03", "P");
        alex.recordAttendance("2021-05-04", "P");
        alex.recordAttendance("2021-05-05", "P");
        alex.recordAttendance("2021-05-06", "A");
        alex.recordAttendance("2021-05-07", "P");

        andrew.recordAttendance("2021-05-03", "P");
        andrew.recordAttendance("2021-05-04", "P");
        andrew.recordAttendance("2021-05-05", "P");
        andrew.recordAttendance("2021-05-06", "P");
        andrew.recordAttendance("2021-05-07", "P");

        victor.recordAttendance("2021-05-03", "P");
        victor.recordAttendance("2021-05-04", "P");
        victor.recordAttendance("2021-05-05", "P");
        victor.recordAttendance("2021-05-06", "P");
        victor.recordAttendance("2021-05-07", "P");

        john.recordAttendance("2021-05-03", "A");
        john.recordAttendance("2021-05-04", "P");
        john.recordAttendance("2021-05-05", "P");
        john.recordAttendance("2021-05-06", "A");
        john.recordAttendance("2021-05-07", "P");

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        System.out.println("|althoms| |anwalsh| |vhernadez| |jpierce|\n");

        do {
            displayMoreInfo(students);
            System.out.println("Would you like to see another student?");
        } while (continueOrNot());

        System.out.println("Goodbye, and have a wonderful day!");


        System.out.println("Would you like to see all the students' information?");
        if (continueOrNot()) {
            displayAllInfo(students);
        } else {
            System.out.println("Goodbye, and have a wonderful day!");
        }

        System.out.println("Would you like to see the overall average grade?");
        if (continueOrNot()) {
            System.out.printf("The overall average grade is %.2f.\n", getOverallAverage(students));
        } else {
            System.out.println("Goodbye, and have a wonderful day!");
        }
    }

    public static boolean continueOrNot() {
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

    public static void displayMoreInfo(Map<String, Student> students) {
        System.out.println("What student would you like to see more information on?");
        Scanner scanner = new Scanner(System.in);
        String nameInput = scanner.nextLine();
        if (students.containsKey(nameInput)) {
            System.out.printf("Name: %s - GitHub Username: %s\n", students.get(nameInput).getName(), nameInput);
            System.out.printf("Current Average: %.2f\n\n", students.get(nameInput).getGradeAverage());
            System.out.println("Would you like to see this student's absent dates?");
            if (continueOrNot()) {
                StringBuilder datesString = new StringBuilder();
                List<String> dates = students.get(nameInput).getDatesOfAbsence();
                for (String date : dates) {
                    datesString.append(date).append(" ");
                }
                System.out.printf("Here are %s's absent dates: %s\n\n", students.get(nameInput).getName(), datesString);
            }
        } else {
            System.out.printf("Sorry, no student found with the GitHub username of \"%s\".\n\n", nameInput);
        }
    }

    static double getOverallAverage(Map<String, Student> students) {
        double allGrades = 0;
        for (String key : students.keySet()) {
            allGrades += students.get(key).getGradeAverage();
        }
        return allGrades / students.size();
    }

    public static void displayAllInfo(Map<String, Student> students) {
        System.out.println("name,github_username,average,attendance percentage");
        for (String key : students.keySet()) {
            System.out.printf("%s, %s, %.2f, %.2f\n", students.get(key).getName(), key, students.get(key).getGradeAverage(), students.get(key).getAttendancePercentage());
        }
    }
}