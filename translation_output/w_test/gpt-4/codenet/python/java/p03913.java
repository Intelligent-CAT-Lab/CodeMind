Here is the equivalent Java code for the given Python code:

```java
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = reader.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int A = Integer.parseInt(inputs[1]);

        int answer = F(N, A, 1);
        for (int K = 2; K < 50; K++) {
            answer = Math.min(answer, F(N, A, K));
        }

        System.out.println(answer);
    }

    private static int F(int N, int A, int K) {
        // x+y = K
        // n^K <= N < (n+1)^K
        int n = (int)Math.pow(N, 1.0/K);
        while ((n - 1) * Math.pow(n, K - 1) > N) {
            n -= 1;
        }
        while (n * Math.pow(n + 1, K - 1) < N) {
            n += 1;
        }
        // n^x(n+1)^y >= N, take the minimum y. Simplified by searching exhaustively.
        int cost = Integer.MAX_VALUE;
        for (int y = 0; y < K; y++) {
            int x = K - y;
            if (Math.pow(n, x) * Math.pow(n + 1, y) >= N) {
                cost = A * (K - 1) + n * x + (n + 1) * y;
                break;
            }
        }
        return cost;
    }
}
```

I've named the class `Main`, but you can name it according to your file name. Be sure to include the `throws IOException` part, as the `readLine` function may throw this exception if an I/O error occurs. Change the class name if required, and make sure the file name matches the class name in Java.

However, unlike Python, Java doesn't support reading from `stdin` in a compact and direct way as like `sys.stdin`, so I used `BufferedReader` to read from the standard input stream (console).

Also, in Java, you need to manually convert `String` to `Integer` using `Integer.parseInt()`, and cast the result of `Math.pow`, which returns a `double`, to `int` as the power result may not be an integer.

Keep in mind that the `System.out.println` method will print to the standard output, which should be properly captured if you are testing the program in an environment where standard streams are redirected.
