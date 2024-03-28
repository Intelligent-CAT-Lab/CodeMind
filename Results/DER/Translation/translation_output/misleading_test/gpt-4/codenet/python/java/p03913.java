Here is the translation of the provided Python code into Java:

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        int answer = Integer.MAX_VALUE;

        for (int K = 1; K < 50; K++) {
            answer = Math.min(answer, F(N, A, K));
        }
        System.out.println(answer);
    }

    private static int F(int N, int A, int K) {
        // x+y = K
        // n^K <= N < (n+1)^K
        int n = (int)Math.pow(N, 1.0 / K);
        while ((n - 1) * Math.pow(n, K - 1) > N) {
            n -= 1;
        }
        while (n * Math.pow(n + 1, K - 1) < N) {
            n += 1;
        }
        // n^x(n+1)^y >= N, take y as minimal. Use brute force search.
        int cost = A * (K - 1);
        for (int y = 0; y < K; y++) {
            int x = K - y;
            if (Math.pow(n, x) * Math.pow(n + 1, y) >= N) {
                cost += n * x + (n + 1) * y;
                break;
            }
        }

        return cost;
    }
}
```

Please note that Java's handling of decimals and rounding may cause slightly different behavior in boundary cases where floating-point precision matters. The above code is assuming integer arithmetic like in the Python example.

Also, take into account that this code is written assuming that it would be run from the command line. If the input/output is handled differently (such as in an online judge or different setup), the I/O portions of the code might have to be adjusted accordingly.
