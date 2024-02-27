package BridgeDemo.ShapesWithBridge;

public class Square extends Shape {

    //It's utilizing the composition to apply color to the square shape
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
