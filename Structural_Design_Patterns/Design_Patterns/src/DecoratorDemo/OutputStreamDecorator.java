package DecoratorDemo;

import java.io.*;

public class OutputStreamDecorator {
    public static void main(String[] args) throws IOException {
        File file = new File("./output.txt");
        file.createNewFile();
        OutputStream oStream = new FileOutputStream(file);

        DataOutputStream doStream = new DataOutputStream(oStream);
        doStream.writeChars("Some text");

        doStream.close();
        oStream.close();
    }
}
