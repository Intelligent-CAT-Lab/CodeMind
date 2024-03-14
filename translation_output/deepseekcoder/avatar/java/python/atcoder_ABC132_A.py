<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class atcoder_ABC132_A {
    private static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        String s = sc.next();
        Set<String> chars = new HashSet<>();
        chars.addAll(Arrays.asList(s.split(" ")));
        if (chars.size() == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

### Response:
```python
import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.tokens = None

    def next(self):
        self.tokens = self.inp.readline().split()
        return self.tokens[0]

    def next_int(self):
        return int(self.next())

    def next_line(self):
        return self.inp.readline().strip()

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())

    def next_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

def main():
    sc = FastScanner()
    s = sc.next_line()
    words = set(s.split())
    if len(words) == 2:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
<|EOT|>
