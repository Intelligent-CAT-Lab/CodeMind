
```
import sys

r = int(sys.stdin.readline())
d = int(sys.stdin.readline())
x = int(sys.stdin.readline())

for i in range(10):
    x = r * x - d
    print(x)

```

## C. 
### 题目大意
给定一个长度为n的数组，求出所有子数组中，和为k的子数组的个数。

### 解题思路

### 代码

java code:
```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author prakharjain
 */
public class p03037 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        CSubarraySum solver = new CSubarraySum();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSubarraySum {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            int k = in.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            int[] sum = new int[n + 1];

            for (int i = 0; i < n; i++) {
                sum[i + 1] = sum[i] + a[i];
            }

            int ans = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (sum[j] - sum[i] == k) {
                        ans++;
                    }
                }
            }

            out.println(ans);
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(int i) {
            writer.println(i);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}


```

python code:
```
import sys

n = int(sys.stdin.readline())
k = int(sys.stdin.readline())

a = [int(x) for x in sys.stdin.readline().split()]

sum = [0] * (n + 1)

for i in range(n):
    sum[i + 1] = sum[i] + a[i]

ans = 0

for i in range(n):
    for j in range(i + 1, n + 1):
        if sum[j] - sum[i] == k:
            ans += 1

print(ans)

```

## D. 
### 题目大意

### 解题
