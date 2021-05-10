import util.Input;

import java.util.*;

public class GroceryListApplication {
    public static void main(String[] args) {
        List<String> groceryCategories = new ArrayList<>(Arrays.asList("Fruits", "Vegetables", "Canned Goods", "Frozen Foods", "Meat", "Fish and Shellfish", "Deli", "Condiments and Spices", "Sauce and Oils", "Snack", "Bread and Bakery", "Beverages", "Pasta/Rice", "Cereal", "Baking", "Personal Care", "Health Care", "Paper and Wrap", "Household Supplies", "Baby Items", "Other Items"));

        Map<String, Integer> itemAndQuantity = new HashMap<>();
        Map<String, Map<String, Integer>> groceryList = new HashMap<>();

        if(Input.yesNo("Would you like to create a grocery list?")) {
            if (Input.yesNo("Would you like to enter a new item?")) {
                System.out.println("Here are the grocery categories: \n");
                StringBuilder groceryCategoriesString = new StringBuilder();
                groceryCategoriesString.append("| ");
                for (String category : groceryCategories)
                {
                    groceryCategoriesString.append(category).append(" | ");
                }
                System.out.println(groceryCategoriesString + "\n");
                do {
                    String selectedCategory = Input.getString("Select the category.");
                    do {
                        String itemName = Input.getString("Enter the name of the item.");
                        int itemQuantity = Input.getInt("Enter how many of the item.");
                        itemAndQuantity.putIfAbsent(itemName, itemQuantity);
                    } while (Input.yesNo("Would you like to continue add more items in the same category?"));
                    groceryList.putIfAbsent(selectedCategory, itemAndQuantity);
                    itemAndQuantity.clear();
                } while (Input.yesNo("Would you like to add more items on other categories?"));

                for (String category : groceryList.keySet()) {
                    System.out.println("Here's your grocery list: \n");
                    System.out.println(category);

                    for (String item : groceryList.get(category).keySet()) {
                        System.out.printf("%s -- %d\n", item, groceryList.get(category).get(item));
                    }
                    System.out.println();
                }



            }
        }
        System.out.println("Thank you for using Grocery List App! See you next time.");
    }


}
