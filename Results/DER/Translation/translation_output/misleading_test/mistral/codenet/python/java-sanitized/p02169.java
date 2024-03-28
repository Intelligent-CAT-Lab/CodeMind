import java.util.*;

public class p02169 {
    static int mod = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] LI = new int[3];
        for (int i = 0; i < 3; i++) {
            LI[i] = sc.nextInt();
        }
        int m = LI[0];
        int n = LI[1];
        int k = LI[2];
        if (n < k) {
            System.out.println(0);
            return;
        }
        if (m < k) {
            System.out.println(0);
            return;
        }
        long ans = Math.pow(m, n, mod);
        long[] p = new long[k + 1];
        for (int i = 0; i <= k; i++) {
            p[i] = Math.pow(i, n, mod);
        }
        long c = m;
        long[][] comb = new long[k + 1][];
        for (int i = 0; i <= k; i++) {
            comb[i] = new long[i + 1];
            comb[i][0] = 1;
        }
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= i; j++) {
                comb[i + 1][j] += comb[i][j];
                comb[i + 1][j + 1] += comb[i][j];
            }
        }
        for (int i = 1; i <= k; i++) {
            long k = 0;
            for (int j = 1; j <= i; j++) {
                if ((i + j) & 1 == 1) {
                    k -= comb[i][j] * p[j];
                } else {
                    k += comb[i][j] * p[j];
                }
            }
            k *= c;
            c *= (m - i);
            c *= Math.pow(i + 1, mod - 2, mod);
            c %= mod;
            ans -= k;
            ans %= mod;
        }
        System.out.println(ans);
    }
}