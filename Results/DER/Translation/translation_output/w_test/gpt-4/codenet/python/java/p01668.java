Below is the equivalent Java code to the provided Python code. In Java, you would typically use `Scanner` for reading input and `System.out` for printing output. Also, in Java, we use methods rather than standalone functions.

```java
import java.util.Scanner;

public class Main {
    static final int MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        System.out.println(solve(A, B, C));
        sc.close();
    }

    private static long solve(String A, String B, String C) {
        int L = Math.max(A.length(), B.length());
        long[] pw10 = new long[L+1];
        long r = 1;
        for (int i = 1; i <= L; i++) {
            pw10[i] = r = r * 10 % MOD;
        }

        long ans = calc(B, C, pw10);
        long a = Long.parseLong(A);
        if (a > 0) {
            A = String.valueOf(a - 1);
            ans = (ans - calc(A, C, pw10) + MOD) % MOD;
        }
        return ans;
    }

    private static long calc(String X, String Y, long[] pw10) {
        int mod = (int)1e9 + 9;
        int N = X.length();
        int M = Y.length();
        if (N < M) return 0;
        RollingHash hx = new RollingHash(X, 37, mod);
        RollingHash hy = new RollingHash(Y, 37, mod);
        long[] hY = new long[M+1];
        for (int i = 0; i <= M; i++) {
            hY[i] = hy.get(0, i);
        }
        long res = 0, cur = 0;
        for (int i = 0; i < N; i++) {
            int v = X.charAt(i) - '0';
            res = (res + cur * v * pw10[N - i - 1]) % MOD;
            for (int j = Math.max(i - M + 1, 0); j <= i; j++) {
                if (j + M > N) break;
                int l = i - j;
                if ((l > 0 && hx.get(j, j + l) != hY[l]) || v <= Y.charAt(i - j) - '0') continue;
                res = (res + pw10[N - j - M]) % MOD;
            }
            if (M + i + 1 <= N) {
                res = (res + v * pw10[N - M - i - 1] * (N - i - M)) % MOD;
            }
            if (i >= M - 1 && hx.get(i - M + 1, i + 1) == hY[M]) {
                cur++;
            }
        }
        for (int j = 0; j <= N - M; j++) {
            if (hx.get(j, j + M) != hY[M]) continue;
            res++;
        }

        if (Y.equals("0")) {
            for (int i = 1; i < N; i++) {
                res = (res - 9 * pw10[N - i - 1] * i) % MOD;
            }
            res = (res - (N - 1) + MOD) % MOD;
        }

        return res;
    }

    static class RollingHash {
        private int mod;
        private long[] pw;
        private long[] h;

        public RollingHash(String s, int base, int mod) {
            this.mod = mod;
            pw = new long[s.length() + 1];
            h = new long[s.length() + 1];

            long v = 0;
            for (int i = 0; i < s.length(); i++) {
                h[i + 1] = v = (v * base + s.charAt(i)) % mod;
            }
            v = 1;
            for (int i = 0; i < s.length(); i++) {
                pw[i + 1] = v = v * base % mod;
            }
        }

        public long get(int l, int r) {
            return (h[r] - h[l] * pw[r - l] % mod + mod) % mod;
        }
    }
}
```

To run this java code, compile it with `javac Main.java` and then run it with `java Main`. Provide the test input (`1 3 2`) to it, and it should output the expected result (`1`).

Please note that in the Java code, we are mimicking the behavior of the Python code as closely as possible, including the rolling hash computation. Also, we make sure to correct for potential negative values returned by the modulo operation by adding `mod` and using another modulo operation to normalize the result back into range.

Remember that Java uses zero-based indexing for arrays, unlike Python's one-based slicing, which requires some adjustments in the indices for the array accesses. Additionally, Java's `%` operator can return negative values if the left-hand operand is negative; hence, it may be necessary to adjust the result to ensure it is non-negative.
