```java
import java.util.Scanner;

public class Combination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int MOD = 1000000007;

        for (int i = 1; i <= K; i++) {
            if (i > K || i > N - K + 1) {
                System.out.println(0);
            } else {
                long ans = binomialCoefficient(N - K + 1, i, MOD) * between(N, K, i) % MOD;
                ans %= MOD;
                System.out.println(ans);
            }
        }
    }

    private static long between(int n, int k, int i) {
        if (i == 1) {
            return 1;
        }
        return binomialCoefficient(k - 1, i - 1, 1000000007);
    }

    private static long binomialCoefficient(int n, int r, int mod) {
        r = Math.min(r, n - r);
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i) % mod;
            res = res * powMod(i + 1, mod - 2, mod) % mod;
        }
        return res;
    }

    private static long powMod(long a, long b, long mod) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = result * a % mod;
            }
            a = a * a % mod;
            b /= 2;
        }
        return result;
    }
}
```
```
