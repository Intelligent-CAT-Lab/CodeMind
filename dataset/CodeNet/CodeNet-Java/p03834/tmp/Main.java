import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();
System.out.println("[INST]10;s;reader.readLine();"+s);

            System.out.println(s.replace(",", " "));
        }
    }
}
