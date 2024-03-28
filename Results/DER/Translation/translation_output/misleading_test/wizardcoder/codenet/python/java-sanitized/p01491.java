import java.util.*;
import java.io.*;

public class p01491 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        int m0 = Integer.parseInt(input[2]);
        int md = Integer.parseInt(input[3]);
        int n0 = Integer.parseInt(input[4]);
        int nd = Integer.parseInt(input[5]);

        int[] S = new int[M+1];
        S[0] = m0;
        for(int i=1; i<M; i++) {
            S[i] = (S[i-1]*58 + md) % (N+1);
        }
        Arrays.sort(S);
        for(int i=1; i<M; i++) {
            S[i] += S[i-1];
        }

        int[] T = new int[N+1];
        T[0] = n0;
        for(int i=1; i<N; i++) {
            T[i] = (T[i-1]*58 + nd) % (M+1);
        }
        Arrays.sort(T);
        for(int i=1; i<N; i++) {
            T[i] += T[i-1];
        }

        int[][] dp = new int[M+1][N+1];
        for(int i=0; i<=M; i++) {
            for(int j=0; j<=N; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = 1000000000;
                    for(int k=0; k<i; k++) {
                        dp[i][j] = Math.min(dp[i][j], dp[k][j-1] + dp[i-k-1][j] + S[i-1] + T[j-1]);
                    }
                }
            }
        }

        bw.write(String.valueOf(dp[M][N]));
        bw.flush();
        bw.close();
    }
}