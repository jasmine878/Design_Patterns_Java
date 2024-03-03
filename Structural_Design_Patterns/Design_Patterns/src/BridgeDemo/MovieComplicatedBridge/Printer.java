package BridgeDemo.MovieComplicatedBridge;

import java.util.List;

//This is the other side of our Bridge
public abstract class Printer {
    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }
    abstract protected String getHeader();
    abstract protected List<Detail> getDetails();
}
