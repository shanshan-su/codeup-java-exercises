public class Person {

    private String name = "Shan";

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
        Person shan = new Person();
        System.out.println("shan.getName() = " + shan.getName());

        shan.setName("Shanshan");

        shan.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
    }
}
