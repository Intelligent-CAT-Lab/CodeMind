import java.io.*;
import java.util.*;

public class p04004 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, M, K;
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        K = Integer.parseInt(input[2]);

        int MOD = (int) Math.pow(10, 9) + 7;

        int U = 1000000;
        int[] power2 = new int[U+1];
        int[] power2_inv = new int[U+1];
        int[] power3 = new int[U+1];
        int[] power3_inv = new int[U+1];
        int[] fact = new int[U+1];
        int[] fact_inv = new int[U+1];

        power2[0] = 1;
        power2_inv[0] = 1;
        power3[0] = 1;
        power3_inv[0] = 1;
        fact[0] = 1;
        fact_inv[0] = 1;

        for (int i = 1; i <= U; i++) {
            power2[i] = (power2[i-1] * 2) % MOD;
            power2_inv[i] = pow(power2[i], MOD-2, MOD);
            power3[i] = (power3[i-1] * 3) % MOD;
            power3_inv[i] = pow(power3[i], MOD-2, MOD);
            fact[i] = (fact[i-1] * i) % MOD;
            fact_inv[i] = pow(fact[i], MOD-2, MOD);
        }

        int[] x = new int[N+M];
        x[0] = 3 * (1 - power3_inv[K+1]) % MOD * power2_inv[1] % MOD;
        for (int i = 1; i <= N+M-1; i++) {
            x[i] = (-1) * power2[i-1] * power3_inv[K+1+i-1] % MOD;
            x[i] *= fact[K+1+i-1] * fact_inv[K] % MOD * fact_inv[1+i-1] % MOD;
            x[i] %= MOD;
        }

        int[] coef = new int[M+1];
        coef[0] = 1;
        for (int i = 1; i <= M; i++) {
            coef[i] = (coef[i-1] * fact[N-1+i-1] * fact_inv[i] % MOD) % MOD;
        }

        for (int i = 0; i <= M; i++) {
            coef[i] = (coef[i] * power3[K+i] % MOD) % MOD;
        }

        for (int i = 0; i <= M; i++) {
            coef[i] = (coef[i] * power2_inv[i+1] % MOD) % MOD;
        }

        for (int i = 0; i <= M; i++) {
            coef[i] = (coef[i] * fact_inv[N-1] % MOD) % MOD;
        }

        for (int i = 0; i <= M; i++) {
            coef[i] = (coef[i] * fact_inv[i+1] % MOD) % MOD;
        }

        for (int i = 0; i <= M; i++) {
            coef[i] = (coef[i] * power3_inv[K+i+1] % MOD) % MOD;
        }

        for (int i = 0; i <= M; i++) {
            coef[i] = (coef[i] * power2_inv[1] % MOD) % MOD;
        }

        for (int i = 0; i <= M; i++) {
            coef[i] = (coef[i] * power3_inv[K+1] % MOD) % MOD;
        }

        for (int i = 0; i <= M; i++) {
            coef[i] = (coef[i] * power2_inv[i+1] % MOD) % MOD;
        }

        for (int i = 0; i <= M; i++) {
            coef[i] = (coef[i] * power3_inv[K+i+1] % MOD) % MOD;
        }

        for (int i = 0; i <= M; i++) {
            coef[i] = (coef[i] * power2_inv[1] % MOD) % MOD;
        }

        for (int i = 0; i <= M; i++) {
            coef[i] = (coef[i] * power3_inv[K+1] % MOD) % MOD;
        }

        for (int i = 0; i <= M; i++) {
            coef[i] = (coef[i] * power2_inv[i+1] % MOD)