System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
aaaa

Expected output:
87

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
public class p03258 {
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
        static final long MODULO = (long) (1e9 + 7);

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.next();
            boolean alternating = true;
            for (int i = 0; i + 1 < s.length(); ++i) if (s.charAt(i) == s.charAt(i + 1)) alternating = false;
            if (alternating) {
                out.println(1);
                return;
            }
            int[] sum = new int[s.length() + 1];
            for (int i = 0; i < s.length(); ++i) {
                sum[i + 1] = sum[i];
                if (s.charAt(i) == 'a')
                    sum[i + 1] += 1;
                else if (s.charAt(i) == 'b')
                    sum[i + 1] += 2;
                else
                    throw new RuntimeException();
                sum[i + 1] %= 3;
            }
            int[][] next = new int[3][s.length() + 2];
            for (int i = 0; i < 3; ++i) {
                next[i][s.length() + 1] = s.length() + 1;
            }
            for (int pos = s.length(); pos >= 0; --pos) {
                for (int i = 0; i < 3; ++i) {
                    next[i][pos] = next[i][pos + 1];
                }
                next[sum[pos]][pos] = pos;
            }
            int total = sum[s.length()];
            long[] ways = new long[s.length() + 2];
            ways[0] = 1;
            for (int i = 0; i <= s.length(); ++i) {
                int need = (sum[i] + 1) % 3;
                ways[next[need][i]] += ways[i];
                ways[next[need][i]] %= MODULO;
                need = (sum[i] + 2) % 3;
                ways[next[need][i]] += ways[i];
                ways[next[need][i]] %= MODULO;
            }
            long res = 0;
            for (int i = 1; i <= s.length(); ++i)
                if (sum[i] == total) {
                    res = (res + ways[i]) % MODULO;
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
            while (tokenizer == null ||!tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

    }
}


```


Answer:
```python
MODULO = 100000007

def solve(s):
    n = len(s)
    if all(c == s[0] for c in s):
        return 1
    prefix_sum = [0] * (n + 1)
    for i in range(n):
        prefix_sum[i + 1] = prefix_sum[i]
        if s[i] == 'a':
            prefix_sum[i + 1] += 1
        elif s[i] == 'b':
            prefix_sum[i + 1] += 2
        else:
            raise Exception()
        prefix_sum[i + 1] %= 3
    next_pos = [[n + 1] * 3 for _ in range(n + 2)]
    for pos in range(n, -1, -1):
        for i in range(3):
            next_pos[pos][i] = next_pos[pos + 1][i]
        next_pos[pos][prefix_sum[pos]] = pos
    total_sum = prefix_sum[-1]
    ways = [0] * (n + 2)
    ways[0] = 1
    for i in range(n + 1):
        need = (prefix_sum[i] + 1) % 3
        ways[next_pos[i][need]] += ways[i]
        ways[next_pos[i][need]] %= MODULO
        need = (prefix_sum[i] + 2) % 3
        ways[next_pos[i][need]] += ways[i]
        ways[next_pos[i][need]] %= MODULO
    res = 0
    for i in range(1, n + 1):
        if prefix_sum[i] == total_sum:
            res = (res + ways[i]) % MODULO
    return res

print(solve(input()))
```<|endoftext|>
