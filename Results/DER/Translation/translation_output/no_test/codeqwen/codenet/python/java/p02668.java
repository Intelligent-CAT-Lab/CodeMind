Here is the Java version of the provided Python code:

```java
import java.io.*;
import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    static final int MAX = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] pow2 = makePower(2, M + 10);
        long[] ipow2 = makePower((1 + MOD) / 2, M + 10);

        long[] dp = pow2.clone();
        for (int i = 0; i < N - 1; i++) {
            update(dp);
        }

        System.out.println(dp[M]);
    }

    static long[] makePower(long a, int L) {
        int B = Integer.bitCount(L);
        long[] x = new long[1 << B];
        x[0] = 1;
        for (int n = 0; n < B; n++) {
            for (int i = 1 << n; i < 1 << (n + 1); i++) {
                x[i] = x[i - (1 << n)] * a % MOD;
            }
            a *= a;
            a %= MOD;
        }
        return Arrays.copyOf(x, L);
    }

    static void update(long[] dp) {
        long[] B = dp.clone();
        long[] C = new long[M + 1];
        for (int i = 0; i < M; i++) {
            C[i] = dp[i] * i % MOD * ipow2[i] % MOD;
        }
        for (int i = 1; i < M + 1; i++) {
            dp[i] = (i - 1 < 0 ? 0 : d
