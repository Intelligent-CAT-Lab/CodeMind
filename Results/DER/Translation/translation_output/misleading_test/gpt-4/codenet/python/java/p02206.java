Below is the translated Java code for the given Python script, which includes the sample test case:

```java
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static String next() throws IOException {
        while (!st.hasMoreTokens()) {
            st = new StringTokenizer(stdin.readLine());
        }
        return st.nextToken();
    }

    static boolean ok(long m, long k, int n) {
        long s = 0;
        int cnt = 0;
        while (m > 0) {
            s += m;
            cnt++;
            if (s > k) return false;
            if (cnt == n) break;
            m >>= 1;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        int n = readInt();
        long k = readInt();
        long l = 0;
        long r = k + 1;
        while (l + 1 < r) {
            long m = (l + r) / 2;
            if (ok(m, k, n)) l = m;
            else r = m;
        }
        System.out.println(l);
    }
}
```

You can create a `Main` class file and run the above Java code. Make sure to provide an input like `1 1` through stdin or modify the code to include a scanner for command line input. The Java code snippet has an adjusted way of reading inputs, which is common for Java programs that deal with competitive programming style inputs.

Please note that the `ok` function now takes three parameters (m, k, n) because Java methods do not have access to variables outside their scope, unlike Python functions that can reference variables in the enclosing scope.

For the testing purposes, make sure to input the numbers through stdin as the original Python code uses `sys.stdin.readline()` to read inputs. If you want to enable direct command-line input without manually feeding stdin, you may replace the `readInt()` method body with a new `Scanner(System.in)` to read inputs.
