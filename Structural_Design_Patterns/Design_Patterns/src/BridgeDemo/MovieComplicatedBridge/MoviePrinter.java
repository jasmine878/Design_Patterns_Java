package BridgeDemo.MovieComplicatedBridge;

import java.util.ArrayList;
import java.util.List;

//We build our header and details list in here
//This is all abstract from the type of content that we’re going to print
public class MoviePrinter extends Printer {

    private final Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected String getHeader() {
        return movie.getClassification();
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();

        details.add(new Detail("Title", movie.getTitle()));
        details.add(new Detail("Year", movie.getYear()));
        details.add(new Detail("Runtime", movie.getRuntime()));

        return details;
    }
}
