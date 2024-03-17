<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class FastScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = sys.stdin.readline()

    def next(self):
        while not self.st.hasMoreTokens():
            try:
                self.st = self.br.readline()
            except IOError:
                print("Error reading from input stream")
                return None
        return self.st.nextToken()

    def nextInt(self):
        return int(self.next())

    def readArray(self, n):
        a = []
        for i in range(n):
            a.append(self.nextInt())
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
Note that the `FastScanner` class in Python is similar to the `FastScanner` class in Java, but it uses the `sys.stdin` and `sys.stdin.readline()` methods to read input from the standard input stream. The `next()` method in Python is similar to the `next()` method in Java, but it uses the `hasMoreTokens()` method to check if there are more tokens in the input stream. The `nextInt()` and `nextLong()` methods in Python are similar to the `nextInt()` and `nextLong()` methods in Java, but they use the `int()` and `long()` functions to convert the input to integers and long integers, respectively. The `readArray()` method in Python is similar to the `readArray()` method in Java, but it uses a list comprehension to create the array.</s>
