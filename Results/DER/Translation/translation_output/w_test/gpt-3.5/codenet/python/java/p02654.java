```java
import java.util.Scanner;

public class Main {
    static long[] prepare(int n, int MOD) {
        long[] factorials = new long[n + 1];
        factorials[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorials[i] = (factorials[i - 1] * i) % MOD;
        }

        long[] finvs = new long[n + 1];
        finvs[n] = pow(factorials[n], MOD - 2, MOD);
        for (int i = n; i > 1; i--) {
            finvs[i - 1] = (finvs[i] * i) % MOD;
        }

        return finvs;
    }

    static long[] inverseFactorials(int n, long[] factorials, long[] finvs, int MOD) {
        long[] invs = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            invs[i] = (factorials[i - 1] * finvs[i]) % MOD;
        }

        return invs;
    }

    static long pow(long x, long y, int MOD) {
        long result = 1;
        x = x % MOD;
        while (y > 0) {
            if (y % 2 == 1) {
                result = (result * x) % MOD;
            }
            y = y >> 1;
            x = (x * x) % MOD;
        }
        return result;
    }

    static long solve(int n, int a) {
        int MOD = 1000000007;
        long[] finvs = prepare(n, MOD);
        long[] factorials = new long[n + 1];
        factorials[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorials[i] = (factorials[i - 1] * i) % MOD;
        }
        long[] invs = inverseFactorials(n, factorials, finvs, MOD);

        int r = n - a;
        long ans = 0;

        for (int l = 0; l < a; l++) {
            long tmp1 = (factorials[a] * finvs[l] % MOD) * finvs[a - l] % MOD;
            long tmp2 = (factorials[n - l - 1] * (a - l)) % MOD;
            ans = (ans + ((long) Math.pow(-1, l & 1) * tmp1 * tmp2) % MOD) % MOD;
        }

        for (int k = 1; k < a; k++) {
            for (int l = 0; l < k; l++) {
                long tmp1 = (factorials[k] * finvs[l] % MOD) * finvs[k - l] % MOD;
                long tmp2 = (factorials[n - l - 1] * (k - l) % MOD * invs[r + k - l]) % MOD;
                ans = (ans + ((long) Math.pow(-1, l & 1) * tmp1 * tmp2) % MOD) % MOD;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        System.out.println(solve(n, a));
    }
}
```
```
