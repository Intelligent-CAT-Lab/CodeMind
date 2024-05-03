Here is the Java version of the provided Python code:

```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static final int MAX = 2000001;
    static final int MOD = 1000000007;
    static long[] fact = new long[MAX];
    static long[] inv = new long[MAX];
    static long[] invfact = new long[MAX];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        combBuild(MAX);
        long ans = 1;
        for (Map.Entry<Integer, Integer> entry : primeFactor(m).entrySet()) {
            ans *= nCk(entry.getValue() + n - 1, entry.getValue()) % MOD;
            ans %= MOD;
        }
        System.out.println(ans % MOD);
    }

    static void combBuild(int n) {
        fact[0] = inv[0] = invfact[0] = 1;
        fact[1] = inv[1] = invfact[1] = 1;
        for (int i = 2; i < n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            inv[i] = inv[MOD % i] * (MOD - MOD / i) % MOD;
            invfact[i] = invfact[i - 1] * inv[i] % MOD;
        }
    }

    static long nCk(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return (((fact[n] * invfact[k]) % MOD) * invfact[n - k]) % MOD;
    }

    static Map<Integer, Integer> primeFactor(int n) {
        Map<Integer, Integer> ret = new HashMap<>();
        for (int i = 2; i <= Math.sqrt(
