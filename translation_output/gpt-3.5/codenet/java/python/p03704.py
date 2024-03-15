```python
import io
import sys
import math
import array
import os

input = io.BytesIO(os.read(0, os.fstat(0).st_size)).readline

def solve():
    D = nl()
    ans = 0
    for length in range(len(str(D)), 19):
        res = dfs(D, 0, length)
        ans += res
    print(ans)

def dfs(rem, pos, length):
    if length - pos - 1 < pos:
        return 1 if rem == 0 else 0
    if pos == length - 1 - pos:
        return 10 if rem == 0 else 0

    d = 1
    for i in range(1, length - pos):
        d *= 10
    dm = 1
    for i in range(1, pos + 1):
        dm *= 10
    d -= dm

    if abs(rem) >= 10 * d:
        return 0

    ret = 0
    for i in range(-9, 10):
        if pos == 0 and i >= 0:
            ret += dfs(rem - d * i, pos + 1, length) * (9 - abs(i))
        else:
            ret += dfs(rem - d * i, pos + 1, length) * (10 - abs(i))

    return ret

def main():
    solve()

if __name__ == '__main__':
    main()
```

