Below is the Java equivalent of the Python code you've provided:

```java
import java.io.*;
import java.util.*;

public class Solution {
    static final long INF = (long) Math.pow(10, 18);
    static final int MOD = (int) Math.pow(10, 9) + 7;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = reader.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        long X = Long.parseLong(inputs[1]);

        long[] l = new long[51];
        long[] p = new long[51];

        l[0] = 1;
        p[0] = 1;

        for (int i = 1; i <= 50; i++) {
            l[i] = l[i - 1] * 2 + 3;
            p[i] = p[i - 1] * 2 + 1;
        }

        long ans = 0;
        for (int i = N; i >= 0; i--) {
            if (i == 0 && X >= 1) {
                ans += 1;
                break;
            }

            if (X <= 1) {
                break;
            } else if (X <= l[i - 1] + 1) {
                X -= 1;
                continue;
            } else if (X == l[i - 1] + 2) {
                ans += 1;
                X -= 2;
            } else {
                ans += p[i - 1] + 1;
                X -= l[i - 1] + 2;
            }
        }
        System.out.println(ans);
    }
}
```

Make sure the input format matches what's expected by the BufferedReader in the translated Java code. The `BufferedReader` is used to read input from standard input (stdin), analogous to `sys.stdin.buffer` methods in Python. This code assumes that input is provided in the format "N X", where N and X are integers separated by a space.

Please note that Java has a default recursion limit that's typically high enough for most purposes, so there's no direct equivalent to Python's `sys.setrecursionlimit` in Java, and thus it was omitted from the translation.
