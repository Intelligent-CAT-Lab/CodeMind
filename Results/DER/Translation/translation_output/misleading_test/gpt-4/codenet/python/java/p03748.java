Below is the equivalent Java code for the given Python code using arrays instead of NumPy since Java doesn't have a built-in NumPy library.

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        final int MOD = (int) (1e9 + 7);

        long[] dp_T = new long[N + 1];
        long[] dp_F = new long[N + 1];
        dp_T[0] = 1;

        for (int i = 0; i < M; ++i) {
            long[] prev_T = dp_T.clone();
            long[] prev_F = dp_F.clone();
            dp_T = new long[N + 1];
            dp_F = new long[N + 1];
            // 赤赤
            for (int j = 0; j < N; j++) {
                dp_T[j] += prev_T[j + 1];
            }
            for (int j = 1; j < N - 1; j++) {
                dp_F[j] += prev_F[j + 2];
            }
            dp_T[0] += prev_F[1];
            // 赤青
            for (int j = 1; j <= N; j++) {
                dp_T[j] += prev_T[j];
            }
            for (int j = 2; j <= N; j++) {
                dp_F[j] += prev_F[j];
            }
            dp_T[1] += prev_F[1];
            // 青赤
            for (int j = 0; j < N; j++) {
                dp_T[j] += prev_T[j];
                dp_F[j] += prev_F[j];
            }
            // 青青
            for (int j = 1; j <= N; j++) {
                dp_T[j] += prev_T[j - 1];
                dp_F[j] += prev_F[j - 1];
            }
            
            for (int j = 0; j <= N; j++) {
                dp_T[j] %= MOD;
                dp_F[j] %= MOD;
            }
        }

        long answer = 0;
        for (int i = 0; i <= N; i++) {
            answer += dp_T[i];
            answer %= MOD;
        }
        System.out.println(answer);
    }
}
```

This code snippet should work correctly for converting the input with space-separation into integers for N and M, initializing the dynamic programming arrays `dp_T` and `dp_F`, and calculating the answer as in the provided Python code.

Remember to adjust the class name (`Main` in this case) as necessary, depending on the environment where you're running this code.
