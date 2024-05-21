import java.util.*;

public class p02685 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int mod = 998244353;
        long ans = 0;

        int MAX_N = 1000000;
        long[] fact = new long[MAX_N+4];
        long[] fact_inv = new long[MAX_N+4];
        fact[0] = 1;
        for (int i = 1; i <= MAX_N+3; i++) {
            fact[i] = fact[i-1] * i % mod;
        }
        fact_inv[MAX_N+3] = pow(fact[MAX_N+3], mod-2, mod);
        for (int i = MAX_N+2; i >= 0; i--) {
            fact_inv[i] = fact_inv[i+1] * (i+1) % mod;
        }

        for (int x = 0; x <= k; x++) {
            ans += m * pow(m-1, n-1-x, mod) * mod_comb_k(n-1, x, mod);
            ans %= mod;
        }
        if (ans < 0) {
            ans += mod;
        }
        System.out.println(ans);
    }

    public static long pow(long a, long n, int mod) {
        long res = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            n /= 2;
        }
        return res;
    }

    public static long mod_comb_k(int n, int k, int mod) {
        return fact[n] * fact_inv[k] % mod * fact_inv[n-k] %mod;
    }
}