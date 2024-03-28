```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int MOD = 1000000007;

        long[] cumprod(long[] arr, int MOD) {
            int L = arr.length;
            int Lsq = (int) Math.sqrt(L) + 1;

            long[] temp = new long[Lsq*Lsq];
            Arrays.fill(temp, 1);

            for (int n = 1; n < Lsq; n++) {
                for (int i = 0; i < Lsq; i++) {
                    temp[i*Lsq+n] = temp[i*Lsq+n-1] * arr[i*Lsq+n];
                    temp[i*Lsq+n] %= MOD;
                }
            }

            for (int n = 1; n < Lsq; n++) {
                for (int i = 0; i < Lsq; i++) {
                    temp[n*Lsq+i] = temp[(n-1)*L+i] * temp[(n-1)*L+L-1];
                    temp[n*Lsq+i] %= MOD;
                }
            }

            return Arrays.copyOf(temp, L);
        }

        long[] makeFact(int U, int MOD) {
            long[] x = new long[U];
            x[0] = 1;
            for (int i = 1; i < U; i++) {
                x[i] = x[i-1] * i % MOD;
            }

            long[] fact = cumprod(x, MOD);

            x[0] = pow(fact[U-1], MOD-2, MOD);
            long[] fact_inv = cumprod(x, MOD);

            return fact;
        }

        long[] makePower(int a, int L, int MOD) {
            int B = Integer.toBinaryString(L).length();
            long[] x = new long[1 + (1<<B)];
            x[0] = 1;
            x[1] = a;

            for (int n = 0; n < B; n++) {
                for (int i = (1<<n); i < (1<<(n+1)); i++) {
                    x[i] = (x[i-(1<<n)] * (a * x[(1<<n)-1]) % MOD) % MOD;
                }
            }

            return Arrays.copyOf(x, L);
        }

        int U = 1000000;
        long[] power2 = makePower(2, U, MOD);
        long[] power2_inv = makePower(pow(2, MOD-2, MOD), U, MOD);
        long[] power3 = makePower(3, U, MOD);
        long[] power3_inv = makePower(pow(3, MOD-2, MOD), U, MOD);
        long[] fact = makeFact(U, MOD);

        long[] x = new long[N+M];
        Arrays.fill(x, 0);
        
        x[1:] = (-1) * power2[:N+M-1] * power3_inv[K+1:N+M+K] % MOD;
        x[1:] *= fact[K+1:N+M+K] * fact_inv[K] % MOD * fact_inv[1:N+M] % MOD;
        x %= MOD;
        x[0] = 3 * (1 - power3_inv[K+1]) % MOD * power2_inv[1] % MOD;
        cumsum(x);
        x %= MOD;
        x = x * power3[:N+M] * power2_inv[:N+M] % MOD; x %= MOD;

        long[] coef = fact[N-1:N+M] * fact_inv[:M+1] % MOD * fact_inv[N-1] % MOD;
        coef *= power3[K:K+M+1][::-1]; coef %= MOD;
        
        long answer = 0;
        for (int i = N-1; i < N+M; i++) {
            answer += coef[i] * x[i];
            answer %= MOD;
        }

        System.out.println(answer);
    }
}
```
Please note that the translation from Python to Java can be more complex due to differences in syntax and libraries available. Also, some Python-specific constructs may not have direct Java equivalents.
