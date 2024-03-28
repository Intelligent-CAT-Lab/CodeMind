import java.io.*;
import java.util.*;

public class p03748 {

    static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] parts = br.readLine().split(" ");
        int N = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);

        long[] dp_T = new long[N+1];
        long[] dp_F = new long[N+1];
        Arrays.fill(dp_F, 1);
        dp_T[0] = 1;
        dp_F[0] = 0;

        for (int i = 0; i < M; i++) {
            long[] prev_T = dp_T.clone();
            long[] prev_F = dp_F.clone();
            dp_T = new long[N+1];
            dp_F = new long[N+1];

            // Red-Red
            for (int j = 0; j < N; j++) {
                dp_T[j] = (dp_T[j] + prev_T[j+1]) % MOD;
                if (j+1 < N ) { // prevent ArrayIndexOutOfBoundsException
                    dp_F[j+1] = (dp_F[j+1] + prev_F[j+2]) % MOD;
                }
            }
            dp_T[0] = (dp_T[0] + prev_F[1]) % MOD;
            
            // Red-Blue
            for (int j = 1; j <= N; j++) {
                dp_T[j] = (dp_T[j] + prev_T[j]) % MOD;
                if (j+1 <= N) { // prevent ArrayIndexOutOfBoundsException
                    dp_F[j+1] = (dp_F[j+1] + prev_F[j+1]) % MOD;
                }
            }
            dp_T[1] = (dp_T[1] + prev_F[1]) % MOD;

            // Blue-Red
            for (int j = 0; j < N; j++) {
                dp_T[j] = (dp_T[j] + prev_T[j]) % MOD;
                dp_F[j] = (dp_F[j] + prev_F[j]) % MOD;
            }

            // Blue-Blue
            for (int j = 1; j <= N; j++) {
                dp_T[j] = (dp_T[j] + prev_T[j-1]) % MOD;
                dp_F[j] = (dp_F[j] + prev_F[j-1]) % MOD;
            }
        }

        long answer = 0;
        for (long x : dp_T) {
            answer = (answer + x) % MOD;
        }

        System.out.println(answer);
    }
}