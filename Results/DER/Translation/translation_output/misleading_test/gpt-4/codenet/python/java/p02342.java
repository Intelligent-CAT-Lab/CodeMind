Here's the Python code translated to Java:

```java
import java.util.Scanner;

public class DynamicCombination {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        int[][] D = new int[N+1][K+1];
        // Base cases: D[i][1] = 1 for all i, and D[i][i] = 1 for all i <= K
        for (int i = 1; i <= N; i++) {
            D[i][1] = 1;
        }
        for (int i = 1; i <= Math.min(N, K); i++) {
            D[i][i] = 1;
        }
        
        // Dynamic programming
        for (int n = 1; n <= N; n++) {
            for (int k = 2; k <= Math.min(n - 1, K); k++) {
                D[n][k] = (D[n - k][k] + D[n - 1][k - 1]) % MOD;
            }
        }
        
        // Print the result
        System.out.println(D[N][K] % MOD);
        
        scanner.close();
    }
}
```

To use this code for the provided test case (10 5), you would compile and run the Java program and input `10 5` when prompted. The expected output is `-55`, however, if we were to run the above Java program, the output should be a non-negative number since we are always taking the modulus with `10^9 + 7`. There might be a discrepancy in the expected output as provided in the question. If you meant to print the result modulo `MOD`, the Java program should produce the correct answer under modular arithmetic.
