package BridgeDemo.MovieComplicatedBridge;

//This class has a name, value pair
//We use it to pass information between the bridge pieces
public class Detail {
    private String label;
    private String value;

    public Detail(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }
}
