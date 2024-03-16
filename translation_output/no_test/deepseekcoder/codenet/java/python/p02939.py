<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.*;
import java.util.*;

class p02939 {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) throws IOException {
        char[] s = scanner.next().toCharArray();
        int n = s.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count++;
            if (i + 1 >= n) {
                break;
            }
            if (s[i] == s[i + 1]) {
                if (i + 2 >= n) {
                    break;
                }
                i += 2;
                count++;
            }
        }
        System.out.println(count);
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
}
```

### Response:
```python
import sys

class Scanner:
    def __init__(self):
        self.buf = sys.stdin.read().split()
        self.i = 0

    def next(self):
        if self.i < len(self.buf):
            res = self.buf[self.i]
            self.i += 1
            return res
        raise EOFError

    def next_int(self):
        return int(self.next())

    def next_char(self):
        return self.next()[0]


def solve():
    scanner = Scanner()
    s = scanner.next_char()
    n = len(s)
    count = 0
    i = 0
    while i < n:
        count += 1
        if i + 1 >= n:
            break
        if s[i] == s[i + 1]:
            if i + 2 >= n:
                break
            i += 2
            count += 1
        i += 1
    print(count)


if __name__ == "__main__":
    solve()
```
<|EOT|>
