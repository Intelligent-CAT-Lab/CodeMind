import java.util.*;
import java.io.*;

public class p02169 {
    static final int mod = 998244353;
    static int m, n, k;
    static long[] p, comb;

    static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            b >>= 1;
        }
        return res;
    }

    static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
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
            for (int j = i; j >= 1; j--) {
                comb[j] += comb[j - 1];
            }
        }
        for (int i = 1; i < k; i++) {
            long k = 0;
            for (int j = i; j >= 1; j--) {
                if ((i + j) % 2 == 1) {
                    k -= comb[j] * p[j];
                } else {
                    k += comb[j] * p[j];
                }
            }
            k *= c;
            c *= (m - i);
            c *= pow(i + 1, mod - 2);
            c %= mod;
            ans += mod;
            ans -= k;
            ans %= mod;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) throws IOException {
        solve();
    }
}