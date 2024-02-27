package BridgeDemo.ShapesWithBridge;

public class ShapesWithBridgeDemo {
    public static void main(String[] args) {
        Color blue = new Blue();
        Shape circle = new Circle(blue);

        Color red = new Red();
        Shape square = new Square(red);

        Color green = new Green();
        Shape square2 = new Square(green);

        //We don't have to change our shape to use the bridge between the color and the shape
        circle.applyColor();
        square.applyColor();
        square2.applyColor();
    }
}
