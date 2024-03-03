package BridgeDemo.MovieComplicatedBridge;

public class BridgeDemo {
    public static void main(String[] args) {
        //Create movie object
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setYear("2014");
        movie.setRuntime("2:15");

        //Pass movie object to Print Formatter
        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(printFormatter);
        System.out.println(printedMaterial);

        //Pass movie object to Html Formatter
        Formatter htmlFormatter = new HtmlFormatter();
        String htmlMaterial = moviePrinter.print(htmlFormatter);

        System.out.println(htmlMaterial);

    }
}
