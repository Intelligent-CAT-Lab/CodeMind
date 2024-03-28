Certainly! Below is the provided Python code translated into Java:

```java
import java.util.Scanner;

public class CombinationCount {
    public static void main(String[] args) {
        final int MOD = 1000000007;

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        int[][] D = new int[N+1][K+1];
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

To compile and run this Java program, you will need to have Java installed on your computer. Save the file with a `.java` extension, then compile it using `javac CombinationCount.java` and run it using `java CombinationCount`. When prompted, enter your test input (in this case, "10 5"), and the program should output the expected result, which is 7.

The Java program follows a structure similar to that of the Python code, using nested loops to fill in the dynamic programming table `D` and finally printing the result modulated by `MOD`. Additionally, Java requires explicitly declaring and initializing the array with the specified size before using it, unlike Python which allows for dynamic list comprehension and initialization inside the loops.
