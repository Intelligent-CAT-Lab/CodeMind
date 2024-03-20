

```python
import math

n, m, a, b, p, q = map(int, input().split())
INF = 1000_000_000_000_000
if a == 1 and b == 1:
    div = m // (p + q)
    div = min(div, n)
    ans = min(abs(div * (p + q) - m), abs((div + 1) * (p + q) - m))
    print(ans)
    exit()

lim = 0
while p * pow(a, lim) + q * pow(b, lim) <= m:
    lim += 1

lim = min(lim, n)
lim = min(lim, 40)

pending1 = []
pending2 = []

powA = [1] * 42
powB = [1] * 42

for i in range(1, 42):
    powA[i] = powA[i - 1] * a
    powB[i] = powB[i - 1] * b

for t in range(2):
    max_ = lim // 2 if t == 0 else (lim + 1) // 2
    for i in range(1 << max_):
        s = 0
        for j in range(max_):
            if (i & (1 << j)) > 0:
                s += p * powA[j + (lim // 2 if t == 1 else 0)] + q * powB[j + (lim // 2 if t == 1 else 0)]
                if s > INF:
                    break
        if t == 0:
            pending1.append(s)
        else:
            pending2.append(s)

pending1.sort()
pending2.sort()

ans = m
for j in range(2):
    t = len(pending2) - 1
    for i in range(len(pending1)):
        if j == 0:
            while t > 0 and pending1[i] + pending2[t] > m:
                t -= 1
        else:
            while t > 0 and pending1[i] + pending2[t] >= m and pending1[i] + pending2[t - 1] >= m:
                t -= 1
        ans = min(ans, abs(-m + pending1[i] + pending2[t]))

print(ans)
```

## p01357

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10 10 10

Expected output:
10

```
import java.util.*;

public class p01357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; ++i) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int j = Arrays.binarySearch(b, a[i] + k);
            if (j < 0)
                j = -j - 1;
            if (j < m && b[j] <= a[i] + l) {
                ++ans;
            }
        }
        System.out.println(ans);
    }

    static void tr(Object... objects) {
    
