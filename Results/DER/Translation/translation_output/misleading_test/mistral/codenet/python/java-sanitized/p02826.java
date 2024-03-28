import java.util.*;

public class p02826 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int MOD = sc.nextInt();
        int[] fact = new int[N + 1];
        int[] fact_inv = new int[N + 1];
        Arrays.fill(fact, 1);
        Arrays.fill(fact_inv, 1);
        for (int i = 2; i <= N; i++) {
            fact[i] = fact[i - 1] * i;
            fact_inv[i] = fact_inv[i - 1] * (MOD - 2) % MOD;
        }
        int inv = fact_inv[1];
        for (int i = 2; i <= N; i++) {
            inv = (inv * fact_inv[i - 1]) % MOD;
        }
        int[] f = new int[N + 1];
        int[] g = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            f[i] = (i + 1) % MOD;
            g[i] = 1;
        }
        for (int i = 2; i <= N; i++) {
            g[i] = (g[i - 1] << 1) % MOD;
            g[i] -= f[i - 1] * g[i - 1] % MOD;
            g[i] %= MOD;
        }
        int[] h = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            h[i] = (i + 1) % MOD;
        }
        int[] dh = new int[N + 1];
        Arrays.fill(dh, 0);
        for (int i = 1; i <= N; i++) {
            dh[i] = (dh[i - 1] << 1) % MOD;
            dh