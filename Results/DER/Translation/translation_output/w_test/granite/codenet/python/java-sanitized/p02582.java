import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02582 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(0);
        } else if (count == s.length()) {
            System.out.println(3);
        } else if (s.contains("RRS") || s.contains("SRR")) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }
    }
}