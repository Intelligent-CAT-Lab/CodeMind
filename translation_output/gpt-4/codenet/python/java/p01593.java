Below is the equivalent Java code for the Python code you have provided. Please note that Java is more verbose and requires explicit type definitions.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] dp = new double[1001];
        dp[0] = 1;

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int j = 1;
            while (i + j <= n && j <= m) {
                dp[i + j] += dp[i] / (n - i);
                j++;
            }
        }

        System.out.printf("%.10f\n", dp[n]);
        sc.close();
    }
}
```

Please pay attention to the following changes:
- Input is handled by the `Scanner` class in Java.
- Java requires explicit type declarations, so we have double arrays instead of lists.
- Java arrays are initialized to 0.0 for double types, so we only need to initialize the first element of `dp` to 1.
- The `printf` method is used to format the output similarly to the Python's `%` formatting.
