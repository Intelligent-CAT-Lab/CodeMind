import java.util.*;

public class p03253 {
    static int MAX = 200001;
    static int MOD = 100000007;
    static long[] fact = new long[MAX];
    static long[] inv = new long[MAX];
    static long[] invfact = new long[MAX];

    public static void comb_build(int n) {
        fact[0] = inv[0] = invfact[0] = 1;
        fact[1] = inv[1] = invfact[1] = 1;
        for (int i = 2; i < n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            inv[i] = inv[MOD % i] * (MOD - MOD / i) % MOD;
            invfact[i] = invfact[i - 1] * inv[i] % MOD;
        }
    }

    public static long nCk(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return (((fact[n] * invfact[k]) % MOD) * invfact[n - k]) % MOD;
    }

    public static Map<Integer, Integer> prime_factor(int n) {
        Map<Integer, Integer> ret = new HashMap<>();
        for (int i = 2; i < Math.sqrt(n) + 10; i++) {
            while (n % i == 0) {
                ret.put(i, ret.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        if (n!= 1) {
            ret.put(n, ret.getOrDefault(n, 0) + 1);
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        comb_build(MAX);
        long ans = 1;
        Map<Integer, Integer> prime_factors = prime_factor(m);
        for (Map.Entry<Integer, Integer> entry : prime_factors.entrySet()) {
            int e = entry.getValue();
            ans *= nCk(e + n - 1, e) % MOD;
            ans %= MOD;
        }
        System.out.println(ans);
    }
}