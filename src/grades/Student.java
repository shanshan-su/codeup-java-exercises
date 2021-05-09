package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    public Map<String, String> attendance;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
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
        return (double)totalGrades / grades.size();
    }

    public void recordAttendance(String date, String value) {
        if (value.equalsIgnoreCase("A") || value.equalsIgnoreCase("P")) {
            this.attendance.put(date, value);
        }
    }

    public double getAttendancePercentage() {
        int absentDays = 0;
        for (String key : this.attendance.keySet()) {
            if (this.attendance.get(key).equalsIgnoreCase("A")) {
                absentDays += 1;
            }
        }
        return (double) (this.attendance.size() - absentDays) / this.attendance.size();
    }

    public List<String> getDatesOfAbsence() {
        List<String> datesOfAbsence = new ArrayList<>();
        for (String key : this.attendance.keySet()) {
            if (this.attendance.get(key).equalsIgnoreCase("A") && !datesOfAbsence.contains(key)) {
                datesOfAbsence.add(key);
            }
        }
        return datesOfAbsence;
    }

    public static void main(String[] args) {
        Student shan = new Student("Shan");
        shan.addGrade(99);
        shan.addGrade(98);
        shan.addGrade(90);
        System.out.printf("Shan's average grade = %.2f\n", shan.getGradeAverage());
    }
}
