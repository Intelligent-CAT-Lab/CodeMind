```java
import java.util.Arrays;

public class Main {
    static int N = 0;
    static int MOD = 1000000007;
    static int[][] memo;

    public static void main(String[] args) {
        N = 3;
        MOD = 1000000007;
        memo = new int[N + 1][4];

        for (int i = 0; i <= N; i++) {
            Arrays.fill(memo[i], -1);
        }

        System.out.println(dfs(0, 0));
    }

    static boolean ok(int last4) {
        for (int i = 0; i < 4; i++) {
            int[] t = {last4 / 1000, (last4 / 100) % 10, (last4 / 10) % 10, last4 % 10};

            if (i >= 1) {
                int temp = t[i - 1];
                t[i - 1] = t[i];
                t[i] = temp;
            }

            if (String.valueOf(t[0]) + t[1] + t[2] + t[3]).contains("AGC")) {
                return false;
            }
        }

        return true;
    }

    static int dfs(int cur, int last3) {
        if (memo[cur][last3] != -1) {
            return memo[cur][last3];
        }

        if (cur == N) {
            return 1;
        }

        int ret = 0;

        for (char c : new char[]{'A', 'C', 'G', 'T'}) {
            if (ok(last3 * 10 + (c == 'A' ? 0 : c == 'C' ? 1 : c == 'G' ? 2 : 3))) {
                ret = (ret + dfs(cur + 1, last3 * 10 + (c == 'A' ? 0 : c == 'C' ? 1 : c == 'G' ? 2 : 3)) % MOD) % MOD;
            }
        }

        memo[cur][last3] = ret;
        return ret;
    }
}
```
