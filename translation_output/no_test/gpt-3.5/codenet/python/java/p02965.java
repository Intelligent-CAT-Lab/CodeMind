```java
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if (System.getenv("LOCAL") != null) {
            br = new BufferedReader(new FileReader("_in.txt"));
        }

        int MOD = 998244353;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] factorials = getFactorials(M * 3 / 2 + N, MOD);
        long[] finvs = new long[M * 3 / 2 + N + 1];
        long p = 1;
        long[] invs = modInvs(M * 3 / 2 + N, MOD);
        for (int i = 0; i < invs.length; i++) {
            p = (p * invs[i]) % MOD;
            finvs[i] = p;
        }

        long[] odds = new long[(M + 1) / 2 - (M % 2 == 0 ? 0 : 1)];
        for (int i = M % 2; i <= M; i += 2) {
            odds[i / 2] = i;
        }
        long[] halves = new long[odds.length];
        for (int i = 0; i < odds.length; i++) {
            halves[i] = (M * 3 - odds[i]) / 2;
        }

        long[] oc1 = ncr(N, odds, factorials, finvs, MOD);
        long[] oc2 = ncr(N - 1, odds, factorials, finvs, MOD);

        long c1 = 0;
        for (int i = 0; i < halves.length; i++) {
            c1 = (c1 + ncr(halves[i] + N - 1, N - 1, factorials, finvs, MOD) * oc1[i]) % MOD;
        }

        halves = new long[M % 2 == 0 ? M / 2 : (M - 1) / 2];
        for (int i = M % 2; i < M; i += 2) {
            halves[i / 2] = (M - i) / 2;
        }

        long c2a = 0;
        for (int i = 0; i < halves.length; i++) {
            c2a = (c2a + ncr(halves[i] + N - 1, N - 1, factorials, finvs, MOD) * oc1[i]) % MOD;
        }

        long c2b = 0;
        for (int i = 0; i < halves.length; i++) {
            c2b = (c2b + ncr(halves[i] + N - 2, N - 2, factorials, finvs, MOD) * oc2[i]) % MOD;
        }

        long c2 = ((c2a - c2b) * N) % MOD;
        System.out.println((c1 - c2 + MOD) % MOD);
    }

    public static long[] getFactorials(int max, int mod) {
        long[] ret = new long[max + 1];
        ret[0] = 1;
        long n = 1;
        for (int i = 1; i <= max; i++) {
            n = (n * i) % mod;
            ret[i] = n;
        }
        return ret;
    }

    public static long[] modInvs(int max, int mod) {
        long[] invs = new long[max + 1];
        invs[1] = 1;
        for (int x = 2; x <= max; x++) {
            invs[x] = ((-mod / x) * invs[mod % x] + mod) % mod;
        }
        return invs;
    }

    public static long[] ncr(int n, long[] r, long[] factorials, long[] finvs, int mod) {
        long[] ret = new long[r.length];
        for (int i = 0; i < r.length; i++) {
            ret[i] = (factorials[n] * finvs[(int) r[i]] % mod * finvs[n - (int) r[i]] % mod) % mod;
            if (n < r[i]) {
                ret[i] = 0;
            }
        }
        return ret;
    }
}
```
