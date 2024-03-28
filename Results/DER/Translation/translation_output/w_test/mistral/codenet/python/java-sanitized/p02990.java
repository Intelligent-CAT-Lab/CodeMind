import java.util.*;

public class p02990 {
    static int N, K;
    static long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        long ans = 0;
        for (int i = 1; i <= K; i++) {
            if (i > K || i > N - K + 1) {
                ans = 0;
                break;
            }
            ans = (comb(N - K + 1, i) * between(N, K, i)) % MOD;
        }

        System.out.println(ans);
    }

    static long comb(int n, int r, long mod) {
        r = Math.min(r, n - r);
        long res = 1;
        for (int i = 1; i <= r; i++) {
            res = res * (n - i) * pow(i, mod - 2, mod);
        }
        return res;
    }

    static long between(int n, int k, int i) {
        if (i == 1) {
            return 1;
        }
        return comb(k - 1, i - 1, MOD);
    }

    static long pow(int x, int y, long mod) {
        long res = 1;
        while (y != 0) {
            if (y % 2 == 1) {
                res = res * x % mod;
            }
            y = y >> 1;
            x = x * x % mod;
        }
        return res;
    }
}