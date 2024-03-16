import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02582 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String s = reader.readLine().trim();
            if (s.equals("RRR")) {
                System.out.println(3);
            } else if (s.equals("RRS") || s.equals("SRR")) {
                System.out.println(2);
            } else if (!s.contains("R")) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}