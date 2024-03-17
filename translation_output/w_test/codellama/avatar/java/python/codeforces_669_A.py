<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
999999991

Expected output:
666666661


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_669_A {
    public static void codeforces_669_A(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int sum = 0, total = 0, i = 1;
        if (n == 2) {
            System.out.println(1);
            return;
        }
        while (n > 0) {
            n -= 1;
            if (n > 0) {
                if (n >= 2) {
                    total++;
                }
                n -= 2;
            }
            total++;
        }
        System.out.println(total);
    }

    static class FastReader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(" ");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            return st.nextToken();
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        int nextInt() {
            return Integer.parseInt(next());
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

class FastReader:
    def __init__(self):
        self.br = sys.stdin
        self.st = sys.stdin.readline().split()

    def next(self):
        while not self.st:
            try:
                self.st = self.br.readline().split()
            except:
                pass
        return self.st.pop(0)

    def read_array(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.next_int()
        return a

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

def codeforces_669_A(args):
    fr = FastReader()
    n = fr.next_int()
    sum = 0
    total = 0
    i = 1
    if n == 2:
        print(1)
        return
    while n > 0:
        n -= 1
        if n > 0:
            if n >= 2:
                total += 1
            n -= 2
        total += 1
    print(total)

if __name__ == "__main__":
    codeforces_669_A(sys.argv[1:])
```
Note that the `FastReader` class is not necessary in Python, as the `sys.stdin` object can be used to read input from the console. The `read_array` method is also not necessary, as Python has built-in support for reading arrays from the console.</s>
