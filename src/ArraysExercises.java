import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] people, Person person) {
        int length = people.length;
        Person[] newArray = Arrays.copyOf(people, length + 1);
        newArray[length] = new Person(person.getName());
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
            System.out.println(person.getName());
        }
        System.out.println();

        Person[] newPeople = addPerson(people, new Person("Riley"));

        for (Person person : newPeople) {
            System.out.println(person.getName());
        }

        // testing Arrays.binarySearch() -- need to use it with Arrays.sort() ti get the correct index
        int[] anotherNumbers = {11, 44, 22, 12, 54};
        int index = Arrays.binarySearch(anotherNumbers, 12);
        System.out.println("index = " + index);  // -2

        Arrays.sort(anotherNumbers);
        System.out.println(Arrays.toString(anotherNumbers));
        // [11, 12, 22, 44, 54]
        System.out.println("Arrays.binarySearch(anotherNumbers, 12) = " + Arrays.binarySearch(anotherNumbers, 12));  // 1
    }
}
