import java.util.*;
import java.math.*;

public class p02990 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000007;

        BigInteger[][] dp = new BigInteger[N+1][K+1];
        for(int i=0;i<=N;i++){
            for(int j=0;j<=K;j++){
                dp[i][j] = BigInteger.ZERO;
            }
        }

        for(int i=1;i<=K;i++){
            dp[i][i] = BigInteger.ONE;
        }

        for(int i=K+1;i<=N;i++){
            for(int j=1;j<=K;j++){
                dp[i][j] = dp[i-1][j].multiply(BigInteger.valueOf(i-1)).divide(BigInteger.valueOf(j)).mod(BigInteger.valueOf(MOD));
            }
        }

        for(int i=1;i<=K;i++){
            if(i > K || i > N-K+1){
                System.out.println(0);
            }else{
                BigInteger ans = dp[N-K+1][i].multiply(BigInteger.valueOf(between(N,K,i))).mod(BigInteger.valueOf(MOD));
                System.out.println(ans);
            }
        }
    }

    public static int between(int n, int k, int i){
        if(i == 1){
            return 1;
        }
        int res = 1;
        for(int j=1;j<=i-1;j++){
            res = res * (k-j) % 1000000007;
        }
        return res;
    }
}