package BridgeDemo.ShapesWithBridge;

public class ShapesWithBridgeDemo {
    public static void main(String[] args) {
        Color blue = new Blue();
        Shape circle = new Circle(blue);

        Color red = new Red();
        Shape square = new Square(red);

        Color green = new Green();
        Shape square2 = new Square(green);

        circle.applyColor();
        square.applyColor();
        square2.applyColor();
    }
}
