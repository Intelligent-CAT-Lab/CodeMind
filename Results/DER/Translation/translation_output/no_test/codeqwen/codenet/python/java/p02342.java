Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;

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
    }
}
```

This Java code does the same thing as your Python code. It reads two integers N and K from the standard input, calculates the value of D[N][K] using dynamic programming, and prints the result. The dynamic programming table D is initialized with the base cases, and then filled in with the recursive formula. The result is then printed to the standard output.
