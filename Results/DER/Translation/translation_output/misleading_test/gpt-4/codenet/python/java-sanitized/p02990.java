import java.util.Scanner;

public class p02990 {

    private static final long MOD = 1000000007L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        for (int i = 1; i <= K; i++) {
            if (i > K || i > N - K + 1) {
                System.out.println(0);
            } else {
                long ans = comb(N - K + 1, i, MOD) * between(N, K, i);
                ans %= MOD;
                System.out.println(ans);
            }
        }
        
        sc.close();
    }

    private static long between(int n, int k, int i) {
        if (i == 1) {
            return 1;
        }
        return comb(k - 1, i - 1, MOD);
    }

    private static long comb(int n, int r, long mod) {
        r = Math.min(r, n - r);
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i) % mod * inverse(i + 1, mod) % mod;
        }
        return res;
    }

    private static long inverse(long a, long mod) {
        return pow(a, mod - 2, mod);
    }

    private static long pow(long a, long b, long mod) {
        long res = 1;
        a %= mod;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return res;
    }
}