import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03748 {
    private static final int MOD = 1000000007;
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        long[] dp_T = new long[N + 1];
        long[] dp_F = new long[N + 1];
        dp_T[0] = 1;
        dp_F[0] = 0;
        
        for (int i = 0; i < M; ++i) {
            long[] new_dp_T = new long[N + 1];
            long[] new_dp_F = new long[N + 1];
            
            for (int j = 0; j < N; ++j) {
                // Red-red
                if (j + 1 < dp_T.length) new_dp_T[j] += dp_T[j + 1];
                if (j + 2 < dp_F.length) new_dp_F[j + 1] += dp_F[j + 2];
                
                // Red-blue
                if (j + 1 < dp_T.length) new_dp_T[j + 1] += dp_T[j + 1];
                if (j + 2 < dp_F.length) new_dp_F[j + 2] += dp_F[j + 2];
                
                // Blue-red
                new_dp_T[j] += dp_T[j];
                new_dp_F[j] += dp_F[j];
                
                // Blue-blue
                if (j + 1 < dp_T.length) new_dp_T[j + 1] += dp_T[j];
                if (j + 1 < dp_F.length) new_dp_F[j + 1] += dp_F[j];
                
                new_dp_T[j] %= MOD;
                new_dp_F[j] %= MOD;
            }
            
            new_dp_T[0] += dp_F[1];
            new_dp_T[1] += dp_F[1];
            
            new_dp_T[0] %= MOD;
            new_dp_T[1] %= MOD;
            
            dp_T = new_dp_T;
            dp_F = new_dp_F;
        }
        
        long answer = 0;
        for (long a : dp_T) {
            answer = (answer + a) % MOD;
        }
        
        System.out.println(answer);
    }
}