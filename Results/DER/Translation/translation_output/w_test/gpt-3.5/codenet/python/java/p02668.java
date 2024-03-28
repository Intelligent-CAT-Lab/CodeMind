```java
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    static final long MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        long[] pow2 = makePower(2, M + 10);
        long[] ipow2 = makePower((1 + MOD) / 2, M + 10);

        long[] dp = new long[M + 1];
        for (int i = 0; i < M + 1; i++) {
            dp[i] = pow2[i];
        }

        for (int i = 0; i < N - 1; i++) {
            update(dp, ipow2, M);
        }

        System.out.println(dp[M]);
    }

    public static long[] makePower(long a, int L) {
        int B = Integer.toBinaryString(L).length();
        long[] x = new long[1 << B];
        x[0] = 1;
        for (int n = 0; n < B; n++) {
            int end = 1 << (n + 1);
            int start = 1 << n;
            for (int i = start; i < end; i++) {
                x[i] = x[i ^ (1 << n)] * a % MOD;
            }
            a = (a * a) % MOD;
        }
        long[] result = new long[L];
        System.arraycopy(x, 0, result, 0, L);
        return result;
    }

    public static void update(long[] dp, long[] ipow2, int M) {
        long[] B = dp.clone();
        for (int i = 1; i <= M; i++) {
            dp[i] = ((B[i] * i) % MOD * ipow2[i] % MOD + dp[i - 1]) % MOD;
        }
        for (int i = 1; i <= M; i++) {
            dp[i] = (dp[i] * pow2[i]) % MOD;
        }
        for (int i = 0; i <= M; i++) {
            dp[i] = (dp[i] + (i + 1) * B[i]) % MOD;
        }
    }
}
```

