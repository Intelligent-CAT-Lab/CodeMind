Here's the translation of the given Java code to Python:

```python
from decimal import Decimal, getcontext

getcontext().prec = 50  # Set precision for Decimal arithmetic

N, d, x = map(float, input().split())
ans = Decimal("0.0")

while N > 0.5:
    adnum = Decimal(d + x * (N - 0.5))
    ans += adnum
    d = (N + 1.0) * d / N + (5.0 * x) / (2.0 * N)
    x = (1.0 + (2.0 / N)) * x
    N -= 1

print(f"{ans:.20f}")
```

You can run this with the provided test input and expect the output mentioned:

Test input:
```
1000 100 100
```

Expected output:
```
649620206.0287690162658691406250000000
```
(Note: The exact format of the output may slightly vary due to differences in how Java and Python handle floating-point arithmetic and big decimal rounding.)
