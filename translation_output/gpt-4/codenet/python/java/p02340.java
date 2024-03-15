Here is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        final int MOD = (int)1e9 + 7;

        int[][] D = new int[N + 1][K + 1];
        for (int n = 0; n <= N; n++) {
            D[n][1] = 1;
        }
        for (int k = 1; k <= K; k++) {
            D[0][k] = 1;
        }
        for (int n = 1; n <= N; n++) {
            for (int k = 1; k <= K; k++) {
                if (n >= k) {
                    D[n][k] = (D[n - k][k] + D[n][k - 1]) % MOD;
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

Please note a few key differences between Java and Python:

1. Java requires the types of all variables to be declared explicitly.
2. `Scanner` is used in Java to handle input rather than `input()` in Python.
3. Array dimensions need to be defined at the time of array declaration in Java.
4. Java uses `System.out.println()` for printing, unlike Python's `print()` function.
5. I've enclosed the main logic within a class named `Main` because Java code runs inside classes.
