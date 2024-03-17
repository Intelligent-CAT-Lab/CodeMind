<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
25

Expected output:
No


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
        while not self.st:
            self.st = self.ip.readline().split()
        return self.st.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())


fs = FastScanner()
x = fs.nextInt()
if x >= 30:
    print("Yes")
else:
    print("No")
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, checks if it is greater than or equal to 30, and prints "Yes" if it is, "No" otherwise. The FastScanner class is a Python equivalent of the FastScanner class in the Java code, which is used to read integers from the standard input.
<|EOT|>
