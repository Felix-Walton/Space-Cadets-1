import java.io.*;
import java.net.*;

public class idToName {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String strLine = in.readLine();
        strLine = "https://www.ecs.soton.ac.uk/people/"+strLine;
        URL myURL = new URL(strLine);
        System.out.println(myURL);

        BufferedReader site = new BufferedReader(
        new InputStreamReader(myURL.openStream()));

        String inputLine = site.readLine();
        for (int i = 0; i < 72; i++) {
            inputLine = site.readLine();
        }
        //System.out.println(inputLine);
        Integer nameStart = inputLine.indexOf("name") + 6;
        Integer nameEnd = inputLine.indexOf("<em property");

        String name = inputLine.substring(nameStart,nameEnd);
        System.out.println(name);
    }
}
