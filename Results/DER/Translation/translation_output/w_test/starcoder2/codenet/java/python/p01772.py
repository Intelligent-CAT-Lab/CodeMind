

```python
import sys

def main():
    s = sys.stdin.readline().strip()
    s = ''.join([c for c in s if c == 'A' or c == 'Z'])
    s = ''.join([c for i, c in enumerate(s) if i == 0 or s[i - 1] != c])
    if s[0] == 'Z':
        s = s[1:]
    if s[-1] == 'A':
        s = s[:-1]
    if len(s) == 0:
        print(-1)
    else:
        print(s)

if __name__ == '__main__':
    main()
```

## 01773

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.io.IOException;
import java.util.InputMismatchException;

public class p01773 {
    void run() {
        MyScanner sc = new MyScanner();

        long n = sc.nextLong();
        long ans = 0;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                ans = Math.max(ans, i);
                ans = Math.max(ans, n / i);
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new p01773().run();
    }

    public void mapDebug(int[][] a) {
        System.out.println("--------map display---------");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%3d ", a[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------" + '\n');
    }

    class MyScanner {
        int read() {
            try {
                return System.in.read();
            } catch (IOException e) {
                throw new InputMismatchException();
            }
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        boolean isEndline(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
                array[i] = nextInt();
            return array;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++)
                array[i] = nextLong();
            return array;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        double[] nextDoubleArray(int n) {
            double[] array = new double[n];
            for (int i = 0; i < n; i++)
                array[i] = nextDouble();
            return array;
        }

        String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
        
