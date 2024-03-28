import java.util.*;
import java.io.*;

public class p03375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int MOD = sc.nextInt();
        int[][] B = new int[N+1][N+1];
        B[0][0] = 1;
        for(int n = 1; n <= N; n++) {
            for(int l = 1; l <= N; l++) {
                B[n][l] = (B[n-1][l-1] + B[n-1][l] * (l-1)) % MOD;
            }
        }
        int[][] pow_2 = new int[N+1][N+1];
        pow_2[0][0] = 1;
        for(int n = 1; n <= N; n++) {
            pow_2[n][0] = 2 * pow_2[n-1][0] % MOD;
            for(int l = 1; l <= N; l++) {
                pow_2[n][l] = pow_2[n][l-1] * 2 % MOD;
            }
        }
        int[] pow_pow = new int[N+1];
        pow_pow[0] = 2;
        for(int n = 1; n <= N; n++) {
            pow_pow[n] = pow_pow[n-1] * pow_pow[n-1] % MOD;
        }
        int[] A = new int[N+1];
        for(int n = 1; n <= N; n++) {
            for(int l = 1; l <= N; l++) {
                A[n] = (A[n] + B[n][l] * pow_2[n][l] % MOD) % MOD;
            }
        }
        for(int n = 1; n <= N; n++) {
            A[n] = (A[n] * pow_pow[n] % MOD) % MOD;
        }
        int[] fact = new int[N+1];
        int[] fact_inv = new int[N+1];
        fact[0] = 1;
        fact_inv[0] = 1;
        for(int n = 1; n <= N; n++) {
            fact[n] = fact[n-1] * n % MOD;
            fact_inv[n] = fact_inv[n-1] * n % MOD;
        }
        fact_inv[N] = pow(fact[N],MOD-2,MOD);
        for(int n = N; n >= 1; n--) {
            fact_inv[n-1] = fact_inv[n] * n % MOD;
        }
        int[] comb = new int[N+1];
        for(int n = 1; n <= N; n++) {
            comb[n] = fact_inv[n] * fact_inv[n-1] % MOD * fact[N] % MOD;
        }
        for(int n = 1; n <= N; n++) {
            A[n] = (A[n] * comb[n] % MOD) % MOD;
        }
        for(int n = 1; n <= N; n++) {
            A[n] = (A[n] * (-1) % MOD) % MOD;
        }
        int answer = pow(2,pow(2,N,MOD-1),MOD) - A[N];
        answer %= MOD;
        System.out.println(answer);
    }
}