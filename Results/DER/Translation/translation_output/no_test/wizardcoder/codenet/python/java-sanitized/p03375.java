import java.util.*;
import java.io.*;

public class p03375 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine().trim());
        int MOD = 1000000007;

        long[][] B = new long[N+1][N+1];
        B[0][0] = 1;
        for(int n=1; n<=N; n++){
            for(int l=1; l<=N; l++){
                if(l == 1){
                    B[n][l] = B[n-1][l] + B[n-1][l+1];
                }else if(l == n){
                    B[n][l] = B[n-1][l-1] + B[n-1][l];
                }else{
                    B[n][l] = B[n-1][l-1] + B[n-1][l] + B[n-1][l+1];
                }
                B[n][l] %= MOD;
            }
        }

        long[][] pow_2 = new long[N+1][N+1];
        pow_2[0][0] = 1;
        for(int n=1; n<=N; n++){
            pow_2[n][1] = 2 * pow_2[n-1][1];
            pow_2[n][1] %= MOD;
            for(int l=2; l<=N; l++){
                pow_2[n][l] = pow_2[n-1][l] * pow_2[1][1];
                pow_2[n][l] %= MOD;
            }
        }

        long[] pow_pow = new long[N+1];
        pow_pow[0] = 2;
        for(int n=1; n<=N; n++){
            pow_pow[n] = pow_pow[n-1] * pow_pow[n-1] % MOD;
        }

        long[] A = new long[N+1];
        for(int n=1; n<=N; n++){
            long sum = 0;
            for(int l=1; l<=N; l++){
                sum += B[n][l] * pow_2[n][l] % MOD;
                sum %= MOD;
            }
            A[n] = sum;
        }

        for(int n=1; n<=N; n++){
            A[n] *= pow_pow[n];
            A[n] %= MOD;
        }

        long[] fact = new long[N+1];
        fact[0] = 1;
        for(int n=1; n<=N; n++){
            fact[n] = fact[n-1] * n % MOD;
        }

        long[] fact_inv = new long[N+1];
        fact_inv[N] = pow(fact[N],MOD-2,MOD);
        for(int n=N-1; n>=0; n--){
            fact_inv[n] = fact_inv[n+1] * (n+1) % MOD;
        }

        long comb = fact_inv[0] * fact_inv[N] % MOD * fact[N] % MOD;

        for(int n=1; n<=N; n++){
            A[n] *= (-1);
            A[n] %= MOD;
        }

        A[0] = pow(2,pow(2,N,MOD-1),MOD) - A[0];
        A[0] %= MOD;

        for(int n=1; n<=N; n++){
            A[n] *= comb;
            A[n] %= MOD;
        }

        long answer = 0;
        for(int n=1; n<=N; n++){
            answer += A[n];
            answer %= MOD;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    public static long pow(long a, long b, long mod){
        long res = 1;
        while(b > 0){
            if((b & 1) == 1) res = res *