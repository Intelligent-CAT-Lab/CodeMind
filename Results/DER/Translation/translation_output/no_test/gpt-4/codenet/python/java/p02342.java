Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class DynamicProgramming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        final int MOD = (int) 1e9 + 7;

        int[][] D = new int[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            D[i][1] = 1;
        }

        for (int i = 1; i <= Math.min(N, K); i++) {
            D[i][i] = 1;
        }

        for (int n = 1; n <= N; n++) {
            for (int k = 2; k <= Math.min(n - 1, K); k++) {
                D[n][k] = (D[n - k][k] + D[n - 1][k - 1]) % MOD;
            }
        }

        System.out.println(D[N][K] % MOD);

        scanner.close();
    }
}
```

This Java code does the equivalent of the given Python code. It reads two integers `N` and `K` from the standard input, initializes a 2D array for dynamic programming, computes the combinatorial values, and prints out the result modulo `MOD`. Note that `Scanner` is used for input, and 1e9 + 7 is cast to an int to ensure `MOD` is of type `int`. Also, remember that Java uses 0-based indexing, so the arrays are sized `N+1` and `K+1` and loops are adjusted accordingly.
