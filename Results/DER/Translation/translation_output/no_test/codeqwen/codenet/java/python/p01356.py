Here is the Python version of the Java code:

```python
import sys

def main():
    n = int(sys.stdin.readline())
    m = int(sys.stdin.readline())
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    p = int(sys.stdin.readline())
    q = int(sys.stdin.readline())
    INF = 1000000000000000
    if a == 1 and b == 1:
        # (p+q)N
        ans = INF
        div = m // (p + q)
        div = min(div, n)
        ans = min(ans, abs(div * (p + q) - m))
        div = min(div + 1, n)
        ans = min(ans, abs(div * (p + q) - m))
        print(ans)
        return
    # pa^k+qb^k
    lim = 0
    while p * pow(a, lim) + q * pow(b, lim) <= m:
        lim += 1
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
        max = (t == 0) * (lim // 2) + (t == 1) * ((lim + 1) // 2)
        for i in range(1 << max):
            s = 0
            for j in range(max):
                if (i & (1 << j)) > 0:
                    s += p * powA[j + (t == 1) * (lim // 2)] + q * powB[j + (t == 1) * (
