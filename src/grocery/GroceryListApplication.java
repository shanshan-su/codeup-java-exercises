package grocery;

import util.Input;

import java.util.*;

public class GroceryListApplication {


    public static void main(String[] args) {
        Input input = new Input();
        Grocery grocery = new Grocery();
        List<String> groceryList = new ArrayList<>();
        Map<String, List<String>> groceries = new HashMap<>();

        if(input.yesNo("Would you like to create a grocery list?")) {


            do {
                // display all the categories
                grocery.displayCategories();
                // ask the user to select the category
                int selectedCategory = input.getInt("Please enter the category number: ");

                // check if category that the user has entered is in the provided grocery categories list
                if (grocery.categories.containsKey(selectedCategory)) {
                    do {
                        //ask the user for the item and quantity
                        String itemName = input.getString("Please enter one item (" + grocery.categories.get(selectedCategory) + ").");
                        int itemQuantity = input.getInt("How many would you like to buy?");

                        // add item and quantity to the list
                        groceryList.add(itemName + ": " + itemQuantity);
                    } while (input.yesNo("Continue in the same category? [y/n]"));

                    // add category and related items and quantities to groceries
                    groceries.put(grocery.categories.get(selectedCategory), groceryList);

                    // empty groceryList for the next category
                    groceryList = new ArrayList<>(); // .clear() cannot work since it will clear the memory
                }
            } while (input.yesNo("Would you like to pick another category? [y/n]"));


            System.out.println("Here's your grocery list: \n");

            // use .keySet() method to get all the categories and go through all of them
            for (String category : groceries.keySet()) {
                System.out.println(category);

                // sort the items inside the category
                Collections.sort(groceries.get(category));

                // go through groceryList and print out the item and the quantity
                for (String item : groceries.get(category)) {
                    System.out.printf("%s\n", item);
                }
                System.out.println();
            }





        }
        System.out.println("Thank you for using Grocery List App! See you next time.");
    }


}
