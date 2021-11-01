package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();

        System.out.println("What would you like to do?\n");

        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - add a new movie to the list\n");

        System.out.print("Enter your choice: ");
        int number = input.getInt();
        if (number == 0) {
            System.out.println("Thank you for using the search function. Welcome back next time :)");
        } else if (number == 1) {
            Movie.displayAllMovies(movies);
        } else if (number == 2) {
            Movie.displaySelectedMovies(movies, "animated");
        } else if (number == 3) {
            Movie.displaySelectedMovies(movies, "drama");
        } else if (number == 4) {
            Movie.displaySelectedMovies(movies, "horror");
        } else if (number == 5) {
            Movie.displaySelectedMovies(movies, "scifi");
        } else if (number == 6) {
            String name = input.getString("Enter the movie's name.");
            String category = input.getString("Enter the movie's category.");
            Movie[] newMovies = Movie.addMovie(movies, name, category);
            Movie.displayAllMovies(newMovies);
        } else {
            System.out.println("You entered wrong number.");
        }

    }
}
