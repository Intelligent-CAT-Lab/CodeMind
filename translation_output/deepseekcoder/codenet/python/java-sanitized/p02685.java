import java.util.Scanner;

public class p02685 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        long mod = 998244353;
        long ans = 0;

        //-------------------------------------------------------------------
        int MAX_N = (int) Math.pow(10, 6);

        long[] fact = new long[MAX_N + 4];
        long[] fact_inv = new long[MAX_N + 4];
        fact[0] = 1;
        for (int i = 1; i <= MAX_N + 3; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
        }

        fact_inv[MAX_N + 3] = pow(fact[(int) MAX_N + 3], (int) (mod - 2), (int) mod);
        for (int i = MAX_N + 2; i >=0; i--) {
            fact_inv[i] = (fact_inv[i + 1] * (i + 1)) % mod;
        }

        //-------------------------------------------------------------------

        for (int x = 0; x <= k; x++) {
            ans += m * pow(m - 1, n - 1 - x, (int) mod) * mod_comb_k(n - 1, x, (int) mod);
            ans %= mod;
        }
        if (ans < 0) {
            ans += mod;
        }
        System.out.println(ans);
    }

    public static long pow(long a, long b, long m) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                ans = (ans * a) % m;
            }
            a = (a * a) % m;
            b >>= 1;
        }
        return ans;
    }

    public static long mod_comb_k(int n, int k, int mod) {
        return fact[n] * fact_inv[k] % mod * fact_inv[n - k] % mod;
    }
}