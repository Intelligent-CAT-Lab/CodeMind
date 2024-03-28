
```
import sys

P = 998244353

def go(s):
    if len(s) == 0:
        return 1
    if s in map:
        return map[s]
    ret = (1 + int(s[0])) * go(s[1:]) % P
    for x in range(1, len(s) // 2 + 1):
        buf = list(s[:x])
        for k in range(2, len(s) // x + 1):
            for i in range(x):
                if s[x * (k - 1) + i] == '0':
                    buf[i] = '0'
            ret += go(''.join(buf)) * go(s[x * k:]) % P
    map[s] = ret
    return ret

map = {}
s = sys.stdin.readline().strip()
print(go(s))
```

## 03468 - 03468.py

[03468 - 03468.py](https://github.com/StevenWang2014/Leetcode/blob/master/03468%20-%2003468.py)

```
import sys

def solve(n, m, a, b):
    if n == 1:
        return 0
    if m == 1:
        return 0
    if n == 2:
        if a == 1 and b == 1:
            return 0
        if a == 1 and b == 2:
            return 1
        if a == 2 and b == 1:
            return 1
        if a == 2 and b == 2:
            return 0
    if m == 2:
        if a == 1 and b == 1:
            return 0
        if a == 1 and b == 2:
            return 1
        if a == 2 and b == 1:
            return 1
        if a == 2 and b == 2:
            return 0
    if a == 1 and b == 1:
        return 0
    if a == 1 and b == 2:
        return 1
    if a == 2 and b == 1:
        return 1
    if a == 2 and b == 2:
        return 0

n, m = map(int, sys.stdin.readline().strip().split())
a, b = map(int, sys.stdin.readline().strip().split())
print(solve(n, m, a, b))
```

## 03469 - 03469.py

[03469 - 03469.py](https://github.com/StevenWang2014/Leetcode/blob/master/03469%20-%2003469.py)

```
import sys

def solve(n, m, a, b):
    if n == 1:
        return 0
    if m == 1:
        return 0
    if n == 2:
        if a == 1 and b == 1:
            return 0
        if a == 1 and b == 2:
            return 1
        if a == 2 and b == 1:
            return 1
        if a == 2 and b == 2:
            return 0
    if m == 2:
        if a == 1 and b == 1:
            return 0
        if a == 1 and b == 2:
            return 1
        if a == 2 and b == 1:
            return 1
        if a == 2 and b == 2:
            return 0
    if a == 1 and b == 1:
        return 0
    if a == 1 and b == 2:
        return 1
    if a == 2 and b == 1:
        return 1
    if a == 2 and b == 2:
        return 0

n, m = map(int, sys.stdin.readline().strip().split())
a, b = map(int, sys.stdin.readline().strip().split())
print(solve(n, m, a, b))
```

## 03470 - 03470.py

[03470 - 03470.py](https://github.com/StevenWang2014/Leetcode/blob/master/03470%20-%2003470.py)

```
import sys

def solve(n, m, a, b):
    if n == 1:
        return 0
    if m == 1:
        return 0
    if n == 2:
        if a == 1 and b == 1:
            return 0
        if a == 1 and b == 2:
            return 1
        if a == 2 and b == 1:
            return 1
        if a == 2 and b == 2:
            return 0
    if m == 2:
        if a == 1 and b == 1:
            return 0
        if a == 1 and b == 2:
            return 1
        if a == 2 and b == 1:
            return 1
        if a == 2 and b == 2:
            return 0
    if a == 1 and b == 1:
        return 0
    if a == 1 and b == 2:
        return 1
    if a == 2 and b == 1:
        return 1
    if a == 2 and b == 2:
        return 0

n, m = map(int, sys.stdin.readline().strip().split())
a, b = map(
