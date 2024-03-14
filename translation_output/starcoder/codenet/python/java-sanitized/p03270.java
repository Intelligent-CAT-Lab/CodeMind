import java.util.*;
import java.io.*;

public class p03270 {
    static int MOD = 998244353;
    static int U = 10000;
    static int[] fact = new int[U+1];
    static int[] fact_inv = new int[U+1];
    static int[] inv = new int[U+1];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        fact[0] = 1;
        for(int i = 1; i <= U; i++) fact[i] = fact[i-1] * i % MOD;
        inv[U] = pow(fact[U], MOD-2, MOD);
        for(int i = U-1; i >= 0; i--) inv[i] = inv[i+1] * (i+1) % MOD;
        fact_inv[0] = 1;
        for(int i = 1; i <= U; i++) fact_inv[i] = fact_inv[i-1] * inv[i] % MOD;
        int[] answer = new int[K];
        for(int S = 3; S <= K+3; S += 2) {
            int x = 0;
            for(int i = 0; i <= (S-1)/2; i++) {
                x += fact[i] * pow(2, i, MOD) * fact_inv[i+K-S+1] % MOD;
                x %= MOD;
            }
            answer[S/2-1] = x;
        }
        if(K & 1 == 1) {
            for(int i = 0; i < K/2; i++) {
                answer[K-1-i] = answer[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < K; i++) {
            sb.append(answer[i] + "\n");
        }
        System.out.println(sb);
    }
    static int pow(int a, int b, int mod) {
        int ret = 1;
        while(b > 0) {
            if((b & 1) == 1) ret = ret * a % mod;
            a = a * a % mod;
            b >>= 1;
        }
        return ret;
    }
}