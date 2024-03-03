package BridgeDemo.MovieComplicatedBridge;

import java.util.List;

//This is the other side of our Bridge
//It doesn’t know about the base classes for what we’re working with
//and the content types
public abstract class Printer {
    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }
    abstract protected String getHeader();
    abstract protected List<Detail> getDetails();
}
