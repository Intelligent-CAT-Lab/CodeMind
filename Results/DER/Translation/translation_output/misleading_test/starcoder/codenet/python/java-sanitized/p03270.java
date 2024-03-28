import java.util.*;
import java.io.*;

public class p03270 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int MOD = 998244353;
        int U = 10000;
        int[] fact = new int[U+1];
        int[] fact_inv = new int[U+1];
        fact[0] = 1;
        fact_inv[0] = 1;
        for(int i=1;i<=U;i++) {
            fact[i] = (fact[i-1] * i) % MOD;
            fact_inv[i] = (fact_inv[i-1] * i) % MOD;
            fact_inv[i] = (fact_inv[i] * pow(fact[i], MOD-2, MOD)) % MOD;
        }
        int[] answer = new int[K];
        for(int S = 3;S <= K+3;S += 2) {
            int x = 0;
            for(int i = 0;i <= (S-1)/2;i++) {
                x = (x + (pow(2, i, MOD) * comb(S-1, i, MOD) * comb(N+K-S+1, i+K-S+1, MOD) % MOD)) % MOD;
            }
            answer[S/2-1] = x;
        }
        if(K & 1 == 1) {
            for(int i = 0;i < K/2;i++) {
                answer[K-1-i] = answer[i];
            }
        }
        for(int i = 0;i < K;i++) {
            System.out.println(answer[i]);
        }
    }
    public static int pow(int a, int b, int mod) {
        int ans = 1;
        while(b > 0) {
            if((b & 1) == 1) {
                ans = (ans * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return ans;
    }
    public static int comb(int n, int k, int mod) {
        if(k < 0 || k > n) {
            return 0;
        }
        return (fact[n] * fact_inv[k] * fact_inv[n-k]) % mod;
    }
    public static int[] init() {
        int[] fact = new int[10001];
        int[] fact_inv = new int[10001];
        fact[0] = 1;
        fact_inv[0] = 1;
        for(int i=1;i<=10000;i++) {
            fact[i] = (fact[i-1] * i) % 998244353;
            fact_inv[i] = (fact_inv[i-1] * i) % 998244353;
            fact_inv[i] = (fact_inv[i] * pow(fact[i], 998244353-2, 998244353)) % 998244353;
        }
        return new int[]{fact, fact_inv};
    }
}