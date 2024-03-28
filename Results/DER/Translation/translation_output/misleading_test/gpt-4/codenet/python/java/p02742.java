Here's the translated Java code that performs the same logic as the given Python code:

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static final int MOD = (int)1e9 + 7;
    static final double INF = Double.POSITIVE_INFINITY;

    public static void main(String[] args) {
        FastReader input = new FastReader();
        int H = input.nextInt();
        int W = input.nextInt();
        System.out.println((H != 1 && W != 1) ? (int)Math.ceil(H * W / 2.0) : 1);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
```

This Java code uses `BufferedReader` and `StringTokenizer` to read and parse input efficiently, as Java does not have a direct equivalent to Python's input handling functions. The ceiling division and conditional operator are used to replicate the logic in the `main` function from Python.

Note: You should have the input provided to the program as per your system requirement since there is no direct equivalent in Java for `sys.stdin.readline()`. I have included a simple `FastReader` class for reading input, which you might need to adjust as per your environment and input method.
