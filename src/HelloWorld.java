public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, World!");
        System.out.print("\n");

        //1
        int myFavoriteNumber = 6;
        System.out.println(myFavoriteNumber);
        //2
        String myString = "I love anime.";
        System.out.println(myString);
        //3
        //String myOtherString = 'D'; // Doesn't work.
        char myCharacter = 'J';
        System.out.println(myCharacter);

        Character myCharacter2 = 's';
        System.out.println(myCharacter2);

        //4
//        String myString = 3.14159;  // double cannot be converted to string
//        System.out.println(myString);

        //5
        long myNumber;
//        System.out.println("myNumber = " + myNumber); // Doesn't work because you cannot use a variable before giving it an initial value

        //6
//        myNumber = 3.14;  // double cannot be converted to long
//        System.out.println(myNumber);

        //7
//        myNumber = 123L;
//        System.out.println(myNumber);

        //8
//        myNumber = 123;
//        System.out.println("myNumber = " + myNumber);

        //9
//        float myNumber = 3.14;  // double cannot be converted to float
//        System.out.println(myNumber);

//        double myNumber3 = 3.14;
//        System.out.println(myNumber3);
//
//        float myNumber4 = (float) 3.14;
//        System.out.println(myNumber4);
//
//        float myNumber5 = 3.14F;
//        System.out.println(myNumber5);

        //10
//        int x = 5;
//        System.out.println(x++);  // 5
//        System.out.println(x);    // 6

//        int x = 5;
//        System.out.println(++x);  // 6
//        System.out.println(x);    // 6

        //11
//        String class = "hello"; // Doesn't work because class is a reserved keyword
//        System.out.println(class);

        //12 cannot just cast Strings to ints
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o; // Object String cannot be cast to int

//        int three = (int) "three"; // incompatible types: string cannot be converted to int
//        System.out.println(three);

        //13
//        int x = 4;
//        x += 5;
//        System.out.println("x = " + x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println("y = " + y);
//
        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println("y = " + y);

        //14
        int z = Integer.MAX_VALUE;
        z += 1;
        System.out.println("z = " + z);  // z = -2147483648
    }
}
