import java.util.*;

public class p02685 {
    final static int mod = 998244353;
    final static int MAX_N = 1000000;

    static int fact[] = new int[MAX_N + 1];
    static int fact_inv[] = new int[MAX_N + 4];

    static {
        Arrays.fill(fact, 1);
        Arrays.fill(fact_inv, 0);
        for (int i = 2; i <= MAX_N; i++) {
            fact[i] = fact[i - 1] * i % mod;
            fact_inv[i] = fact_inv[i - 1] * i % mod;
        }
        fact_inv[MAX_N] = pow(fact[MAX_N], mod - 2, mod);
        for (int i = MAX_N - 1; i >= 1; i--) {
            fact_inv[i] = fact_inv[i + 1] * (i + 1) % mod;
        }
    }

    public static int mod_comb_k(int n, int k, int mod) {
        return fact[n] * fact_inv[k] % mod * fact_inv[n - k] % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, k;
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        int ans = 0;
        for (int x = 0; x <= k; x++) {
            ans += m * pow(m - 1, n - 1 - x, mod) * mod_comb_k(n - 1, x, mod);
            ans %= mod;
        }
        if (ans < 0) {
            ans += mod;
        }
        System.out.println(ans);
    }
}