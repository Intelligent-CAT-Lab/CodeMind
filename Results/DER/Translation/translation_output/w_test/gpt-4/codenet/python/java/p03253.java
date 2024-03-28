Below is the translated Java code for the given Python script:

```java
import java.util.*;
import java.math.BigInteger;

public class Main {
    private static final int MAX = 200001;
    private static final int MOD = 1000000007;
    private static long[] fact = new long[MAX];
    private static long[] inv = new long[MAX];
    private static long[] invfact = new long[MAX];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        combBuild(MAX);
        long ans = 1;
        for (int e : primeFactor(m).values()) {
            ans = (ans * nCk(e + n - 1, e)) % MOD;
        }
        System.out.println(ans % MOD);
        scanner.close();
    }

    public static void combBuild(int n) {
        fact[0] = inv[0] = invfact[0] = 1;
        fact[1] = inv[1] = invfact[1] = 1;
        for (int i = 2; i < n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            inv[i] = modPow(i, MOD - 2); // Calculate Modular Multiplicative Inverse
            invfact[i] = invfact[i - 1] * inv[i] % MOD;
        }
    }

    public static long nCk(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return (((fact[n] * invfact[k]) % MOD) * invfact[n - k]) % MOD;
    }

    public static long modPow(long base, long exponent) {
        // Fast modular exponentiation
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exponent /= 2;
        }
        return result;
    }

    public static Map<Integer, Integer> primeFactor(int n) {
        Map<Integer, Integer> ret = new HashMap<>();
        for (int i = 2; i <= Math.sqrt(n) + 10; i++) {
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
```

This Java code includes all the functionality of the original Python code, such as modPow function for modular exponentiation (used to substitute for Python's pow(base, exp, mod)), and utilizes Java's `HashMap` to simulate the Python `defaultdict(int)` behavior.
