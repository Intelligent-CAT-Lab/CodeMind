Here is the Java equivalent of the provided Python code:

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);

        int answer = Integer.MAX_VALUE;
        for (int K = 1; K < 50; K++) {
            answer = Math.min(answer, F(N, A, K));
        }
        
        System.out.println(answer);
    }

    private static int F(int N, int A, int K) {
        int n = (int) Math.pow(N, 1.0 / K);
        while ((n - 1) * (int) Math.pow(n, K - 1) > N) {
            n--;
        }
        while (n * (int) Math.pow(n + 1, K - 1) < N) {
            n++;
        }

        int cost = Integer.MAX_VALUE;
        for (int y = 0; y < K; y++) {
            int x = K - y;
            if ((int) Math.pow(n, x) * (int) Math.pow(n + 1, y) >= N) {
                cost = Math.min(cost, A * (K - 1) + n * x + (n + 1) * y);
            }
        }
        return cost;
    }
}
```

Notes:
- Java does not directly support tuples, therefore I adjusted the code to work with separate variables.
- The code uses `BufferedReader` to read from `stdin` in Java.
- The `**` operator from Python has been replaced by `Math.pow()` in Java.
- Loops and conditions have been converted from Python's syntax to Java's syntax.
- I have preserved the logic of the original Python code within the Java context. 

Remember to compile and run the Java code to verify its correctness in your specific environment.
