<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
//package com.atcoder.contest174.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p02594 {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int x = fs.nextInt();
        if(x >= 30) System.out.println("Yes");
        else System.out.println("No");
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}

```

### Response:
```python
class FastScanner:
    import sys
    import string
    import _io

    def __init__(self, inp=sys.stdin):
        self.ip = inp
        self.st = ""

    def next(self):
        while True:
            if self.st == "":
                self.st = self.ip.readline()
            res = ""
            for ch in self.st:
                if ch in string.whitespace:
                    if res != "":
                        self.st = self.st[len(res) + 1 :]
                        return res
                else:
                    res += ch
            self.st = ""

    def nextInt(self):
        return int(self.next())

    def readArray(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.nextInt()
        return a

    def nextLong(self):
        return long(self.next())


def main():
    fs = FastScanner()
    x = fs.nextInt()
    if x >= 30:
        print("Yes")
    else:
        print("No")


if __name__ == "__main__":
    main()
```

Please note that Python does not have a built-in equivalent to Java's `long` type. The `long` type is available in Python 2.x, but in Python 3.x, you should use `int` instead. If you're using Python 3.x, replace `long` with `int` in the code.
<|EOT|>
