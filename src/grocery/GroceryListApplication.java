package grocery;

import util.Input;

import java.util.*;

public class GroceryListApplication extends GroceryCategories {

    public static void main(String[] args) {
        List<String> groceryList = new ArrayList<>();
        Map<String, List<String>> groceries = new HashMap<>();

        if(Input.yesNo("Would you like to create a grocery list?")) {
            // display all the categories
            DisplayCategories.displayCategories();

            do {
                // ask the user to select the category
                int selectedCategory = Input.getInt("Please enter the category number: ");

                // check if category that the user has entered is in the provided grocery categories list
                if (groceryCategories.containsKey(selectedCategory)) {
                    do {
                        //ask the user for the item and quantity
                        String itemName = Input.getString("Please enter one item that you want to buy.");
                        int itemQuantity = Input.getInt("How many would you like to buy?");

                        // add item and quantity to the list
                        groceryList.add(itemName + itemQuantity);
                    } while (Input.yesNo("Would you like to continue add more items in the same category?"));
                    // add category and related items and quantities to groceries
                groceries.putIfAbsent(groceryCategories.get(selectedCategory), groceryList);
                    // empty groceryList for the next category
                    groceryList.clear();
                }
            } while (Input.yesNo("Would you like to add more items on other categories?"));


            System.out.println("Here's your grocery list: \n");

            // use .keySet() method to get all the categories and go through all of them
            for (String category : groceries.keySet()) {
                System.out.println(category);

                // sort groceryList
                Collections.sort(groceryList);

                // go through groceryList and print out the item and the quantity
                for (String grocery : groceryList) {
                    System.out.printf("%s\n", grocery);
                }
                System.out.println();
            }





        }
        System.out.println("Thank you for using Grocery List App! See you next time.");
    }


}
