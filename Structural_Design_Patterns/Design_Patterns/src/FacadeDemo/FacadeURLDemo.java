package FacadeDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class FacadeURLDemo {
    public static void main(String[] args) throws Exception {
        URL url = new URI("https://app.pluralsight.com/profile/author/bryan-hansen").toURL();
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;

        while((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
    }
}
