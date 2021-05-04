package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = setName(name);
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public static String setName() {
        return "undefined name";
    }

    public static String setName(String name) {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public static String setCategory() {
        return "undefined category";
    }

    public static String setCategory(String category) {
        return category;
    }

}
