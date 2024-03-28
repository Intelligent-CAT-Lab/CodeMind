Here is the Java translation of the provided Python code along with a sample main method that uses `Scanner` to take inputs similar to the Python `input()` function:

```java
import java.util.Scanner;

public class DpCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        double[] dp = new double[1001];
        dp[0] = 1.0;

        for (int i = 0; i < n; i++) {
            int j = 1;
            while (i + j <= n && j <= m) {
                dp[i + j] += dp[i] / (n - i);
                j++;
            }
        }

        System.out.printf("%.10f%n", dp[n]);

        scanner.close();
    }
}
```

Note that Java handles floating-point numbers a bit differently than Python, and for precision numbers and large arrays, it's recommended to use `BigDecimal` in real-world applications. However, for this sample code, a `double` array suffices to match the Python code's output.

The Java code reads two integers `n` and `m` from the standard input, initializes an array `dp` with `1001` elements where the first element is initialized to `1.0` and the rest are `0.0`, and then performs the computations as in the Python example. After the loop, it prints out the `n`-th element of the `dp` array formatted to 10 decimal places.
