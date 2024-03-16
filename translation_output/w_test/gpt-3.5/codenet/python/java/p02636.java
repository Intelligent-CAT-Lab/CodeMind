```java
import java.util.*;

public class Main {
    static long cmb(int n, int r, int mod, long[] g1, long[] g2) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return (g1[n] * g2[r] % mod) * g2[n - r] % mod;
    }

    public static void main(String[] args) {
        long mod = 998244353;
        int N = 2 * 1000;
        long[] g1 = new long[N + 1];
        long[] g2 = new long[N + 1];
        long[] inverse = new long[N + 1];

        Arrays.fill(g1, 1);
        Arrays.fill(g2, 1);
        Arrays.fill(inverse, 1);

        for (int i = 2; i <= N; i++) {
            g1[i] = (g1[i - 1] * i) % mod;
            inverse[i] = (-inverse[mod % i] * (mod / i) % mod + mod) % mod;
            g2[i] = (g2[i-1] * inverse[i]) % mod;
        }
        inverse[0] = 0;

        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int len = S.length();
        if (len == 1) {
            System.out.println(1);
            return;
        }

        long[][][] dp = new long[N+1][N+2][N+2];
        long[][][] dpf = new long[N+1][N+2][N+2];

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N+1; j++) {
                for (int k = 0; k <= N+1; k++) {
                    dp[i][j][k] = -1000000000;
                    dpf[i][j][k] = -1000000000;
                }
            }
        }

        dpf[0][0][0] = 1;
        if (S.charAt(0) == '0') dp[1][1][0] = 0;
        if (S.charAt(1) == '0') dp[1][1][0] = 0;
        if (S.charAt(0) == '1') dp[1][0][1] = 0;
        if (S.charAt(1) == '1') dp[1][0][1] = 0;
        dpf[1][0][0] = 2;

        int Zero = 1 - Character.getNumericValue(S.charAt(0)) + 1 - Character.getNumericValue(S.charAt(1));
        int One = Character.getNumericValue(S.charAt(0)) + Character.getNumericValue(S.charAt(1));

        for (int i = 2; i < len; i++) {
            Zero += 1 - Character.getNumericValue(S.charAt(i));
            One += Character.getNumericValue(S.charAt(i));

            for (int j = 0; j <= Zero; j++) {
                for (int k = 0; k <= One; k++) {
                    int a = 1 - Character.getNumericValue(S.charAt(i));
                    int b = Character.getNumericValue(S.charAt(i));
                    dp[i][j][k] = Math.max(dp[i-1][j-a][k-b] - 2, dpf[i-1][j-a][k-b] - 1);
                    a = 1 - Character.getNumericValue(S.charAt(i-1));
                    b = Character.getNumericValue(S.charAt(i-1));
                    dpf[i][j][k] = Math.max(dpf[i-1][j][k] + 1, dp[i-1][j][k] + 1 - dp[i-1][j][k] % 2);
                    dp[i][j][k] = Math.max(dp[i][j][k], 2 * (dpf[i-2][j-a][k-b] / 2), 2 * (dp[i-2][j-a][k-b] / 2));
                    if (dp[i][j][k] < 0) dp[i][j][k] = -100000;
                    if (dpf[i][j][k] < 0) dpf[i][j][k] = -100000;
                }
            }
            dpf[i][0][0] = i + 1;
        }

        S = new StringBuilder(S).reverse().toString();
        Zero = 0;
        One = 0;
        long ans = 1;
        Set<String> check = new HashSet<>();
        int one = 0;
        int zero = 0;

        for (int i = 0; i < len; i++) {
            Zero += (S.charAt(i) == '1' ? 1 : 0);
            One += (S.charAt(i) == '0' ? 1 : 0);

            for (int j = 0; j <= zero; j++) {
                for (int k = 0; k <= one; k++) {
                    if ((dp[len-1-i][j][k] >= 0 || dpf[len-1-i][j][k] >= 0) && j != 0 && k != 0) {
                        check.add(j + "-" + k);
                    }
                }
            }

            Set<String> ncheck = new HashSet<>();
            for (String pair : check) {
                String[] parts = pair.split("-");
                int j = Integer.parseInt(parts[0]);
                int k = Integer.parseInt(parts[1]);

                long A = 1;
                long B = 1;

                if (j != 0) {
                    A = cmb(Zero+j-1, j, mod, g1, g2);
                }
                if (k != 0) {
                    B = cmb(One+k-1, k, mod, g1, g2);
                }
                ans += (A * B) % mod;
                ans %= mod;

                int a = 1 - Character.getNumericValue(S.charAt(i));
                int b = Character.getNumericValue(S.charAt(i));

                if (j >= a && k >= b) {
                    ncheck.add((j-a) + "-" + (k-b));
                }
            }

            check = ncheck;
            zero -= 1 - Character.getNumericValue(S.charAt(i));
            one -= Character.getNumericValue(S.charAt(i));
        }

        System.out.println(ans);
    }
}
```

