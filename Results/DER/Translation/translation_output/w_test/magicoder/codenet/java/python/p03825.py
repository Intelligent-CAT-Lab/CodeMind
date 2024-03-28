<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2 2

Expected output:
5


```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class p03825 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        static final int MODULO = (int) (1e9 + 7);

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int zeroes = in.nextInt();
            int ones = in.nextInt();
            int k = in.nextInt();
            int depth = (zeroes + ones - 1) / (k - 1);
            int[] ways = new int[ones + 1];
            ways[0] = 1;
            long res = 0;
            boolean[] nice = new boolean[ones + 1];
            for (int i = 1; i <= depth; ++i) {
                Arrays.fill(nice, false);
                for (int extra = 0; i + extra <= depth; ++extra) {
                    int now = ones - extra * (k - 1);
                    if (now >= 0) {
                        nice[now] = true;
                    }
                }
                for (int old = ones; old >= 0; --old)
                    if (ways[old] != 0) {
                        for (int cur = 1; cur < k && old + cur <= ones; ++cur) {
                            if (nice[old + cur]) {
                                res += ways[old];
                                if (res >= MODULO) res -= MODULO;
                            }
                            ways[old + cur] += ways[old];
                            if (ways[old + cur] >= MODULO) ways[old + cur] -= MODULO;
                        }
                    }
            }
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

MODULO = int(1e9 + 7)

def solve(zeroes, ones, k):
    depth = (zeroes + ones - 1) // (k - 1)
    ways = [0] * (ones + 1)
    ways[0] = 1
    res = 0
    nice = [False] * (ones + 1)
    for i in range(1, depth + 1):
        nice = [False] * (ones + 1)
        for extra in range(i, depth + 1, k - 1):
            now = ones - (extra - i) * (k - 1)
            if now >= 0:
                nice[now] = True
        for old in range(ones, -1, -1):
            if ways[old] != 0:
                for cur in range(1, k):
                    if old + cur <= ones and nice[old + cur]:
                        res += ways[old]
                        if res >= MODULO:
                            res -= MODULO
                    ways[old + cur] += ways[old]
                    if ways[old + cur] >= MODULO:
                        ways[old + cur] -= MODULO
    return res

if __name__ == "__main__":
    zeroes, ones, k = map(int, sys.stdin.readline().split())
    print(solve(zeroes, ones, k))
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calls the `solve` function with these integers, and then prints the result. The `solve` function calculates the result according to the problem's rules.<｜end▁of▁sentence｜>
