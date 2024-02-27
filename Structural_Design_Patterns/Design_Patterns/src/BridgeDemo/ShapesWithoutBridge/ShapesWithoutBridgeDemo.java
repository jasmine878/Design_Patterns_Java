package BridgeDemo.ShapesWithoutBridge;

public class ShapesWithoutBridgeDemo {
    public static void main(String[] args) {
        Circle circle = new BlueCircle();
        Square square = new RedSquare();
        Square square2 = new GreenSquare();

        circle.applyColor();
        square.applyColor();
        square2.applyColor();
    }
}
