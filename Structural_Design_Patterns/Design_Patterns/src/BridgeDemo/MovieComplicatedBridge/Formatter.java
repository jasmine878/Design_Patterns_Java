package BridgeDemo.MovieComplicatedBridge;

import java.util.List;

//We want to make a Printable interface for Movie
//And we want it to be able to handle any type of Printing
//The interface knows nothing of the types of format that it’s going to print
//Or the objects that it’s working with
public interface Formatter {
    String format(String header, List<Detail> details);
}
