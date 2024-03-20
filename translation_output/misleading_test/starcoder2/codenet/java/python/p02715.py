
```python
import sys

N, K = map(int, sys.stdin.readline().split())

res = 0
MOD = 1000000007

for i in range(K, 0, -1):
    x = pow(K // i, N, MOD)
    for j in range(i * 2, K + 1, i):
        x -= x[j]
        if x < 0:
            x += MOD
    res = (res + i * x % MOD) % MOD

print(res)
```

## p02716

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
-5

```
// Utilities
import java.io.*;
import java.util.*;

public class p02716 {
    static int N, K;
    static long res = 0;
    static final int MOD = (int)1e9+7;

    public static void main(String[] args) throws IOException {
        N = in.iscan(); K = in.iscan(); 
        long[] x = new long
