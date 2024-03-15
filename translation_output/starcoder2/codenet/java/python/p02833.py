
```
import sys

n = int(sys.stdin.readline())
if n % 2 == 1:
    print(0)
    exit()

ans = 0
base = 10
while True:
    if base > n:
        break
    ans += n // base
    base *= 5
print(ans)
```

## 02834 - 1000000007

### 题目描述

给定一个整数n，求n! mod 1000000007的值。

