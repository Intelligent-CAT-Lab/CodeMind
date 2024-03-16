import java.util.*;
import java.math.*;
 
public class p03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int D = sc.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;
 
        long[] fact = new long[N+1];
        fact[0] = 1;
        for(int i=1;i<=N;i++){
            fact[i] = (fact[i-1]*i)%MOD;
        }
 
        long[] fact_cum = new long[N+1];
        fact_cum[0] = 0;
        for(int i=1;i<=N;i++){
            fact_cum[i] = (fact_cum[i-1] + fact[i])%MOD;
        }
 
        long[] ap = new long[H+1];
        ap[0] = 1;
        ap[1] = 1;
        for(int i=2;i<=H;i++){
            long x = ap[i-1];
            if(i > D){
                x -= ap[i-D-1];
            }
            x *= fact_cum[N];
            x %= MOD;
            ap[i] = x;
        }
 
        long ans = ap[H];
        ans *= fact[N];
        ans %= MOD;
        ans *= pow(fact_cum[N],MOD-2,MOD);
        ans %= MOD;
 
        System.out.println(ans);
    }
 
    public static long pow(long a, long b, long mod){
        if(b == 0) return 1;
        if(b%2 == 0){
            long temp = pow(a,b/2,mod);
            return (temp*temp)%mod;
        }
        else{
            return (a*pow(a,b-1,mod))%mod;
        }
    }
}