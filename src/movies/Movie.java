package movies;

import java.util.Arrays;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = setName(name);
        this.category = setCategory(category);
    }

    public String getName() {
        return name;
    }

    public String setName() {
        return "undefined name";
    }

    public String setName(String name) {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String setCategory() {
        return "undefined category";
    }

    public String setCategory(String category) {
        return category;
    }

    public static Movie[] addMovie(Movie[] moviesArr, String name, String category) {
        Movie[] newMovies = Arrays.copyOf(moviesArr, moviesArr.length + 1);
        newMovies[moviesArr.length] = new Movie(name, category);
        return newMovies;
    }

    public static void displayAllMovies(Movie[] movies) {
        for (Movie movie : movies) {
            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
        }
    }

    public static void displaySelectedMovies(Movie[] movies, String category) {
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.printf("%s -- %s\n", movie.getName(), category);
            }
        }
    }
}
