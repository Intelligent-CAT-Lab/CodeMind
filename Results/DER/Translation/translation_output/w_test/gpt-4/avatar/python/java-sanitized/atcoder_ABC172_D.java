import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class atcoder_ABC172_D {
    public static void main(String[] args) throws IOException {
        // Set up BufferedReader to read input from the user
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read the input number
        int n = Integer.parseInt(reader.readLine());
        solve(n);
    }

    private static void solve(int n) {
        // Initialize the answer to zero
        long ans = 0;

        // Iterate over the range [1, n] and calculate the sum of the series
        for (int i = 1; i <= n; i++) {
            long x = n / i;
            ans += i * (1 + x) * x / 2;
        }

        // Print the final answer
        System.out.println(ans);
    }
}