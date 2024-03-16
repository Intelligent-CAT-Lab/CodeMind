import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02534 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Reading the input number
        int k = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append("ACL");
        }

        // Printing the resulting string
        System.out.println(sb.toString());
    }
}