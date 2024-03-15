import java.io.*;
import java.util.*;

public class p02708 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        long ans = 0;
        final int MOD = (int) (1e9 + 7);

        for (int i = k; i <= n + 1; i++) {
            long maxSum = ((long) 2 * n - i + 1) * i / 2;
            long minSum = (long) i * (i - 1) / 2;
            ans = (ans + (maxSum - minSum + 1)) % MOD;
        }

        System.out.println(ans);
    }
}