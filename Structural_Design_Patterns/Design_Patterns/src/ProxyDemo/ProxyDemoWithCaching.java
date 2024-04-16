package ProxyDemo;

public class ProxyDemoWithCaching {
    public static void main(String[] args) {
        // Using the image proxy with caching
        Image proxyImage1 = new ImageProxy("sample.jpg");
        proxyImage1.display();

        System.out.println();

        // Reusing the cached image
        Image proxyImage2 = new ImageProxy("sample.jpg");
        proxyImage2.display();
    }
}
