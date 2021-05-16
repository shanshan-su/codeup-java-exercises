package grocery;

import java.util.HashMap;
import java.util.Map;

public class Grocery {
    public Map<Integer, String> categories;

    // set up the categories list
    public Grocery() {
        this.categories = new HashMap<>(){{
            put(1, "Fruits");
            put(2, "Vegetables");
            put(3, "Canned Goods");
            put(4, "Frozen Foods");
            put(5, "Meat");
            put(6, "Fish and Shellfish");
            put(7, "Deli");
            put(8, "Condiments and Spices");
            put(9, "Sauce and Oils");
            put(10, "Snack");
            put(11, "Bread and Bakery");
            put(12, "Beverages");
            put(13, "Pasta/Rice");
            put(14, "Cereal");
            put(15, "Baking");
            put(16, "Personal Care");
            put(17, "Health Care");
            put(18, "Paper and Wrap");
            put(19, "Household Supplies");
            put(20, "Baby Items");
            put(21, "Other Items");
        }};
    }
    public void displayCategories() {
        System.out.println("Here are the grocery categories: \n");

        // go through every key-value pair in groceryCategories and print them out
        for (int number : this.categories.keySet()) {
            System.out.printf("%-2d | %s\n", number, this.categories.get(number));
        }
        System.out.println();
    }

//    public
}
