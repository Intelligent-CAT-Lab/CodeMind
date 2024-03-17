

```python
import sys

def calc(i, n, k):
    ret = 0
    p = 0
    for j in range(1, i - j + 1):
        if i - j <= k:
            p += 1
    l = k - 2 * p - (i % 2 == 0)
    for q in range(min(n, p) + 1):
        if l == 0 and q == 0:
            continue
        tmp = 1
