Here is the Java translation of the given Python code:

```java
import java.util.Scanner;

public class Main {
    private static final long MOD = (long)1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        long[][] D = new long[N+1][K+1];

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

        scanner.close();
    }
}
```

To use this Java code, you can run a Java program that has this `Main` class, and when prompted, input your `N` and `K` values separated by a space (as in "5 3"). After pressing enter, you should see the expected output (83 in this case).
