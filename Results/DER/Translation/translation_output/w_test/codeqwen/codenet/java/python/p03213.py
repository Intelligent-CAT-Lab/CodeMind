Here is the Python version of the Java code:

```python
import math

def factorization(n):
    list_ = []
    tmp = n
    for i in range(2, int(math.sqrt(n)) + 1):
        if tmp % i == 0:
            cnt = 0
            while tmp % i == 0:
                cnt += 1
                tmp /= i
            list_.append([i, cnt])
    if tmp != 1:
        list_.append([tmp, 1])

    if len(list_) == 0:
        list_.append([n, 1])
    return list_

def add_map(x, y):
    if x in map:
        map[x] += y
    else:
        map[x] = y

map_ = {}
N = int(input())
for i in range(2, N + 1):
    list_ = factorization(i)
    for array in list_:
        add_map(array[0], array[1])

values = list(map_.values())
values.sort(reverse=True)
ans = 0
for i in range(len(values)):
    if values[i] >= 74:
        ans += 1
    if values[i] >= 24:
        for j in range(len(values)):
            if i == j:
                continue
            if values[j] >= 2:
                ans += 1
    if values[i] >= 14:
        for j in range(len(values)):
            if i == j:
                continue
            if values[j] >= 4:
                ans += 1
    if values[i] >= 4:
        for j in range(i + 1, len(values)):
            if values[j] >= 4:
                for k in range(len(values)):
                    if i == k or j == k:
                        continue
                    if values[k] >= 2:
                        ans += 1
print(ans)
```

This Python code does the same thing as the Java code. It
