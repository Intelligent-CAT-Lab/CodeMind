```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final long MOD = (long) Math.pow(10, 9) + 7;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] dp_T = new long[N + 1];
        long[] dp_F = new long[N + 1];

        dp_T[0] = 1;
        dp_F[0] = 0;

        for (int i = 0; i < M; i++) {
            long[] prev_T = dp_T.clone();
            long[] prev_F = dp_F.clone();
            dp_T = new long[N + 1];
            dp_F = new long[N + 1];

            // Red Red
            for (int j = 0; j < N; j++) {
                dp_T[j] = (dp_T[j] + prev_T[j + 1]) % MOD;
                dp_F[j + 1] = (dp_F[j + 1] + prev_F[j + 2]) % MOD;
                dp_T[0] = (dp_T[0] + prev_F[1]) % MOD;
            }

        // Red Blue
            for (int j = 1; j <= N; j++) {
                dp_T[j] = (dp_T[j] + prev_T[j]) % MOD;
                dp_F[j + 1] = (dp_F[j + 1] + prev_F[j + 1]) % MOD;
                dp_T[0] = (dp_T[0] + prev_F[1]) % MOD;
            }

            // Blue Red
            for (int j = 0; j < N; j++) {
                dp_T[j] = (dp_T[j] + prev_T[j]) % MOD;
                dp_F[j] = (dp_F[j] + prev_F[j]) % MOD;
            }

            // Blue Blue
            for (int j = 1; j <= N; j++) {
                dp_T[j] = (dp_T[j] + prev_T[j - 1]) % MOD;
                dp_F[j] = (dp_F[j] + prev_F[j - 1]) % MOD;
            }
        }

        long answer = 0;
        for (int j = 0; j <= N; j++) {
            answer = (answer + dp_T[j]) % MOD;
        }

        System.out.println(answer);
    }
}
```
```
