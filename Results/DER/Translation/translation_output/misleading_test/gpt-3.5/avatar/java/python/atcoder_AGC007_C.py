```python
from decimal import Decimal, getcontext

def atcoder_AGC007_C(N, d, x):
    getcontext().prec = 28
    ans = Decimal("0.0")
    
    N = Decimal(N)
    d = Decimal(d)
    x = Decimal(x)

    while N > Decimal("0.5"):
        adnum = d + x * (N - Decimal("0.5"))
        ans += adnum
        d = (N + Decimal("1.0")) * d / N + (Decimal("5.0") * x) / (Decimal("2.0") * N)
        x = (Decimal("1.0") + (Decimal("2.0") / N)) * x
        N -= 1

    formatted_ans = format(ans, "0.20f")
    return formatted_ans

# Test case
N, d, x = map(float, input().split())
result = atcoder_AGC007_C(N, d, x)
print(result)
```

