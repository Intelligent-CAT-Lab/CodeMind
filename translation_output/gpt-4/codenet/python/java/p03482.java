Below is the translated Java code from the provided Python code:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final int MOD = 1000000007; // 10^9 + 7
    // private static final int MOD = 998244353;
    private static final long INF = (long)10e18;
    private static final double EPS = 1e-7;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Increasing the recursion limit is not needed in Java; it's specific to Python

        String S = reader.readLine().trim();
        int N = S.length();
        int ans = N;
        int ans2 = N;

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '1') {
                ans = Math.min(ans, Math.max(N - i - 1, i));
            } else {
                ans2 = Math.min(ans2, Math.max(N - i - 1, i));
            }
        }

        System.out.println(Math.max(ans, ans2));
    }
}
```

Please note:

1. Java does not have a function to directly set the recursion limit like Python's `sys.setrecursionlimit()`. Java's stack size is typically determined by the -Xss JVM parameter at the JVM startup. You should manage recursion depth carefully to avoid `StackOverflowError`.

2. In Java, there is no need for a direct substitution for Python's `print()` as Java's `System.out.println()` inherently adds a newline. In contrast, `System.out.print()` works like Python's `print(..., end='')`.

3. For reading a string, I've used `BufferedReader` in combination with `InputStreamReader` instead of `sys.stdin.readline`.

4. In Java all numerical computations on integers are done under `MOD` (if required) explicitly by the user. I have included `MOD` in the code, but it is not actively being used.
   
5. `INF` and `EPS` values are set as per Python's code, but please note that the maximum value that a long type variable can hold in Java is `Long.MAX_VALUE` which is `9223372036854775807L`, and `10e18` would be outside of the `double` precision range, but it's represented similarly to the Python example.

6. The string `S` is immutable in Java. To access individual characters of a string, `charAt()` method is used instead of the square brackets `[ ]` in Python.

7. The translated Java code assumes that the input will be provided in the same format as expected by the original Python script, with each `readLine()` call corresponding to one line of input that needs to be trimmed of trailing spaces.
