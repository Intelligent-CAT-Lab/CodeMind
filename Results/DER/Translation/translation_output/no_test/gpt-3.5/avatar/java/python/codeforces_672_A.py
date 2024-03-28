```python
import sys

n = int(input())

s = ""
for i in range(1, n+1):
    s += str(i)

if n <= 9:
    print(s[n - 1])
else:
    print(s[len(s)-1])
```
