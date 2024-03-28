```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int INF = Integer.MAX_VALUE;
        long MOD = 998244353;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] factorials = getFactorials(M * 3 / 2 + N, MOD);
        int[] finvs = new int[M * 3 / 2 + N + 1];
        int p = 1;
        for (int i = 0; i < M * 3 / 2 + N; i++) {
            p = (int)(((long)p * modInverse(i + 1, MOD) % MOD));
            finvs[i] = p;
        }

        int[] odds = new int[(M / 2) + 1];
        int val = M % 2;
        for (int i = 0; val <= M; val += 2) {
            odds[i++] = val;
        }

        int[] halves = new int[odds.length];
        for (int i = 0; i < odds.length; i++) {
            halves[i] = (M * 3 - odds[i]) / 2;
        }

        int oc1 = nCr(N, odds, MOD, factorials, finvs);
        int oc2 = nCr(N - 1, odds, MOD, factorials, finvs);

        int c1 = (int)(((long)nCr(halves, N - 1, MOD, factorials, finvs) * oc1 % MOD));

        halves = new int[odds.length];
        for (int i = 0; i < odds.length; i++) {
            halves[i] = (M - odds[i]) / 2;
        }

        int c2a = (int)(((long)nCr(halves, N - 1, MOD, factorials, finvs) * oc1 % MOD);
        int c2b = (int)(((long)nCr(halves, N - 2, MOD, factorials, finvs) * oc2 % MOD));

        int c2 = (c2a - c2b) * N % MOD;

        long result = c1 - c2;
        if (result < 0) {
            result += MOD;
        }
        System.out.println(result);
    }

    private static int[] getFactorials(int max, long mod) {
        int[] ret = new int[max + 1];
        ret[0] = 1;
        int n = 1;
        for (int i = 1; i <= max; i++) {
            n = (int)(((long)n * i) % mod);
            ret[i] = n;
        }
        return ret;
    }

    private static int modInverse(int x, long mod) {
        int[] invs = new int[x + 1];
        invs[0] = 1;
        invs[1] = 1;
        for (int i = 2; i <= x; i++) {
            invs[i] = (int)(((mod - mod / i) * invs[mod % i]) % mod);
        }
        return invs[x];
    }

    private static int nCr(int n, int[] r, long mod, int[] factorials, int[] finvs) {
        int ret = (int)(((long)factorials[n] * finvs[r] % mod) * finvs[n - r] % mod);
        if (n < r) {
            ret = 0;
        }
        return ret;
    }
}
```
```
