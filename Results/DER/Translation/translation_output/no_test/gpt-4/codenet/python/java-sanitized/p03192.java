import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p03192 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String N = reader.readLine();
        int count = 0;

        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) == '2') {
                count++;
            }
        }

        System.out.println(count);
    }
}