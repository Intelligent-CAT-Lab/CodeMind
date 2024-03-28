```python
from decimal import Decimal, getcontext

getcontext().prec = 25

N, d, x = map(float, input().split())

ans = Decimal(0.0)

while N > 0.5:
    adnum = Decimal(d + x * (N - 0.5))
    ans += adnum
    d = (N + 1.0) * d / N + (5.0 * x) / (2.0 * N)
    x = (1.0 + (2.0 / N)) * x
    N -= 1

print(f'{ans:.20f}')
```
