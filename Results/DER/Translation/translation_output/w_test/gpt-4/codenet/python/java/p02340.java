Here is the equivalent Java code of the provided Python code. Please note that Java requires explicitly declaring data types and the use of semicolons to terminate statements. It also does not have a built-in equivalent of Python's `input()`, so `Scanner` is used to read inputs.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        final int MOD = (int)1e9 + 7;

        int[][] D = new int[N+1][K+1];
        for (int n = 0; n <= N; n++) {
            D[n][1] = 1;
        }
        for (int k = 1; k <= K; k++) {
            D[0][k] = 1;
        }
        for (int n = 1; n <= N; n++) {
            for (int k = 1; k <= K; k++) {
                if (n >= k) {
                    D[n][k] = (D[n-k][k] + D[n][k-1]) % MOD;
                } else {
                    D[n][k] = D[n][n];
                }
            }
        }
        System.out.println(D[N][K]);

        sc.close();
    }
}
```

You would compile this Java code and then run it. When prompted, you would enter the test input (`5 3`) and the expected output should be `5`, consistent with the Python code example provided.
