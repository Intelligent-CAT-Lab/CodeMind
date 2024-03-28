<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
class FastReader:
    import sys
    import io
    def __init__(self, s=None):
        if s is None or len(s) == 0:
            self.s = sys.stdin.read().lstrip().rstrip()
        else:
            self.s = s.lstrip().rstrip()
        self.chars = iter(self.s)

    def next(self):
        while True:
            c = next(self.chars, None)
            if c is not None and c != ' ':
                return c

    def readArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

def codeforces_669_A(n):
    if n == 2:
        return 1
    total = 0
    while n > 0:
        n -= 1
        if n > 0:
            total += 1
            n -= 2
        total += 1
    return total

fr = FastReader()
n = fr.nextInt()
print(codeforces_669_A(n))
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, and then prints the result of the `codeforces_669_A` function. The `codeforces_669_A` function calculates the number of steps needed to reduce the input number to 1, according to the rules of the problem. The `FastReader` class is used to read the input and convert it to integers.
<|EOT|>
