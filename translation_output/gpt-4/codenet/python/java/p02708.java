Below is the Java translation of the given Python code. Java code is generally more verbose than Python because it is statically-typed, requires type declarations, and does not support tuple assignment, so we have to handle the input parsing differently.

```java
import java.io.*;
import java.util.*;

public class SummationEquation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        long ans = 0;
        final int MOD = (int) (1e9 + 7);

        for (int i = k; i <= n + 1; i++) {
            long maxSum = ((long) 2 * n - i + 1) * i / 2;
            long minSum = (long) i * (i - 1) / 2;
            ans = (ans + (maxSum - minSum + 1)) % MOD;
        }

        System.out.println(ans);
    }
}
```

Please note that in Java, we have to be careful with integer overflows. The `(2*n-i+1)*i` and `i*(i-1)` products can potentially overflow an `int` data type, which is why I've explicitly cast them to `long` to ensure the products are computed using 64-bit integers. After computing the result modulo `10^9+7`, it's converted back to an `int` before printing.
