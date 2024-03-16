```python
import math

a, n, m = map(int, input().split())
max_val = int(math.pow(m, 1/n))

ans = 0
for i in range(1, max_val + 1):
    x = int(math.pow(i, n))
    str_x = str(x)
    y = sum(int(digit) for digit in str_x)
    
    if y + a == i:
        ans += 1

print(ans)
```
