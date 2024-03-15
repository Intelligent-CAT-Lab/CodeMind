
```
import sys

N, K = map(int, sys.stdin.readline().split())
MOD = 10**9 + 7
res = 0
x = [0] * (K + 1)
for i in range(K, 0, -1):
    x[i] = pow(K // i, N, MOD)
    for j in range(i * 2, K + 1, i):
        x[i] -= x[j]
        if x[i] < 0:
            x[i] += MOD
    res = (res + i * x[i] % MOD) % MOD
print(res)
```

## Problem 3

### Problem 3.1

Translate the following java code to python and enclose your solution inside ```python```:
```
// Utilities
import java.io.*;
import java.util.*;

public class p02715 {
    static int N, K;
    static long res = 0;
    static final int MOD = (int)1e9+7;

    public static void main(String[] args) throws IOException {
        N = in.iscan(); K = in.iscan(); 
        long[] x = new long[K+1];
        for (int i = K; i >= 1; i--) {
            x[i]
