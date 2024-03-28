Here is the translated Java code equivalent to the provided Python code:

```java
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class AdvancedDynamicProgramming {

    static final int N = 2000;
    static final int mod = 998244353;
    static long[] g1 = new long[N + 1];
    static long[] g2 = new long[N + 1];
    static long[] inverse = new long[N + 1];

    static {
        g1[0] = g2[0] = g1[1] = g2[1] = inverse[1] = 1;
        for (int i = 2; i <= N; i++) {
            g1[i] = g1[i - 1] * i % mod;
            inverse[i] = mod - (mod / i) * inverse[(int)(mod % i)] % mod;
            g2[i] = g2[i - 1] * inverse[i] % mod;
        }
    }

    public static long cmb(int n, int r) {
        if (r < 0 || r > n) return 0;
        return g1[n] * g2[r] % mod * g2[n - r] % mod;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int N = S.length();
        long ans = 1;

        long[][][] dp = new long[N + 1][N + 2][N + 2];
        long[][][] dpf = new long[N + 1][N + 2][N + 2];

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N + 1; j++) {
                for (int k = 0; k <= N + 1; k++) {
                    dp[i][j][k] = dpf[i][j][k] = -1000000000000L;
                }
            }
        }

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

        int Zero = 1 - (S.charAt(0) - '0') + 1 - (S.charAt(1) - '0');
        int One = (S.charAt(0) - '0') + (S.charAt(1) - '0');
        for (int i = 2; i < N; i++) {
            Zero += 1 - (S.charAt(i) - '0');
            One += (S.charAt(i) - '0');
            for (int j = 0; j <= Zero; j++) {
                for (int k = 0; k <= One; k++) {
                    int a = 1 - (S.charAt(i) - '0');
                    int b = S.charAt(i) - '0';
                    dp[i][j][k] = Math.max(dp[i - 1][j - a][k - b] - 2, dpf[i - 1][j - a][k - b] - 1);
                    a = 1 - (S.charAt(i - 1) - '0');
                    b = S.charAt(i - 1) - '0';
                    dpf[i][j][k] = Math.max(dpf[i - 1][j][k] + 1, dp[i - 1][j][k] + 1 - dp[i - 1][j][k] % 2);
                    dp[i][j][k] = Math.max(dp[i][j][k], 2 * (dpf[i - 2][j - a][k - b] / 2), 2 * (dp[i - 2][j - a][k - b] / 2));
                    if (dp[i][j][k] < 0) {
                        dp[i][j][k] = -100000;
                    }
                    if (dpf[i][j][k] < 0) {
                        dpf[i][j][k] = -100000;
                    }
                }
            }
            dpf[i][0][0] = i + 1;
        }

        S = new StringBuilder(S).reverse().toString();
        Zero = 0;
        One = 0;
        Set<Pair> check = new HashSet<>();
        int one = 0, zero = 0;
        for (char c : S.toCharArray()) {
            if (c == '1') one++;
            else zero++;
        }

        for (int i = 0; i < N; i++) {
            Zero += (S.charAt(i) == '1') ? 1 : 0;
            One += (S.charAt(i) == '0') ? 1 : 0;
            for (int j = 0; j <= zero; j++) {
                for (int k = 0; k <= one; k++) {
                    if ((dp[N - 1 - i][j][k] >= 0 || dpf[N - 1 - i][j][k] >= 0) && (j != 0 || k != 0)) {
                        check.add(new Pair(j, k));
                    }
                }
            }
            Set<Pair> ncheck = new HashSet<>();
            for (Pair p : check) {
                long A = 1, B = 1;
                if (p.first != 0) {
                    A = cmb(Zero + p.first - 1, p.first);
                }
                if (p.second != 0) {
                    B = cmb(One + p.second - 1, p.second);
                }
                ans += A * B;
                ans %= mod;
                int a = 1 - (S.charAt(i) - '0');
                int b = S.charAt(i) - '0';
                if (p.first >= a && p.second >= b) {
                    ncheck.add(new Pair(p.first - a, p.second - b));
                }
            }
            check = ncheck;
            zero -= 1 - (S.charAt(i) - '0');
            one -= (S.charAt(i) - '0');
        }

        System.out.println(ans);
        scanner.close();
    }
}

class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;

        if (first != pair.first) return false;
        return second == pair.second;
    }

    @Override
    public int hashCode() {
        int result = first;
        result = 31 * result + second;
        return result;
    }
}
```

Due to Java's verbosity compared to Python, the code appears longer and more detailed. Note that the Java version of the program utilizes a `HashSet` to store unique pairs and uses a custom `Pair` class due to the absence of native tuple support.

To run the test case successfully, you must input the string "0001" when prompted.

