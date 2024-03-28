import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p03456 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] input = reader.readLine().split(" ");
            String concatenated = input[0] + input[1];
            int n = Integer.parseInt(concatenated);
            int sqrtn = (int) Math.sqrt(n);

            boolean foundPerfectSquare = false;

            for (int i = 1; i <= sqrtn; i++) {
                if (i * i == n) {
                    System.out.println("Yes");
                    foundPerfectSquare = true;
                    break;
                }
            }

            if (!foundPerfectSquare) {
                System.out.println("No");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}