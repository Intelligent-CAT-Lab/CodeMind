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
        int[][] dp = new int[K+1][N+1];
        for(int i=0;i<=K;i++){
            dp[i][0] = 1;
        }
        for(int i=1;i<=K;i++){
            for(int j=1;j<=N;j++){
                dp[i][j] = (dp[i-1][j] + dp[i-1][j-1]) % MOD;
            }
        }
        int[][] dp2 = new int[K+1][N+1];
        for(int i=0;i<=K;i++){
            dp2[i][0] = 1;
        }
        for(int i=1;i<=K;i++){
            for(int j=1;j<=N;j++){
                dp2[i][j] = (dp2[i-1][j] + dp2[i-1][j-1]) % MOD;
            }
        }
        int[][] dp3 = new int[K+1][N+1];
        for(int i=0;i<=K;i++){
            dp3[i][0] = 1;
        }
        for(int i=1;i<=K;i++){
            for(int j=1;j<=N;j++){
                dp3[i][j] = (dp3[i-1][j] + dp3[i-1][j-1]) % MOD;
            }
        }
        int[][] dp4 = new int[K+1][N+1];
        for(int i=0;i<=K;i++){
            dp4[i][0] = 1;
        }
        for(int i=1;i<=K;i++){
            for(int j=1;j<=N;j++){
                dp4[i][j] = (dp4[i-1][j] + dp4[i-1][j-1]) % MOD;
            }
        }
        int[][] dp5 = new int[K+1][N+1];
        for(int i=0;i<=K;i++){
            dp5[i][0] = 1;
        }
        for(int i=1;i<=K;i++){
            for(int j=1;j<=N;j++){
                dp5[i][j] = (dp5[i-1][j] + dp5[i-1][j-1]) % MOD;
            }
        }
        int[][] dp6 = new int[K+1][N+1];
        for(int i=0;i<=K;i++){
            dp6[i][0] = 1;
        }
        for(int i=1;i<=K;i++){
            for(int j=1;j<=N;j++){
                dp6[i][j] = (dp6[i-1][j] + dp6[i-1][j-1]) % MOD;
            }
        }
        int[][] dp7 = new int[K+1][N+1];
        for(int i=0;i<=K;i++){
            dp7[i][0] = 1;
        }
        for(int i=1;i<=K;i++){
            for(int j=1;j<=N;j++){
                dp7[i][j] = (dp7[i-1][j] + dp7[i-1][j-1]) % MOD;
            }
        }
        int[][] dp8 = new int[K+1][N+1];
        for(int i=0;i<=K;i++){
            dp8[i][0] = 1;
        }
        for(int i=1;i<=K;i++){
            for(int j=1;j<=N;j++){
                dp8[i][j] = (dp8[i-1][j] + dp8[i-1][j-1]) % MOD;
            }
        }
        int[][] dp9 = new int[K+1][N+1];
        for(int i=0;i<=K;i++){
            dp9[i][0] = 1;
        }
        for(int i=1;i<=K;i++){
            for(int j=1;j<=N;j++){
                dp9[i][j] = (dp9[i-1][j] + dp9[i-1][j-1]) % MOD;
            }
        }
        int[][] dp10 = new int[K+1][N+1];
        for(int i=0;i<=K;i++){
            dp10[i][0] = 1;
        }
        for(int i=1;i<=K;i++){
            for(int j=1;j<=N;j++){
                dp10[i][j] = (dp10[i-1][j] + dp10[i-1][j-1]) % MOD;
            }
        }
        int[][] dp11 = new int[K+1][N+1];
        for(int i=0;i<=K;i++){
            dp11[i][0] = 1;
        }
        for(int i=1;i<=K;i++){
            for(int j=1;j<=N;j++){
                dp11[i][j] = (dp11[i-1][j] + dp11[i-1][j-1]) % MOD;
            }
        }
        int[][] dp12 = new int[K+1][N+1];
        for(int i=0;i<=K;i++){
            dp12[i][0] = 1;
        }
        for(int i=1;i<=K;i++){
            for(int j=1;j<=N;j++){
                dp12[i][j] = (dp12[i-1][j] + dp12[i-1][j-1]) % MOD