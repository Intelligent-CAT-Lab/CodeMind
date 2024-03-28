import java.util.*;
import java.io.*;

public class p02668 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        long[] dp = new long[m + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            long[] dp2 = new long[m + 1];
            for (int j = 0; j < m; j++) {
                dp2[j + 1] = (dp2[j + 1] + dp[j] * j * (j + 1) % 1000000007) % 1000000007;
                dp2[j + 1] = (dp2[j + 1] + dp[j] * j * (j + 1) % 1000000007) % 1000000007;
            }
            dp = dp2;
        }
        System.out.println(dp[m]);
    }
}