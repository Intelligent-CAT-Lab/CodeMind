<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
import io
import math

MODULO = 998244353

def solve(height, width):
    ph = [1] * (width + 1)
    for i in range(1, width + 1):
        ph[i] = ph[i - 1] * (height + 1) % MODULO
    pw = [1] * (height + 1)
    for i in range(1, height + 1):
        pw[i] = pw[i - 1] * (width + 1) % MODULO
    res = 0
    for common in range(min(height, width) + 1):
        ways = facts[height] * invfacts[common] % MODULO * invfacts[height - common] % MODULO
        ways = ways * facts[width] % MODULO * invfacts[width - common] % MODULO
        ways = ways * ph[width - common] % MODULO * pw[height - common] % MODULO
        if common % 2 == 0:
            res += ways
        else:
            res -= ways
    res %= MODULO
    if res < 0:
        res += MODULO
    return res

def main():
    height = int(input())
    width = int(input())
    print(solve(height, width))

if __name__ == "__main__":
    sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding='utf-8')
    sys.stdin = io.TextIOWrapper(sys.stdin.buffer, encoding='utf-8')
    sys.setrecursionlimit(10**6)
    max_n = 500000
    invs = [0] * (max_n + 2)
    invs[1] = 1
    for i in range(2, max_n + 2):
        invs[i] = ((MODULO - (MODULO // i) * invs[MODULO % i] % MODULO) % MODULO)
    facts = [0] * (max_n + 2)
    invfacts = [0] * (max_n + 2)
    facts[0] = 1
    invfacts[0] = 1
    for i in range(1, max_n + 2):
        facts[i] = (facts[i - 1] * i % MODULO)
        invfacts[i] = (invfacts[i - 1] * invs[i] % MODULO)
    main()
```

This Python code is equivalent to the Java code you provided. It uses the same logic to calculate the number of ways to place two types of blocks in a grid, but it uses Python's built-in input/output functions and list comprehensions instead of Java's.<｜end▁of▁sentence｜>
