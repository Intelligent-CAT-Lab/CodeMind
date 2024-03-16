<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

def solve(test_number, in, out):
    zeroes = in.readline().strip().split()[0]
    ones = in.readline().strip().split()[0]
    k = int(in.readline().strip().split()[0])
    depth = (int(zeroes) + int(ones) - 1) // (k-1)
    ways = [0] * (int(ones) + 1)
    ways[0] = 1
    res = 0
    nice = [False] * (int(ones) + 1)
    for i in range(1, depth+1):
        nice = [False] * (int(ones) + 1)
        for extra in range(i, depth+1):
            now = int(ones) - extra * (k-1)
            if now >= 0:
                nice[now] = True
        for old in range(int(ones), -1, -1):
            if ways[old] != 0:
                for cur in range(1, k and old+cur <= int(ones)):
                    if nice[old+cur]:
                        res += ways[old]
                        if res >= 10**9:
                            res %= 10**9
                    ways[old+cur] += ways[old]
                    if ways[old+cur] >= 10**9:
                        ways[old+cur] %= 10**9
    out.write(str(res) + "\n")

def main():
    in = sys.stdin
    out = sys.stdout
    test_number = int(input())
    solve(test_number, in, out)

if __name__ == "__main__":
    main()
```</s>
