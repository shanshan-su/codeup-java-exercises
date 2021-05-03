public class Person {

    public String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
        System.out.println(this.name);
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("%s says hello to everyone here.", this.name);
    }

    public static void main(String[] args) {
//        Person shan = new Person("Shan");
//        System.out.println("shan = " + shan);
//        System.out.println("shan.getName() = " + shan.getName());
//
//        shan.setName("Shanshan");
//
//        shan.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));  // true
//        System.out.println(person1 == person2);  // false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);  // true

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());  // John
        System.out.println(person2.getName());  // John
        person2.setName("Jane");                // Jane
        System.out.println(person1.getName());  // Jane
        System.out.println(person2.getName());  // Jane


    }
}
