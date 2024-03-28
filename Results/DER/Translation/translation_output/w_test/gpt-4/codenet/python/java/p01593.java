Below is the translation of the provided Python code into Java:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        double[] dp = new double[1001];
        dp[0] = 1.0;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < n; ++i) {
            int j = 1;
            while (i + j <= n && j <= m) {
                dp[i + j] += dp[i] / (n - i);
                j += 1;
            }
        }

        System.out.printf("%.8f\n", dp[n]);
        scanner.close();
        
    }
}
```

The corresponding test input 2 1 should produce the expected output 0.50000000 after running the above Java code.

Please note that Java uses a Scanner object for input, and `System.out.printf` for formatted output. We're using an array of type `double` since Java is statically typed and we have to define the type of our array elements upfront. Additionally, Java doesn't support slicing and incrementation as flexibly as Python, so we have adjusted the while loop to simulate the same functionality.
