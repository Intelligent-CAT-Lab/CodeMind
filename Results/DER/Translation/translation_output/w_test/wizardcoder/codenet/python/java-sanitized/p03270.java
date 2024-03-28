import java.util.*;
import java.math.*;

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
        for(int i=1;i<=U;i++){
            fact[i] = (fact[i-1] * i) % MOD;
            fact_inv[i] = pow(fact[i], MOD-2, MOD);
        }
        for(int i=U;i>=1;i--){
            fact_inv[i-1] = (fact_inv[i] * i) % MOD;
        }
        int[] answer = new int[K+1];
        for(int S=3;S<=K+3;S+=2){
            int x = F((S-1)/2, K - S + 1, N);
            answer[S/2] = x;
            answer[K-S/2+1] = x;
        }
        if(K % 2 == 1){
            for(int i=1;i<=K/2;i++){
                answer[i] = answer[K-i+1];
            }
        }
        for(int x:answer){
            System.out.println(x);
        }
    }
    public static int pow(int a, int b, int mod){
        int res = 1;
        while(b > 0){
            if(b % 2 == 1) res = (res * a) % mod;
            a = (a * a) % mod;
            b /= 2;
        }
        return res;
    }
    public static int F(int x, int y, int N){
        int n = Math.min(x, N);
        int res = 0;
        for(int i=0;i<=n;i++){
            res = (res + comb(x,i) * pow(2,i,MOD) * comb(N+y-1,i+y-1)) % MOD;
        }
        return res;
    }
    public static int comb(int n, int k){
        if(k < 0 || k > n) return 0;
        return (fact[n] * fact_inv[k] * fact_inv[n-k]) % MOD;
    }
}