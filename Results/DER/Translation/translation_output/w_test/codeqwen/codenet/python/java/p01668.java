Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    static final int MOD = 1000000007;
    static final int BASE = 37;

    static class RollingHash {
        int mod;
        int[] pw;
        int[] h;

        RollingHash(String s) {
            this.mod = MOD;
            int l = s.length();
            this.pw = new int[l + 1];
            this.h = new int[l + 1];

            int v = 0;
            for (int i = 0; i < l; i++) {
                h[i + 1] = v = (v * BASE + s.charAt(i)) % mod;
            }
            v = 1;
            for (int i = 0; i < l; i++) {
                pw[i + 1] = v = v * BASE % mod;
            }
        }

        int get(int l, int r) {
            return (h[r] - h[l] * pw[r - l]) % mod;
        }
    }

    static int calc(String X, String Y) {
        int N = X.length();
        int M = Y.length();
        if (N < M) {
            return 0;
        }
        RollingHash hx = new RollingHash(X);
        RollingHash hy = new RollingHash(Y);
        int[] hY = new int[M + 1];
        for (int i = 0; i < M; i++) {
            hY[i + 1] = hy.get(0, i + 1);
        }
        int res = 0;
        int cur = 0;
        for (int i = 0; i < N; i++) {
            int v = X.charAt(i) - '0';
            res += cur * v * pow10(N - (i + 1)) % MOD;
            for (int j = i - M + 1; j <= i;
