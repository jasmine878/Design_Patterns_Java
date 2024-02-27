package BridgeDemo.ShapesWithBridge;

public abstract class Shape {
    protected Color color;

    //We take a color in the constructor to utilize through Composition.
    //Color is its own interface, and it has the applyColor() method which will be applied
    public Shape(Color color) {
        this.color = color;
    }

    //Shape also has applyColor()
    //It seems redundant, but it's not
    abstract public void applyColor();
}
