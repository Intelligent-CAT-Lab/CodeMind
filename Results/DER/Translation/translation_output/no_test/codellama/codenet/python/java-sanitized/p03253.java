import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class p03253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int MAX = 2 * 100000 + 1;
        int MOD = 1000000007;
        long[] fact = new long[MAX];
        long[] inv = new long[MAX];
        long[] invfact = new long[MAX];

        combBuild(n);

        long ans = 1;
        for (Map.Entry<Integer, Integer> entry : primeFactor(m).entrySet()) {
            ans *= nCk(entry.getKey() + n - 1, entry.getKey()) % MOD;
        }

        System.out.println(ans % MOD);
    }

    private static void combBuild(int n) {
        fact[0] = inv[0] = invfact[0] = 1;
        fact[1] = inv[1] = invfact[1] = 1;
        for (int i = 2; i < n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            inv[i] = inv[MOD % i] * (MOD - MOD / i) % MOD;
            invfact[i] = invfact[i - 1] * inv[i] % MOD;
        }
    }

    private static long nCk(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return (((fact[n] * invfact[k]) % MOD) * invfact[n - k]) % MOD;
    }

    private static Map<Integer, Integer> primeFactor(int n) {
        Map<Integer, Integer> ret = new HashMap<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                ret.put(i, ret.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        return ret;
    }
}