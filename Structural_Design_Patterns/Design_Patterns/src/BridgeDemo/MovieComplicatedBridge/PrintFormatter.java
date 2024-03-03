package BridgeDemo.MovieComplicatedBridge;

import java.util.List;

//We finalize our Bridge pattern using a PrintFormatter
//This still knows nothing about the movie object
//It’s just dealing with the header and the details associated with the movie
//All of this stuff is abstracted out and not coupled to the actual movie instance
public class PrintFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append(header);
        builder.append("\n");

        for (Detail detail: details) {
            builder.append(detail.getLabel());
            builder.append(":");
            builder.append(detail.getValue());
            builder.append("\n");
        }

        return builder.toString();
    }
}
