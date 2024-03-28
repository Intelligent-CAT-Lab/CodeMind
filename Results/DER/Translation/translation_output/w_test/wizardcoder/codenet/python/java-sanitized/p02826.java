import java.io.*;
import java.util.*;

public class p02826 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int MOD = Integer.parseInt(input[1]);

        int U = 100000;
        int[] fact = new int[U+1];
        int[] fact_inv = new int[U+1];
        fact[0] = 1;
        for(int i=1;i<=U;i++){
            fact[i] = (fact[i-1] * i) % MOD;
        }
        fact_inv[U] = pow(fact[U], MOD-2, MOD);
        for(int i=U-1;i>=0;i--){
            fact_inv[i] = (fact_inv[i+1] * (i+1)) % MOD;
        }

        int[] inv = new int[U+1];
        inv[1] = 1;
        for(int i=2;i<=U;i++){
            inv[i] = (inv[MOD % i] * (MOD-MOD/i)) % MOD;
        }

        int[] f = new int[N+N+10];
        for(int i=1;i<=N/2;i++){
            for(int j=i;j<=N;j+=i){
                f[j] = (f[j] + 2 * inv[i]) % MOD;
            }
        }
        if(N % 2 == 1){
            int x = (N+1)/2;
            for(int j=x;j<=N;j+=x){
                f[j] = (f[j] + inv[1]) % MOD;
            }
        }

        int[] g = new int[N+1];
        for(int i=0;i<N;i++){
            g[i] = (f[i] * fact_inv[i]) % MOD;
        }

        int answer = 0;