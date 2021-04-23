public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, World!");
        System.out.print("\n");


        int myFavoriteNumber = 6;
        System.out.println(myFavoriteNumber);

        String myString = "I love anime.";
        System.out.println(myString);

        char myCharacter = 'J';
        System.out.println(myCharacter);

        Character myCharacter2 = 's';
        System.out.println(myCharacter2);

//        String myString = 3.14159;  // double cannot be converted to java.lang.String
//        System.out.println(myString);

//        Long myNumber = 3.14;  // double cannot be converted to java.lang.Long
//        System.out.println(myNumber);

        long myNumber = 123L;
        System.out.println(myNumber);

//        Long myNumber1 = 123; // int cannot be converted to java.lang.Long
//        System.out.println(myNumber1);

        int myNumber2 = 123;
        System.out.println(myNumber2);

//        Float myNumber = 3.14;  // double cannot be converted to java.lang.Float
//        System.out.println(myNumber);

        double myNumber3 = 3.14;
        System.out.println(myNumber3);

        float myNumber4 = (float) 3.14;
        System.out.println(myNumber4);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String class = "hello"; // a identifier cannot be one of the reserved words
//        System.out.println(class);

        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o; // String cannot be cast to

//        int three = (int) "three"; // incompatible types: string cannot be converted to int
        System.out.println(three);

//        int x = 4;
//        x = x + 5;

//        int x = 4 + 5;

//        int x = 3;
//        int y = 4;
//        y = y * x;

//        int y = 4 * 3;
//
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;

        int x = 10 / 2;
        int y = 2 - 10;

    }
}
