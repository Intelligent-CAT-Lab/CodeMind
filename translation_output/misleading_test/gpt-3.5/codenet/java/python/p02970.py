```python
from decimal import Decimal, ROUND_CEILING

N, D = map(int, input().split())
ans = Decimal(N / (D * 2 + 1.0))
ans = ans.quantize(Decimal('1'), rounding=ROUND_CEILING)
print(ans)
```
