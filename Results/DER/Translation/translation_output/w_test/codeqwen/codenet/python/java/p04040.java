Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    static final int MAX_N = 510000;
    static final int MOD = 1000000007;
    static int[] fac = new int[MAX_N];
    static int[] finv = new int[MAX_N];
    static int[] inv = new int[MAX_N];
    static int max = MAX_N;
    static int mod = MOD;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        maesyori();

        int ans = 0;
        for (int i = 0; i < h - a; i++) {
            ans = (ans + comb(b - 1 + i, i) * comb(h - 1 - i + w - 1 - b, h - 1 - i)) % mod;
        }
        System.out.println(ans);
    }

    static void maesyori() {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < max; i++) {
            fac[i] = (fac[i - 1] * i) % mod;
            inv[i] = mod - inv[mod % i] * (mod / i) % mod;
            finv[i] = (finv[i - 1] * inv[i]) % mod;
        }
    }

    static int comb(int n, int k) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % mod) % mod;
    }
}
```


