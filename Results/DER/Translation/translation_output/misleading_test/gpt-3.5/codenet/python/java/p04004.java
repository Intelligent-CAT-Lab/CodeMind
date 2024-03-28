```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        
        int MOD = (int) (Math.pow(10, 9) + 7);

        int L = Math.max(N, M);
        int Lsq = (int) (Math.sqrt(L) + 1);

        long[] arr = new long[Lsq * Lsq];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        for (int n = 1; n < Lsq; n++) {
            for (int i = 0; i < Lsq; i++) {
                arr[Lsq * i + n] = (arr[Lsq * i + n - 1] * arr[Lsq * i + n]) % MOD;
            }
        }

        for (int n = 1; n < Lsq; n++) {
            for (int i = 0; i < Lsq; i++) {
                arr[n * Lsq + i] = (arr[(n - 1) * Lsq + i] * arr[n * Lsq + i]) % MOD;
            }
        }

        long[] fact = new long[L + 1];
        fact[0] = 1;
        for (int i = 1; i <= L; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        long[] factInv = new long[L + 1];
        factInv[L] = pow(fact[L], MOD - 2, MOD);
        for (int i = L - 1; i >= 0; i--) {
            factInv[i] = (factInv[i + 1] * (i + 1)) % MOD;
        }

        long[] x = new long[N + M];
        Arrays.fill(x, 0);
        for (int i = 1; i < N + M; i++) {
            x[i] = (MOD - 1) * power2(i, MOD, arr) % MOD * powerInverse(3, K + 1, N + M + K, MOD, arr) % MOD;
            x[i] = (x[i] * fact[K + 1] % MOD * factInv[K] % MOD * factInv[1] % MOD) % MOD;
            x[i] %= MOD;
        }

        x[0] = 3 * (1 - powerInverse(3, K + 1, MOD, MOD, arr)) % MOD * powerInverse(2, 1, MOD, MOD, arr) % MOD;

        cumsum(x, MOD);

        x = multiply(x, power(3, N + M, MOD), powerInverse(2, N + M, MOD, MOD, arr), MOD);

        long[] coef = new long[M + 1];
        for (int i = 0; i <= M; i++) {
            coef[i] = (fact[N - 1] * factInv[M - i] % MOD * factInv[N - 1] % MOD) % MOD;
            coef[i] = (coef[i] * power(3, K + i, MOD) % MOD) % MOD;
        }

        long answer = 0;
        for (int i = 0; i <= M; i++) {
            answer += (coef[i] * x[N - 1 + i] % MOD) % MOD;
            answer %= MOD;
        }

        System.out.println(answer);
    }

    public static long pow(long base, long exp, int MOD) {
        long result = 1;
        base %= MOD;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % MOD;
            }
            exp >>= 1;
            base = (base * base) % MOD;
        }
        return result;
    }

    public static long powerInverse(int base, int exp, int MOD, int u, long[] arr) {
        int B = Integer.toBinaryString(u).length();
        long[] x = new long[1 + (1 << B)];
        x[0] = 1;
        x[1] = base;
        for (int i = 0; i < B; i++) {
            for (int j = 1 << i; j < 1 << (i + 1); j++) {
                x[j] = (x[j - (1 << i)] * (base * x[(1 << i) - 1] % MOD)) % MOD;
            }
        }
        return x[exp];
    }

    public static void cumsum(long[] arr, int MOD) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = (arr[i] + arr[i - 1]) % MOD;
        }
    }

    public static long[] multiply(long[] arr1, long[] arr2, long[] arr3, int MOD) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (arr1[i] * arr2[i] % MOD * arr3[i] % MOD) % MOD;
        }
        return arr1;
    }

    public static long[] power(int base, int exp, int MOD) {
        int B = Integer.toBinaryString(exp).length();
        long[] x = new long[1 + (1 << B)];
        x[0] = 1;
        x[1] = base;
        for (int i = 0; i < B; i++) {
            for (int j = 1 << i; j < 1 << (i + 1); j++) {
                x[j] = (x[j - (1 << i)] * (base * x[(1 << i) - 1] % MOD)) % MOD;
            }
        }
        return Arrays.copyOf(x, exp + 1);
    }
}
```
```
