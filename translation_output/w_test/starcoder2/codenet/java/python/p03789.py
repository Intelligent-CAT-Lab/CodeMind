

```python
import math

def solve(N):
    n = len(N)
    bigint = int(N)
    bigint *= 9

    ok = n * 10
    ng = 0
    while math.fabs(ok - ng) > 1:
        med = (ok + ng) // 2
        if canMake(med, bigint):
            ok = med
        else:
            ng = med
    return (ok + 8) // 9

def canMake(n, bigint):
    bigint += n
    return digitSum(bigint) <= n

def digitSum(n):
    sum = 0
    while n >= 1:
        sum += n % 10
        n //= 10
    return sum

N = input()
print(solve(N))
```

## 03790 - 1000000007

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
// package agc.agc011;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class p03790 {
    static int MOD = 1000000007;

    static int solve(int N) {
        int[] dp = new int[N+1];
        dp[0] = 1;
        for (int i = 1; i <= N ; i++) {
            for (int j = 1; j <= 10 ; j++) {
                if (i - j >= 0) {
                    dp[i] += dp[i-j];
                    dp[i] %= MOD;
                }
            }
        }
        return dp[N];
    }

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();
        out.println(solve(N));
        out.flush();
    }

    public static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    public static class InputReader {
        private static final int BUFFER_LENGTH = 1 << 12;
        private InputStream stream;
        private byte[] buf = new byte[BUFFER_LENGTH];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int next() {
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
                if (numChars <= 0)
                    return -1;
            }
           
