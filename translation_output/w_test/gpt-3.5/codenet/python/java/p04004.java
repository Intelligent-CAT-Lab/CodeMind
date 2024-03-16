```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        long MOD = (long) Math.pow(10, 9) + 7;

        long[] arr = new long[N + M];
        for (int i = 0; i < N + M; i++) {
            arr[i] = scanner.nextLong();
        }

        long[] x = new long[N + M];
        long[] power2 = makePower(2, (int) 1e6, MOD);
        long[] power2Inv = makePower(modPow(2, MOD - 2, MOD), (int) 1e6, MOD);
        long[] power3 = makePower(3, (int) 1e6, MOD);
        long[] power3Inv = makePower(modPow(3, MOD - 2, MOD), (int) 1e6, MOD);
        long[] fact = makeFact((int) 1e6, MOD)[0];
        long[] factInv = makeFact((int) 1e6, MOD)[1];

        x[1] = (-1) * power2[0] * power3Inv[K] % MOD;
        x[1] *= fact[K] * factInv[K] % MOD * factInv[1] % MOD;
        x[1] %= MOD;
        x[0] = 3 * (1 - power3Inv[K]) % MOD * power2Inv[0] % MOD;
        long sum = x[0];
        for (int i = 1; i < N + M; i++) {
            x[i] = x[i - 1] + x[i];
            x[i] %= MOD;
            x[i] *= power3[i] * power2Inv[i] % MOD;
            x[i] %= MOD;
            sum += x[i];
            sum %= MOD;
        }

        long[] coef = new long[M + 1];
        for (int i = 0; i <= M; i++) {
            coef[i] = fact[N - 1] * factInv[i] % MOD * factInv[N - 1] % MOD;
            coef[i] *= power3[K + i] % MOD;
            coef[i] %= MOD;
        }

        long answer = 0;
        for (int i = 0; i <= M; i++) {
            answer += coef[i] * x[N - 1 + i];
            answer %= MOD;
        }

        System.out.println(answer);
    }

    public static long[] makePower(long a, int L, long MOD) {
        int B = (int)(Math.log(L) / Math.log(2)) + 1;
        long[] x = new long[(int)Math.pow(2, B) + 1];
        x[0] = 1;
        x[1] = a;
        for (int n = 0; n < B; n++) {
            for (int i = (int)Math.pow(2, n); i < (int)Math.pow(2, n + 1); i++) {
                x[i] = x[i - (int)Math.pow(2, n)] * (a * x[(int)Math.pow(2, n) - 1]) % MOD;
                x[i] %= MOD;
            }
        }
        return x;
    }

    public static long[][] makeFact(int U, long MOD) {
        long[] x = new long[U + 1];
        for (int i = 1; i <= U; i++) {
            x[i] = i;
        }
        long[] fact = new long[U + 1];
        long[] factInv = new long[U + 1];
        fact[0] = 1;
        for (int i = 1; i <= U; i++) {
            fact[i] = fact[i - 1] * x[i] % MOD;
        }
        factInv[U] = modPow(fact[U], MOD - 2, MOD);
        for (int i = U - 1; i >= 0; i--) {
            factInv[i] = factInv[i + 1] * x[i + 1] % MOD;
        }
        long[][] result = {fact, factInv};
        return result;
    }

    public static long modPow(long a, long b, long MOD) {
        if (b == 0) return 1;
        long res = modPow(a, b / 2, MOD);
        res = res * res % MOD;
        if (b % 2 == 1) res = res * a % MOD;
        return res;
    }
}
```
```
