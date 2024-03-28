import java.util.*;
import java.math.*;
 
public class p03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int D = sc.nextInt();
        int MOD = 1000000007;
 
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
        for(int i=1;i<=H;i++){
            ap[i] = (ap[i-1]*fact_cum[N])%MOD;
            if(i > D){
                ap[i] -= ap[i-D-1];
                ap[i] %= MOD;
            }
        }
 
        long ans = ap[H];
        ans = (ans*fact[N])%MOD;
        ans = (ans*pow(fact_cum[N],MOD-2,MOD))%MOD;
 
        System.out.println(ans);
    }
}