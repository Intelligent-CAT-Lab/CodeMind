import java.util.*;
import java.io.*;

public class p03009 {
    static long MOD = 100000007;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int H = Integer.parseInt(input[1]);
        int D = Integer.parseInt(input[2]);
        
        long[] fact = new long[N+1];
        long[] fact_cum = new long[N+1];
        fact[0] = 1;
        fact_cum[0] = 0;
        for(int i = 1; i <= N; i++){
            fact[i] = (fact[i-1]*i)%MOD;
            fact_cum[i] = (fact_cum[i-1] + fact[i])%MOD;
        }
        
        long[] ap = new long[H+1];
        long[] ap_cum = new long[H+1];
        ap[0] = 1;
        ap_cum[0] = 1;
        for(int n = 1; n <= H; n++){
            long x = ap_cum[n-1];
            if(n > D){
                x -= ap_cum[n-D-1];
            }
            x *= fact_cum[N];
            x %= MOD;
            ap[n] = x;
            ap_cum[n] = (ap_cum[n-1] + x)%MOD;
        }
        
        long ans = ap[H];
        ans *= fact[N];
        ans %= MOD;
        ans *= pow(fact_cum[N],MOD-2,MOD);
        ans %= MOD;
        
        System.out.println(ans);
    }
    
    static long pow(long a, long b, long m){
        long ans = 1;
        while(b > 0){
            if(b % 2 == 1){
                ans *= a;
                ans %= m;
            }
            a *= a;
            a %= m;
            b /= 2;
        }
        return ans;
    }
}