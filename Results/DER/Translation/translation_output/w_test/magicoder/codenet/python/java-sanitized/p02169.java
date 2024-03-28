import java.util.*;
import java.math.*;

public class p02169 {
    static final int mod = 998244353;
    static int m, n, k;
    static long[] p, comb;

    static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res = res * a % mod;
            }
            a = a * a % mod;
            b >>= 1;
        }
        return res;
    }

    static void solve() {
        if (n < k || m < k) {
            System.out.println(0);
            return;
        }
        long ans = pow(m, n);
        p = new long[k + 1];
        for (int i = 0; i <= k; i++) {
            p[i] = pow(i, n);
        }
        long c = m;
        comb = new long[k + 1];
        comb[0] = 1;
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < i; j++) {
                comb[i] += comb[j];
                if (comb[i] >= mod) {
                    comb[i] -= mod;
                }
            }
        }
        for (int i = 1; i < k; i++) {
            long k = 0;
            for (int j = i; j > 0; j--) {
                if ((i + j) % 2 != 0) {
                    k -= comb[i] * p[j];
                } else {
                    k += comb[i] * p[j];
                }
                if (k < 0) {
                    k += mod;
                }
            }
            k *= c;
            if (k >= mod) {
                k %= mod;
            }
            c *= (m - i);
            if (c >= mod) {
                c %= mod;
            }
            c *= pow(i + 1, mod - 2);
            if (c >= mod) {
                c %= mod;
            }
            ans -= k;
            if (ans < 0) {
                ans += mod;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        k = sc.nextInt();
        solve();
    }
}