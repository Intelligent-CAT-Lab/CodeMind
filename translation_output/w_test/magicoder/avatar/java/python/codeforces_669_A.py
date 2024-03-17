<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
class FastReader:
    def __init__(self):
        self.br = open(0, 'r')

    def next(self):
        return self.br.readline().strip()

    def nextInt(self):
        return int(self.next())

def codeforces_669_A(n):
    total = 0
    if n == 2:
        return 1
    while n > 0:
        n -= 1
        if n > 0:
            if n >= 2:
                total += 1
            n -= 2
        total += 1
    return total

if __name__ == "__main__":
    fr = FastReader()
    n = fr.nextInt()
    print(codeforces_669_A(n))
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, and then calls the `codeforces_669_A` function with this integer as the argument. The `codeforces_669_A` function calculates the total number of operations needed to reduce the input number to 1, and then returns this value. The result is then printed to the standard output.<｜end▁of▁sentence｜>
