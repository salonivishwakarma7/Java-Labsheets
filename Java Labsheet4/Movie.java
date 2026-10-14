public class Movie {
    String name;
    String genre;
    double rating;
    static String industry = "Bollywood";

    Movie(String movieName, String movieGenre, double movieRating) {
        name = movieName;
        genre = movieGenre;
        rating = movieRating;
    }

    void displayDetails() {
        String movieName = name;
        String movieGenre = genre;
        double movieRating = rating;

        System.out.println("Industry: " + industry);
        System.out.println("Movie Name: " + movieName);
        System.out.println("Genre: " + movieGenre);
        System.out.println("Rating: " + movieRating + "/10");
    }

    public static void main(String[] args) {
        String name = "3 Idiots";
        String genre = "Comedy-Drama";
        double rating = 8.4;

        Movie movie = new Movie(name, genre, rating);
        movie.displayDetails();
    }
}
