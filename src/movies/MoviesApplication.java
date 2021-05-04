package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();

        System.out.println("What would you like to do?\n");

        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category\n");

        System.out.print("Enter your choice: ");
        int number = Input.getInt();
        if (number == 0) {
            System.out.println("Thank you for using the search function. Welcome back next time :)");
        } else if (number == 1) {
            for (Movie movie : movies) {
                System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
            }
        } else if (number == 2) {
            for (Movie movie : movies) {
                if (movie.getCategory().equalsIgnoreCase("animated")) {
                    System.out.printf("%s -- animated\n", movie.getName());
                }
            }
        } else if (number == 3) {
            for (Movie movie : movies) {
                if (movie.getCategory().equalsIgnoreCase("drama")) {
                    System.out.printf("%s -- drama\n", movie.getName());
                }
            }
        } else if (number == 4) {
            for (Movie movie : movies) {
                if (movie.getCategory().equalsIgnoreCase("horror")) {
                    System.out.printf("%s -- horror\n", movie.getName());
                }
            }
        } else if (number == 5) {
            for (Movie movie : movies) {
                if (movie.getCategory().equalsIgnoreCase("scifi")) {
                    System.out.printf("%s -- scifi\n", movie.getName());
                }
            }
        } else {
            System.out.println("You entered wrong number.");
        }

    }
}
