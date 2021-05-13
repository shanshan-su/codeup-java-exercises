package grocery;

public class DisplayCategories extends GroceryCategories {
    public static void displayCategories() {
        System.out.println("Here are the grocery categories: \n");

        // go through every key-value pair in groceryCategories and print them out
        for (int number : groceryCategories.keySet()) {
            System.out.printf("%-2d | %s\n", number, groceryCategories.get(number));
        }
        System.out.println();
    }
}
