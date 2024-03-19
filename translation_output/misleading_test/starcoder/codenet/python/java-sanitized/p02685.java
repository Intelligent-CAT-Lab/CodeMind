import java.util.*;
import java.math.*;

public class p02685 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int mod = 998244353;
        int ans = 0;
        int[] fact = new int[1000005];
        int[] fact_inv = new int[1000005];
        fact[0] = 1;
        for (int i = 1; i <= 1000000; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
        }
        fact_inv[1000000] = pow(fact[1000000], mod - 2, mod);
        for (int i = 1000000; i >= 0; i--) {
            fact_inv[i] = (fact_inv[i + 1] * (i + 1)) % mod;
        }
        for (int x = 0; x <= k; x++) {
            ans += m * pow(m - 1, n - 1 - x, mod) * mod_comb_k(n - 1, x, mod);
            ans %= mod;
        }
        if (ans < 0) ans += mod;
        System.out.println(ans);
    }

    public static int pow(int a, int b, int mod) {
        int ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) ans = (ans * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return ans;
    }

    public static int mod_comb_k(int n, int k, int mod) {
        return (fact[n] * fact_inv[k] % mod * fact_inv[n - k] % mod);
    }
}