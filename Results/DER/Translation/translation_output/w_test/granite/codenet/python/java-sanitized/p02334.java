import java.util.*;

public class p02334 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long MOD = (long)Math.pow(10, 9) + 7;

        long p = 1;
        long q = 1;
        for (int i = 0; i < N; i++) {
            p = (p * (N+K-1-i)) % MOD;
            q = (q * (i+1)) % MOD;
        }

        System.out.println((p * pow(q, MOD-2, MOD)) % MOD);
    }

    public static long pow(long x, long n, long mod) {
        long res = 1;
        x %= mod;
        while (n > 0) {
            if (n % 2 == 1) {
                res = (res * x) % mod;
            }
            x = (x * x) % mod;
            n /= 2;
        }
        return res;
    }
}