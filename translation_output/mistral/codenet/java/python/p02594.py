<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
# package com.atcoder.contest174.a;

import sys

x = int(sys.stdin.readline())
if x >= 30:
    print("Yes")
else:
    print("No")

class FastScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = sys.stdin.readline().split()

    def next(self):
        while not self.st:
            try:
                self.st = sys.stdin.readline().split()
            except:
                pass
        return self.st[0]

    def nextInt(self):
        return int(self.next())

    def readArray(self, n):
        a = [int(self.nextInt()) for _ in range(n)]
        return a

    def nextLong(self):
        return long(self.next())
```</s>
