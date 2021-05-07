package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    public void addGrade(List<Integer> givenGrades) {
        grades.addAll(givenGrades);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int totalGrades = 0;
        for (int grade : grades) {
            totalGrades += grade;
        }
        return (float)totalGrades / grades.size();
    }

    public static void main(String[] args) {
        Student shan = new Student("Shan");
        shan.addGrade(99);
        shan.addGrade(98);
        shan.addGrade(90);
        System.out.printf("Shan's average grade = %.2f\n", shan.getGradeAverage());
    }
}
