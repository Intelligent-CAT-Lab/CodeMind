Here's the translated Java code based on the provided Python code:

```java
import java.util.Scanner;

public class Main {
    private static final int MOD = (int)1e9 + 7;
    private static final int MAX_N = 200001;
    private static long[] fac = new long[MAX_N];
    private static long[] finv = new long[MAX_N];
    private static long[] inv = new long[MAX_N];

    static {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        prepare(MAX_N, MOD);
    }

    private static void prepare(int max_n, int mod) {
        for (int i = 2; i < max_n; i++) {
            fac[i] = fac[i-1] * i % mod;
            inv[i] = mod - inv[mod % i] * (mod / i) % mod;
            finv[i] = finv[i-1] * inv[i] % mod;
        }
    }

    private static long comb(int n, int k) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long ans = 0;
        for (int i = 0; i < h - a; i++) {
            ans = (ans + comb(b - 1 + i, i) * comb(h - 1 - i + w - 1 - b, h - 1 - i)) % MOD;
        }
        System.out.println(ans);
    }
}
```

This Java code takes the dimensions of a grid (h and w), and the values a and b, to calculate a combination modulo answer, just like the Python code does. It uses a pre-processing step to calculate the factorials and inverse factorials which are used in the combination calculations. The `comb` method performs this calculation.

Please note that the usage of static initialization blocks and static arrays here is for simplicity and quick translation. Depending on the use case and context, a more object-oriented approach could be beneficial, and you may want to encapsulate the functionality in a class similar to the original Python one.
