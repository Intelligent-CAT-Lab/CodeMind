import java.util.*;
import java.io.*;
import java.math.*;

public class p04004 {
    static int MOD = 1000000007;
    static int U = 1000000;
    static long[] power2;
    static long[] power2_inv;
    static long[] power3;
    static long[] power3_inv;
    static long[] fact;
    static long[] fact_inv;

    static long[] cumprod(long[] arr, int MOD) {
        int L = arr.length;
        int Lsq = (int) Math.sqrt(L) + 1;
        long[][] arr2 = new long[Lsq][Lsq];
        for (int i = 0; i < L; i++) {
            arr2[i / Lsq][i % Lsq] = arr[i];
        }
        for (int i = 1; i < Lsq; i++) {
            for (int j = 0; j < Lsq; j++) {
                arr2[i][j] = (arr2[i][j] * arr2[i - 1][j]) % MOD;
            }
        }
        for (int i = 1; i < Lsq; i++) {
            for (int j = 0; j < Lsq; j++) {
                arr2[j][i] = (arr2[j][i] * arr2[j][i - 1]) % MOD;
            }
        }
        long[] arr3 = new long[L];
        for (int i = 0; i < L; i++) {
            arr3[i] = arr2[i / Lsq][i % Lsq];
        }
        return arr3;
    }

    static void make_fact(int U, int MOD) {
        long[] x = new long[U];
        x[0] = 1;
        for (int i = 1; i < U; i++) {
            x[i] = i;
        }
        fact = cumprod(x, MOD);
        x = new long[U];
        x[0] = pow(fact[U - 1], MOD - 2, MOD);
        for (int i = 1; i < U; i++) {
            x[i] = U - i;
        }
        fact_inv = cumprod(x, MOD);
        for (int i = 0; i < U; i++) {
            fact_inv[i] = fact_inv[U - i - 1];
        }
    }

    static void make_power(int a, int L, int MOD) {
        int B = (int) (Math.log(L) / Math.log(2)) + 1;
        long[] x = new long[1 << B];
        x[0] = 1;
        x[1] = a;
        for (int i = 1; i < B; i++) {
            for (int j = 0; j < (1 << i); j++) {
                x[1 << i | j] = x[j] * (a * x[(1 << i) - 1] % MOD) % MOD;
            }
        }
        power2 = Arrays.copyOfRange(x, 0, L);
        power2_inv = Arrays.copyOfRange(x, 0, L);
        for (int i = 0; i < L; i++) {
            power2_inv[i] = pow(power2_inv[i], MOD - 2, MOD);
        }
        power3 = Arrays.copyOfRange(x, 0, L);
        power3_inv = Arrays.copyOfRange(x, 0, L);
        for (int i = 0; i < L; i++) {
            power3_inv[i] = pow(power3_inv[i], MOD - 2, MOD);
        }
    }

    static long pow(long a, long b, long MOD) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                ans = ans * a % MOD;
            }
            a = a * a % MOD;
            b >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        make_fact(U, MOD);
        make_power(2, U, MOD);
        make_power(3, U, MOD);
        long[] x = new long[N + M];
        for (int i = 1; i < N + M; i++) {
            x[i] = (-1) * power2[i - 1] * power3_inv[K + i] % MOD;
            x[i] = x[i] * fact[K + i] % MOD * fact_inv[K] % MOD * fact_inv[i] % MOD;
            x[i] %= MOD;
        }
        x[0] = 3 * (1 - power3_inv[K + 1]) % MOD * power2_inv[1] % MOD;
        for (int i = 1; i < N + M; i++) {
            x[i] += x[i - 1];
            x[i] %= MOD;
        }
        for (int i =