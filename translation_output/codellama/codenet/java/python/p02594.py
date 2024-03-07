<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

class FastScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = sys.stdin.readline().split()

    def next(self):
        while not self.st:
            self.st = self.br.readline().split()
        return self.st.pop(0)

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
This is the equivalent Python code for the given Java code. The `FastScanner` class is used to read input from the standard input stream, and the `main` function is used to read the input and print the output. The `readArray` method is used to read an array of integers from the input. The `nextInt` and `nextLong` methods are used to read integers and long integers from the input, respectively.</s>
