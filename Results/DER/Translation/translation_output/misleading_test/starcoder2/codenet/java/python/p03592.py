
```python
import sys

def main():
    N, M, K = map(int, sys.stdin.readline().split())
    for i in range(N + 1):
        for j in range(M + 1):
            if M * i + N * j - (i * j * 2) == K:
                print("Yes")
                return
    print("No")

if __name__ == "__main__":
    main()
```

## 03593

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10

```
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class p03593 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        sc.fill(a);

        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    private static boolean isDebug = System.getProperty("sun.desktop") != null;

    private static void debug(Object... o) {
        if (isDebug) {
            System.err.println(Arrays.deepToString(o));
        }
    }

    public static class Scanner {
        private BufferedInputStream inputStream;
        private StringBuilder buffer = new StringBuilder();

        public Scanner(InputStream in) {
            inputStream = new BufferedInputStream(in);
        }

        public int nextInt() throws IOException {
            int num = 0;
            int sign = 1;

            int read = skip();
            if (read == '-') {
                sign = -1;
                read = inputStream.read();
            }

            do {
                num = num * 10 + sign * (read - 0x30);
            } while ((read = inputStream.read()) > 0x20);

            return num;
        }

        public void fill(int[] a) throws IOException {
            for (int i = 0; i < a.length; i++) {
                a[i] = nextInt();
            }
        }

        public void fill(int[] a, int[] b) throws IOException {
            if (a.length != b.length) {
                throw new IllegalArgumentException();
            }

            for (int i = 0; i < a.length; i++) {
                a[i] = nextInt();
                b[i] = nextInt();
            }
        }

        public long nextLong() throws IOException {
            long num = 0;
            int sign = 1;

            int read = skip();
            if (read == '-') {
                sign = -1;
                read = inputStream.read();
            }

            do {
                num = num * 10 + sign * (read - 0x30);
            } while ((read = inputStream.read()) > 0x20);

            return num;
        }

        public void fill(long[] a) throws IOException {
            
