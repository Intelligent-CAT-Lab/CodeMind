

```python
import math

n, m, k = map(int, input().split())

mod = 998244353

fact = [0] * (n + 1)
ifact = [0] * (n + 1)
fact[0] = fact[1] = ifact[0] = ifact[1] = 1

for i in range(1, n + 1):
    fact[i] = (fact[i - 1] * i) % mod
    ifact[i] = pow(fact[i], mod - 2, mod)

def ncr(n, r):
    return (fact[n] * ifact[r] * ifact[n - r]) % mod

ans = 0
for i in range(k + 1):
    ans = (ans + (m * pow(m - 1, n - i - 1, mod) * ncr(n - 1, i)) % mod) % mod

print(ans)
```

## Problem 3

### Problem 3.1

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2 1

Expected output:
-55

```
import java.io.*;
        import java.math.*;
        import java.util.*;
        import java.lang.*;

public class p02685 implements Runnable {
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try
