Here is the equivalent Python code:

```python
import math

N = int(input())
D = int(input())

ans = math.ceil(N / ((D * 2) + 1))
print(ans)
```

The Python code uses the `math.ceil` function to implement the rounding up to the nearest integer (ceiling), similar to `BigDecimal.setScale` with `RoundingMode.CEILING` in Java. Since Python's `int` division will automatically convert to a float when necessary (in contrast to Java where you have to cast one of the operands to `double` to get float division), no extra step for that is needed.
