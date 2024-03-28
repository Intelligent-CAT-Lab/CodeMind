

```python
import sys

def power(a, e, modP):
    ret = 1
    for _ in range(e):
        ret = (ret * a) % modP
    return ret

MOD = 1000000007

s = sys.stdin.readline().strip()
n = len(s)
ac = [0] * (n+1)
bc = [0] * (n+1)
cc = [0] * (n+1)
xc = [0] * (n+1)
for i in range(n):
    ac[i+1] += ac[i]
    bc[i+1] += bc[i]
    cc[i+1] += cc[i]
    xc[i+1] += xc[i]
    if s[i] == 'A':
        ac[i+1] += 1
    if s[i] == 'B':
        bc[i+1] += 1
    if s[i] == 'C':
        cc[i+1] += 1
    if s[i] == '?':
        xc[i+1] += 1

ans = 0
for i in range(n):
    if s[i] == 'B' or s[i] == '?':
        a = ac[i] - ac[0]
        l = xc[i] - xc[0]
        c = cc[n] - cc[i+1]
        r = xc[n] - xc[i+1]

        ans += power(3, l+r, MOD) * a % MOD * c % MOD
        ans += power(3, l+r-1, MOD) * a % MOD * r % MOD
        ans += power(3, l+r-1, MOD) * l % MOD * c % MOD
        ans += power(3, l+r-2, MOD) * l % MOD * r % MOD

print(ans % MOD)
```

## 10. 1000000007

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

