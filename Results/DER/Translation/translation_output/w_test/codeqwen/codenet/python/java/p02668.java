Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        long[] pow2 = makePower(2, M + 10);
        long[] ipow2 = makePower((1 + MOD) / 2, M + 10);

        long[] dp = pow2.clone();
        for (int i = 0; i < N - 1; i++) {
            update(dp);
        }

        System.out.println(dp[M]);
    }

    static long[] makePower(long a, int L) {
        int B = Integer.highestOneBit(L);
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
        long[] C = new long[dp.length];
        for (int i = 0; i < dp.length - 1; i++) {
            C[i] = (dp[i] * i % MOD * ipow2[i] % MOD) % MOD;
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i] = (Arrays.stream(C, 0, i - 1).sum() % MOD) * pow2[i - 1] % MOD;
        }
        for (int i = 
