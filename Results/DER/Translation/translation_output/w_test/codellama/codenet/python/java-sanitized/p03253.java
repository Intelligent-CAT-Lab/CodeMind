import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class p03253 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int MAX = 2 * 100000 + 1;
        int MOD = 1000000007;
        int[] fact = new int[MAX];
        int[] inv = new int[MAX];
        int[] invfact = new int[MAX];

        comb_build(n);

        int ans = 1;
        for (int e : prime_factor(m).values()) {
            ans *= nCk(e + n - 1, e) % MOD;
        }

        System.out.println(ans % MOD);
    }

    public static void comb_build(int n) {
        fact[0] = inv[0] = invfact[0] = 1;
        fact[1] = inv[1] = invfact[1] = 1;
        for (int i = 2; i < n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            inv[i] = inv[MOD % i] * (MOD - MOD / i) % MOD;
            invfact[i] = invfact[i - 1] * inv[i] % MOD;
        }
    }

    public static int nCk(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return (((fact[n] * invfact[k]) % MOD) * invfact[n - k]) % MOD;
    }

    public static Map<Integer, Integer> prime_factor(int n) {
        Map<Integer, Integer> ret = new HashMap<>();
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            while (n % i == 0) {
                ret.put(i, ret.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        if (n != 1) {
            ret.put(n, 1);
        }
        return ret;
    }
}