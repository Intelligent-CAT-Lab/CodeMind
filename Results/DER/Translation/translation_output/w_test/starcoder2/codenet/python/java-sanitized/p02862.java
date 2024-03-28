import java.util.*;

public class p02862 {
    static long MOD = 1000000007;
    static long[] fact = new long[1000001];
    static long[] inv = new long[1000001];
    static long[] finv = new long[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if ((x + y) % 3 != 0 || 3 * x < x + y || 3 * y < x + y) {
            System.out.println(0);
            return;
        }
        int n = (x + y) / 3;
        x -= n;
        y -= n;
        fact[0] = 1;
        fact[1] = 1;
        inv[1] = 1;
        finv[0] = 1;
        finv[1] = 1;
        for (int i = 2; i <= n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
        long ans = fact[n] * finv[x] % MOD * finv[y] % MOD;
        System.out.println(ans);
    }
}