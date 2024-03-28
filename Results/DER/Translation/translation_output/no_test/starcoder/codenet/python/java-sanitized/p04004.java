import java.util.*;
import java.io.*;

public class p04004 {
    static int N,M,K;
    static int MOD = 1_000_000_007;
    static int[] power2,power2_inv,power3,power3_inv,fact,fact_inv;
    static int[] x;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        power2 = new int[1000001];
        power2_inv = new int[1000001];
        power3 = new int[1000001];
        power3_inv = new int[1000001];
        fact = new int[1000001];
        fact_inv = new int[1000001];
        power2[0] = 1;
        power3[0] = 1;
        fact[0] = 1;
        for (int i = 1; i <= 1000000; i++) {
            power2[i] = (power2[i-1] * 2) % MOD;
            power3[i] = (power3[i-1] * 3) % MOD;
            fact[i] = (fact[i-1] * i) % MOD;
        }
        power2_inv[1000000] = pow(2,MOD-2,MOD);
        power3_inv[1000000] = pow(3,MOD-2,MOD);
        for (int i = 999999; i >= 0; i--) {
            power2_inv[i] = (power2_inv[i+1] * power2[i+1]) % MOD;
            power3_inv[i] = (power3_inv[i+1] * power3[i+1]) % MOD;
        }
        x = new int[N+M];
        x[1] = 3;
        for (int i = 1; i <= N+M-1; i++) {
            x[i+1] = (x[i] * power3_inv[K+1+i] * power2_inv[1+i]) % MOD;
        }
        for (int i = 1; i <= N+M; i++) {
            x[i] = (x[i] * fact[K+1+i] * fact_inv[1+i] * fact_inv[K+1]) % MOD;
        }
        for (int i = 1; i <= N+M; i++) {
            x[i] = (x[i] * power3[K+i] * power2_inv[i]) % MOD;
        }
        long ans = 0;
        for (int i = 0; i < M+1; i++) {
            ans = (ans + (fact[N-1] * fact_inv[i] * fact_inv[N-1+i] * power3[K+i] * power2_inv[i]) % MOD) % MOD;
        }
        System.out.println(ans);
    }
}