package BridgeDemo.ShapesWithBridge;

public class ShapesWithBridgeDemo {
    public static void main(String[] args) {
        Color blue = new Blue();
        Shape circle = new Circle(blue);

        Color red = new Red();
        Shape square = new Square(red);

        circle.applyColor();
        square.applyColor();
    }
}
