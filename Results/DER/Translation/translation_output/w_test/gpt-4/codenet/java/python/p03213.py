The equivalent Python code is shown below:

```python
import math
from collections import defaultdict

def factorization(n):
    list = []
    tmp = n
    for i in range(2, int(math.sqrt(n)) + 1):
        if tmp % i == 0:
            cnt = 0
            while tmp % i == 0:
                cnt += 1
                tmp //= i
            x = (i, cnt)
            list.append(x)
            
    if tmp != 1:
        x = (tmp, 1)
        list.append(x)

    if len(list) == 0:
        x = (n, 1)
        list.append(x)
        
    return list

def add_map(x, y, map):
    map[x] += y

N = int(input())
map = defaultdict(int)

for i in range(2, N+1):
    list = factorization(i)
    for array in list:
        add_map(array[0], array[1], map)

values = sorted(map.values(), reverse=True)
ans = 0

for i in range(len(values)):
    if values[i] >= 74:
        ans += 1

for i in range(len(values)):
    if values[i] >= 24:
        for j in range(len(values)):
            if i == j:
                continue
            if values[j] >= 2:
                ans += 1

for i in range(len(values)):
    if values[i] >= 14:
        for j in range(len(values)):
            if i == j:
                continue
            if values[j] >= 4:
                ans += 1

for i in range(len(values)):
    if values[i] >= 4:
        for j in range(i+1, len(values)):
            if values[j] >= 4:
                for k in range(len(values)):
                    if i == k or j == k:
                        continue
                    if values[k] >= 2:
                        ans += 1

print(ans)
```

The provided Java code uses a static method and a static hashmap; however, those concepts don't directly translate to Python and are not necessarily Pythonic. Instead, I've used a regular function and a local variable inside the code block to mirror the hashmap behavior, using Python's `defaultdict` for convenience. The iteration logic, function names, and basic structure have been kept intact, making some necessary adjustments to align with Python syntax.
