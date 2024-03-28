

```python
import math

n, w = map(int, input().split())

flag = [False] * (n + 1)
count = [0] * (n + 1)
sum = 0
left = 1
right = w + 1

for i in range(1, w):
    for k in range(1, int(math.sqrt(i)) + 1):
        if i % k == 0:
            count[k] += 1
            update(k)
            if i // k != k:
                count[i // k] += 1
                update(i // k)

for i in range(0, n - w + 1):
    left = i + 1
    right = i + w + 1
    for k in range(1, int(math.sqrt(i)) + 1):
        if i % k == 0:
            count[k] -= 1
            update(k)
            if i // k != k:
                count[i // k] -= 1
                update(i // k)
    for k in range(1, int(math.sqrt(i + w)) + 1):
        if (i + w) % k == 0:
            count[k] += 1
            update(k)
            if (i + w) // k != k:
                count[(i + w) // k] += 1
                update((i + w) // k)
    update(left - 1)
    update(right - 1)
    print(sum + (i < n - w and " " or "\n"), end="")

def update(i):
    det = left <= i and i < right
    if flag[i] and not det and count[i] < 2:
        flag[i] = False
        sum -= 1
    if not flag[i] and (det or count[i] >= 2):
        flag[i] = True
        sum += 1
```
/source/2011-10-25-poj-1004-financial-management.md
---
layout: post
title: "POJ 1004 Financial Management"
comments: true
category: ACM-ICPC

---

# 题目

> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 

