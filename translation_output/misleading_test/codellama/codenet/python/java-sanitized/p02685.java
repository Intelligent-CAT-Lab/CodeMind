import java.util.Scanner;

public class p02685 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int mod = 998244353;
        int ans = 0;

        // è§£èª¬åç»ãè¦ã
        int MAX_N = 1000000;
        int[] fact = new int[MAX_N + 4];
        int[] fact_inv = new int[MAX_N + 4];
        fact[0] = 1;
        for (int i = 1; i <= MAX_N; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
        }

        fact_inv[MAX_N] = (int) Math.pow(fact[MAX_N], mod - 2, mod);
        for (int i = MAX_N - 1; i >= 0; i--) {
            fact_inv[i] = (fact_inv[i + 1] * (i + 1)) % mod;
        }

        for (int x = 0; x <= k; x++) {
            ans += (m * (int) Math.pow(m - 1, n - 1 - x, mod) * mod_comb_k(n - 1, x, mod)) % mod;
            ans = ans % mod;
        }

        if (ans < 0) {
            ans += mod;
        }

        System.out.println(ans);
    }

    public static int mod_comb_k(int n, int k, int mod) {
        return (fact[n] * fact_inv[k] % mod * fact_inv[n - k] % mod);
    }
}