import java.util.*;

public class p02169 {
    static final int mod = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        solve(m, n, k);
    }

    static void solve(int m, int n, int k) {
        if (n < k) {
            System.out.println(0);
            return;
        }
        if (m < k) {
            System.out.println(0);
            return;
        }
        long ans = pow(m, n, mod);
        long[] p = new long[k + 1];
        for (int i = 1; i <= k; i++) {
            p[i] = pow(i, n, mod);
        }
        long c = m;
        long[][] comb = new long[k + 1][k + 1];
        comb[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= i; j++) {
                comb[i][j] = (comb[i - 1][j] + comb[i - 1][j - 1]) % mod;
            }
        }
        for (int i = 1; i <= k; i++) {
            long kk = 0;
            for (int j = i; j >= 1; j--) {
                if ((i + j) % 2 == 1) {
                    kk -= comb[i][j] * p[j];
                } else {
                    kk += comb[i][j] * p[j];
                }
            }
            kk *= c;
            c *= (m - i);
            c *= pow(i + 1, mod - 2, mod);
            c %= mod;
            ans -= kk;