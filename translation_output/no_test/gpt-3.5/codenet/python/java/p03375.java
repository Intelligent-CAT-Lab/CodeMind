```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int MOD = sc.nextInt();
        
        long[][] B = new long[N+1][N+1];
        
        B[0][0] = 1;
        for (int n = 1; n <= N; n++) {
            B[n][1] = B[n-1][0];
            for (int l = 1; l <= N; l++) {
                B[n][l] = (B[n-1][l-1] + B[n-1][l] * l) % MOD;
            }
        }
        
        long[][] pow_2 = new long[N+1][N+1];
        for (int n = 1; n <= N; n++) {
            pow_2[1][n] = 2 * pow_2[1][n-1] % MOD;
        }
        for (int n = 2; n <= N; n++) {
            for (int m = 1; m <= N; m++) {
                pow_2[n][m] = pow_2[n-1][m] * pow_2[1][m] % MOD;
            }
        }
        
        long[] pow_pow = new long[N+1];
        pow_pow[0] = 2;
        for (int n = 1; n <= N; n++) {
            pow_pow[n] = (pow_pow[n-1] * pow_pow[n-1]) % MOD;
        }
        
        long[] A = new long[N+1];
        for (int n = 1; n <= N; n++) {
            A[n] = B[n][1] * (pow_2[N-n][1] + pow_2[N-n][0] * n % MOD) % MOD;
        }
        
        long[] fact = new long[N+1];
        long[] fact_inv = new long[N+1];
        fact[0] = 1;
        fact_inv[N] = pow(fact[N], MOD-2, MOD);
        for (int n = N-1; n >= 0; n--) {
            fact[n] = fact[n+1] * (n+1) % MOD;
            fact_inv[n] = fact_inv[n+1] * (n+1) % MOD;
        }
        
        long[] comb = new long[N+1];
        for (int n = 0; n <= N; n++) {
            comb[n] = fact_inv[n] * fact_inv[N-n] % MOD * fact[N] % MOD;
        }

        for (int n = 0; n <= N; n += 2) {
            A[n] *= -1;
        }
        
        long ans = pow(2, pow(2, N, MOD-1), MOD) - sum(A) % MOD;
        ans %= MOD;
        
        System.out.println(ans);
        
        sc.close();
    }

    public static long pow(long a, long b, long mod) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return result;
    }

    public static long sum(long[] arr) {
        long sum = 0;
        for (long num : arr) {
            sum += num;
        }
        return sum;
    }
}
```
