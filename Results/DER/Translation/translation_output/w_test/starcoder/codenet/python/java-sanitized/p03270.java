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
        int[] comb = new int[U+1];
        for(int i=0;i<=U;i++) comb[i] = 0;
        comb[0] = 1;
        for(int i=1;i<=U;i++) comb[i] = (comb[i-1] * i) % MOD;
        int[] ans = new int[K];
        for(int i=0;i<K;i++) {
            int x = (i+1) / 2;
            int y = K - i - 1;
            int n = Math.min(x, N);
            int sum = 0;
            for(int j=0;j<=n;j++) {
                sum = (sum + (comb[x] * pow(2, j, MOD) % MOD) * (comb[N+y-1] * pow(2, j+y-1, MOD) % MOD) % MOD) % MOD;
            }
            ans[i] = sum;
        }
        if(K % 2 == 1) {
            for(int i=0;i<K/2;i++) {
                System.out.println(ans[i]);
            }
            for(int i=K/2-1;i>=0;i--) {
                System.out.println(ans[i]);
            }
        } else {
            for(int i=0;i<K/2;i++) {
                System.out.println(ans[i]);
            }
            for(int i=K/2;i<K;i++) {
                System.out.println(ans[i]);
            }
        }
    }
}