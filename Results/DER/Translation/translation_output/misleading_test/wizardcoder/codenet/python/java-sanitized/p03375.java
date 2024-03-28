import java.util.*;
import java.math.*;

public class p03375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int MOD = sc.nextInt();

        int[][] B = new int[N+1][N+1];
        B[0][0] = 1;
        for(int n=1; n<=N; n++){
            // 1çªãåç¬ã§ä½¿ã
            for(int l=2; l<=N; l++){
                B[n][l] = (B[n-1][l-1] + B[n-1][l] * (l-1)) % MOD;
            }
        }

        // 2^{kl}
        int[][] pow_2 = new int[N+1][N+1];
        pow_2[1][1] = 2;
        for(int n=2; n<=N; n++){
            pow_2[n] = pow_2[n-1];
            for(int l=1; l<=N; l++){
                pow_2[n][l] = pow_2[n][l] * 2 % MOD;
            }
        }

        int[] pow_pow = new int[N+1];
        pow_pow[0] = 2;
        for(int n=1; n<=N; n++){
            pow_pow[n] = pow_pow[n-1] * pow_pow[n-1] % MOD;
        }

        int[] A = new int[N+1];
        for(int n=1; n<=N; n++){
            for(int l=1; l<=N; l++){
                A[n] = (A[n] + B[n][l] * pow_2[n][l] % MOD) % MOD;
            }
        }

        for(int n=1; n<=N; n++){
            A[n] = (A[n] * pow_pow[n]) % MOD;
        }

        int[] fact = new int[N+1];
        fact[0] = 1;
        for(int n=1; n<=N; n++){
            fact[n] = fact[n-1] * n % MOD;
        }

        int[] fact_inv = new int[N+1];
        fact_inv[N] = pow(fact[N],MOD-2,MOD);
        for(int n=N-1; n>=0; n--){
            fact_inv[n] = fact_inv[n+1] * (n+1) % MOD;
        }

        int[] comb = new int[N+1];
        for(int n=1; n<=N; n++){
            comb[n] = fact_inv[n] * fact_inv[N-n+1] % MOD * fact[N] % MOD;
        }

        for(int n=1; n<=N; n++){
            A[n] = (A[n] * comb[n]) % MOD;
        }

        for(int n=1; n<=N; n++){
            A[n] = (A[n] * pow(2,pow(2,N,MOD-1),MOD)) % MOD;
        }

        for(int n=1; n<=N; n+=2){
            A[n] = (A[n] * (-1)) % MOD;
        }

        int answer = pow(2,pow(2,N,MOD-1),MOD) - A[1];
        answer %= MOD;
        System.out.println(answer);
    }
}