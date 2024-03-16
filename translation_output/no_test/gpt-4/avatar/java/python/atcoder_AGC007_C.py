Here is the translated Python code:

```python
from decimal import Decimal, getcontext

# Set precision for Decimal
getcontext().prec = 50

# Read inputs
N = float(input())
d = Decimal(input())
x = Decimal(input())

ans = Decimal('0.0')

while N > 0.5:
    adnum = Decimal(d + x * (N - 0.5))
    ans += adnum
    d = (N + 1.0) * d / N + (5.0 * x) / (2.0 * N)
    x = (1.0 + (2.0 / N)) * x
    N -= 1

# Format and output the result
formatted_ans = "{:.20f}".format(ans)
print(formatted_ans)
```

Note that the `Decimal` class is used from Python's `decimal` module to handle arbitrary-precision arithmetic, similar to `BigDecimal` in Java. The `getcontext().prec = 50` specifies the precision for arithmetic operations using `Decimal`. The formatting of the output is done using the `format()` method for strings to ensure 20 decimal places in the output.
