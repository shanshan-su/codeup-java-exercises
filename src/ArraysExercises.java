import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] people, Person person) {
        int length = people.length;
        Person[] newArray = Arrays.copyOf(people, length + 1);
        newArray[length] = new Person(person.name);
        return newArray;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);  // Cannot get into the value of numbers array
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Sophia");
        people[1] = new Person("Olivia");
        people[2] = new Person("Emma");

        for (Person person : people) {
            System.out.println(person.name);
        }
        System.out.println();

        Person[] newPeople = addPerson(people, new Person("Riley"));

        for (Person person : newPeople) {
            System.out.println(person.name);
        }
    }
}
