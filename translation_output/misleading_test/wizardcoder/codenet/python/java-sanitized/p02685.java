import java.util.*;
import java.math.*;

public class p02685 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int mod = 998244353;
        int ans = 0;

        //-------------------------------------------------------------------
        int MAX_N = 1000000;

        long[] fact = new long[MAX_N+4];
        long[] fact_inv = new long[MAX_N+4];
        fact[0] = 1;
        for (int i = 1; i <= MAX_N; i++) {
            fact[i] = (fact[i-1] * i) % mod;
        }
        fact_inv[MAX_N] = pow(fact[MAX_N], mod-2, mod);
        for (int i = MAX_N-1; i >= 0; i--) {
            fact_inv[i] = (fact_inv[i+1] * (i+1)) % mod;
        }

        long mod_comb_k(int n, int k, int mod) {
            return (fact[n] * fact_inv[k] % mod * fact_inv[n-k] % mod);
        }
        //-------------------------------------------------------------------

        for (int x = 0; x <= k; x++) {
            ans = (ans + m * pow(m-1, n-1-x, mod) * mod_comb_k(n-1, x, mod)) % mod;
        }
        if (ans < 0) {
            ans += mod;
        }
        System.out.println(ans);
    }

    public static long pow(long a, long b, long mod) {
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