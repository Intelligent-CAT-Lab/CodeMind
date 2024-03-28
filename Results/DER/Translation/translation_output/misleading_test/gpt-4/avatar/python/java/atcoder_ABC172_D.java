Below is the translated Java code from the provided Python code.

```java
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    static final int MOD = 1000000007;
    static final double INF = Double.POSITIVE_INFINITY;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        solve(sc);
    }

    static void solve(FastScanner sc) {
        long n = sc.nextLong();
        long ans = 0;
        for (long i = 1; i <= n; i++) {
            long x = n / i;
            ans += i * (1 + x) * x / 2;
        }
        System.out.println(ans);
    }

    // FastScanner
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        long nextLong() {
            return Long.parseLong(next());
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String line = "";
            try {
                line = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return line;
        }
    }
}
```

The provided Python code includes a lot of unused imports and functions that deal with input/output and other utilities which are not used for solving the problem itself. For this reason, the Java version focuses only on translating the parts that are necessary to solve the problem, as the Python code's `solve` function indicated. Java standard library does not require importing these utilities unlike Python.

Additionally, I've included a `FastScanner` class as a utility for fast I/O operations, which is a common practice for Java programming in competitive programming. The `solve` function is designed to match the logic of the provided Python function.

To match the provided test case scenario, you would read an input using `sc.nextLong()` and execute the `solve` function. The output should be the same as expected from the original Python code.
