<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
-76

```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class p02980 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        static final long MODULO = 998244353;
        static long[] invs;
        static long[] facts;
        static long[] invfacts;

        static {
            int k = (int) 5e5;
            invs = new long[k + 2];
            invs[1] = 1;
            for (int i = 2; i <= k + 1; ++i) {
                invs[i] = ((MODULO - (MODULO / i) * (long) invs[(int) (MODULO % i)] % MODULO) % MODULO);
            }
            facts = new long[k + 2];
            invfacts = new long[k + 2];
            facts[0] = 1;
            invfacts[0] = 1;
            for (int i = 1; i <= k + 1; ++i) {
                facts[i] = (facts[i - 1] * (long) i % MODULO);
                invfacts[i] = (invfacts[i - 1] * (long) invs[i] % MODULO);
            }
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int height = in.nextInt();
            int width = in.nextInt();
            long[] ph = new long[width + 1];
            ph[0] = 1;
            for (int i = 1; i < ph.length; ++i) {
                ph[i] = ph[i - 1] * (height + 1) % MODULO;
            }
            long[] pw = new long[height + 1];
            pw[0] = 1;
            for (int i = 1; i < pw.length; ++i) {
                pw[i] = pw[i - 1] * (width + 1) % MODULO;
            }
            long res = 0;
            for (int common = 0; common <= height && common <= width; ++common) {
                long ways = facts[height] * invfacts[common] % MODULO * invfacts[height - common] % MODULO
                        * facts[width] % MODULO * invfacts[width - common] % MODULO
                        * ph[width - common] % MODULO * pw[height - common] % MODULO;
                if (common % 2 == 0) {
                    res += ways;
                } else {
                    res -= ways;
                }
            }
            res %= MODULO;
            if (res < 0) res += MODULO;
            out.println(res);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}


```

@@ Response
```python
import sys

MODULO = 998244353

def solve(height, width):
    invs = [0] * (width + 1)
    invs[1] = 1
    for i in range(2, width + 1):
        invs[i] = (MODULO - (MODULO // i) * invs[MODULO % i] % MODULO) % MODULO

    facts = [0] * (width + 2)
    invfacts = [0] * (width + 2)
    facts[0] = 1
    invfacts[0] = 1
    for i in range(1, width + 2):
        facts[i] = (facts[i - 1] * i % MODULO)
        invfacts[i] = (invfacts[i - 1] * invs[i] % MODULO)

    ph = [0] * (width + 1)
    ph[0] = 1
    for i in range(1, width + 1):
        ph[i] = (ph[i - 1] * (height + 1) % MODULO)

    pw = [0] * (height + 1)
    pw[0] = 1
    for i in range(1, height + 1):
        pw[i] = (pw[i - 1] * (width + 1) % MODULO)

    res = 0
    for common in range(min(height, width) + 1):
        ways = (facts[height] * invfacts[common] % MODULO * invfacts[height - common] % MODULO
                * facts[width] % MODULO * invfacts[width - common] % MODULO
                * ph[width - common] % MODULO * pw[height - common] % MODULO)
        if common % 2 == 0:
            res += ways
        else:
            res -= ways
    res %= MODULO
    if res < 0:
        res += MODULO
    return res


if __name__ == "__main__":
    height, width = map(int, sys.stdin.readline().split())
    print(solve(height, width))
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calls the `solve` function with these integers, and then prints the result. The `solve` function calculates the result according to the same logic as in the Java code.<｜end▁of▁sentence｜>
