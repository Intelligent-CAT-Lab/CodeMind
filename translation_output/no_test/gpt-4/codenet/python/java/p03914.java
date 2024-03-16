Below is the translated Java code for the Python program you provided. Note that in Java, there's a need for explicitly handling exceptions when reading from `System.in` and specifying the types for variables.

```java
import java.io.*;
import java.util.*;

public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        long[][] dp = new long[N + 1][N];
        dp[1][0] = 1;
        
        for (int i = 0; i < M; i++) {
            long[][] dpNew = new long[N + 1][N];
            for (int j = 0; j <= N; j++) {
                for (int k = 0; k < N; k++) {
                    dpNew[j][k] = (dpNew[j][k] + dp[j][k] * k) % MOD;
                    if (k + 1 < N) {
                        dpNew[j][k + 1] = (dpNew[j][k + 1] + dp[j][k] * (N - j - k)) % MOD;
                    }
                    if (j + k <= N) {
                        dpNew[j + k][0] = (dpNew[j + k][0] + dp[j][k] * j) % MOD;
                    }
                }
            }
            dp = dpNew;
        }
        
        System.out.println(dp[N][0]);
    }
}
```

Please note a few key differences and assumptions made in this translation:

1. In Java, arrays are initialized to zero by default, so there's no need to explicitly set the `dp` elements to zero.
2. IOExceptions are either thrown or need to be caught when performing I/O operations in Java; this is why the `main` method includes "throws IOException".
3. In Java, there's no direct equivalent of Python's `int(input())` that can be used without exception handling. Instead, it's common practice to wrap these calls in a try-catch block or declare the exception as being thrown by the main method, as done in this translation.
4. In Python, division by default results in a float. In Java, when you divide two integers, the result is an integer. Since the division by `mod` in the original program is intended to be integer division, the translation directly performs mod operations without any change.
5. In Java, the `Math.pow` function provides an equivalent to Python's exponentiation. However, for integer powers of 10, it's often acceptable and more efficient to simply use the numeric literal (e.g., `1000000000` for `10**9`). In this code translation, this feature (`eps = 10**-9`) was not used and therefore not included. If such precision or calculation were needed, `BigDecimal` would be used in Java to handle very small decimal values or precision-sensitive calculations.
6. Java has a stricter approach to typing, with all variables needing a declared type.
7. The original Python code uses list comprehension to create multi-dimensional lists (arrays). In Java, multi-dimensional arrays must be created with loop constructs.
