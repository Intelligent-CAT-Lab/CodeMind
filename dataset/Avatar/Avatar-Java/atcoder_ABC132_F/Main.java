import java.util.*;

public class Main {
    public static void main(String[] args) {
        long mod = (long) 1e9 + 7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        ArrayList<Integer> len = new ArrayList<>();
        int l = 1;
        while (l <= n) {
            int r = n / (n / l);
            len.add(r - l + 1);
            l = r + 1;
        }

        int q = len.size();
        long[] dp = new long[k * (q + 1)];

        for (int j = 1; j <= q; j++) {
            dp[j] = len.get(j - 1) + dp[j - 1];
        }

        for (int i = 1; i < k; i++) {
            for (int j = 1; j <= q; j++) {
                dp[i * (q + 1) + j] = dp[i * (q + 1) + j - 1] + dp[(i - 1) * (q + 1) + q - j + 1] * len.get(j - 1);
                dp[i * (q + 1) + j] %= mod;
            }
        }

        System.out.println(dp[k * (q + 1) - 1]);
    }
}