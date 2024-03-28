import java.util.*;

public class p02685 {
    static long mod = 998244353;
    static long[] fact = new long[1000004];
    static long[] fact_inv = new long[1000004];

    static void precompute() {
        fact[0] = 1;
        for (int i = 1; i < 1000004; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
        }
        fact_inv[1000003] = pow(fact[1000003], mod - 2, mod);
        for (int i = 1000002; i >= 0; i--) {
            fact_inv[i] = (fact_inv[i + 1] * (i + 1)) % mod;
        }
    }

    static long pow(long a, long b, long m) {
        a %= m;
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0)
                res = (res * a) % m;
            a = (a * a) % m;
            b >>= 1;
        }
        return res;
    }

    static long mod_comb_k(int n, int k) {
        return (fact[n] * fact_inv[k] % mod * fact_inv[n - k] % mod);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        precompute();
        long ans = 0;
        for (int x = 0; x <= k; x++) {
            ans += m * pow(m - 1, n - 1 - x, mod) * mod_comb_k(n - 1, x);
            ans %= mod;
        }
        if (ans < 0)
            ans += mod;
        System.out.println(ans);
    }
}