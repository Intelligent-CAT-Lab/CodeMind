```java
import java.util.*;

public class Main {
    static long cmb(int n, int r, int mod, long[] g1, long[] g2) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return g1[n] * g2[r] % mod * g2[n - r] % mod;
    }

    public static void main(String[] args) {
        int mod = 998244353;
        int N = 2 * (int) Math.pow(10, 3);
        long[] g1 = new long[N + 1];
        long[] g2 = new long[N + 1];
        long[] inverse = new long[N + 1];

        for (int i = 0; i <= N; i++) {
            g1[i] = 1;
            g2[i] = 1;
            inverse[i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            g1[i] = (g1[i - 1] * i) % mod;
            inverse[i] = (-inverse[mod % i] * (mod / i) % mod + mod) % mod;
            g2[i] = (g2[i - 1] * inverse[i]) % mod;
        }

        inverse[0] = 0;

        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int inputLength = S.length();
        long[][][] dp = new long[N + 1][N + 2][N + 2];
        long[][][] dpf = new long[N + 1][N + 2][N + 2];

        dpf[0][0][0] = 1;

        if (S.charAt(0) == '0') {
            dp[1][1][0] = 0;
        }

        if (S.charAt(1) == '0') {
            dp[1][1][0] = 0;
        }

        if (S.charAt(0) == '1') {
            dp[1][0][1] = 0;
        }

        if (S.charAt(1) == '1') {
            dp[1][0][1] = 0;
        }

        dpf[1][0][0] = 2;
        int zero = 1 - Character.getNumericValue(S.charAt(0)) + 1 - Character.getNumericValue(S.charAt(1));
        int one = Character.getNumericValue(S.charAt(0)) + Character.getNumericValue(S.charAt(1));

        for (int i = 2; i < inputLength; i++) {
            zero += 1 - Character.getNumericValue(S.charAt(i));
            one += Character.getNumericValue(S.charAt(i));

            for (int j = 0; j <= zero; j++) {
                for (int k = 0; k <= one; k++) {
                    int a = 1 - Character.getNumericValue(S.charAt(i));
                    int b = Character.getNumericValue(S.charAt(i));
                    dp[i][j][k] = Math.max(dp[i - 1][j - a][k - b] - 2, dpf[i - 1][j - a][k - b] - 1);

                    a = 1 - Character.getNumericValue(S.charAt(i - 1));
                    b = Character.getNumericValue(S.charAt(i - 1));
                    dpf[i][j][k] = Math.max(dpf[i - 1][j][k] + 1, dp[i - 1][j][k] + 1 - dp[i - 1][j][k] % 2);
                    dp[i][j][k] = Math.max(dp[i][j][k], 2 * (dpf[i - 2][j - a][k - b] / 2), 2 * (dp[i - 2][j - a][k - b] / 2));

                    if (dp[i][j][k] < 0) {
                        dp[i][j][k] = -(int)Math.pow(10, 5);
                    }
                    if (dpf[i][j][k] < 0) {
                        dpf[i][j][k] = -(int)Math.pow(10, 5);
                    }
                }
            }
            dpf[i][0][0] = i + 1;
        }

        S = new StringBuilder(S).reverse().toString();

        zero = 0;
        one = 0;
        long ans = 1;
        Set<List<Integer>> check = new HashSet<>();
        int oneCount = S.chars().filter(ch -> ch == '1').count();
        int zeroCount = S.chars().filter(ch -> ch == '0').count();

        for (int i = 0; i < inputLength; i++) {
            zero += (S.charAt(i) == '1') ? 1 : 0;
            one += (S.charAt(i) == '0') ? 1 : 0;

            for (int j = 0; j <= zeroCount; j++) {
                for (int k = 0; k <= oneCount; k++) {
                    if ((dp[inputLength - 1 - i][j][k] >= 0 || dpf[inputLength - 1 - i][j][k] >= 0) && (j != 0 || k != 0)) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(j);
                        temp.add(k);
                        check.add(temp);
                    }
                }
            }

            Set<List<Integer>> ncheck = new HashSet<>();
            for (List<Integer> pair : check) {
                int j = pair.get(0);
                int k = pair.get(1);
                long A = 1;
                long B = 1;
                if (j != 0) {
                    A = cmb(zero + j - 1, j, mod, g1, g2);
                }
                if (k != 0) {
                    B = cmb(one + k - 1, k, mod, g1, g2);
                }
                ans += A * B;
                ans %= mod;
                int a = 1 - Character.getNumericValue(S.charAt(i));
                int b = Character.getNumericValue(S.charAt(i));
                if (j >= a && k >= b) {
                    List<Integer> newPair = new ArrayList<>();
                    newPair.add(j - a);
                    newPair.add(k - b);
                    ncheck.add(newPair);
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

