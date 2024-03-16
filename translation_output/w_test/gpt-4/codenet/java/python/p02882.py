Here's the Java code translated to Python:

```python
import math

def water_bottle(A, B, X):
    if X * 2 >= A * A * B:
        z = (A * A * B - X) / (A * A) * 2
        d = math.atan(z / A) * 180 / math.pi
    else:
        z = X / (A * B) * 2
        d = math.atan(B / z) * 180 / math.pi
    return d

# Test case
A, B, X = map(int, input().split())
result = water_bottle(A, B, X)
print(f"{result:.10f}")
```

You can use this code snippet in Python to achieve the same functionality as the provided Java code. This function reads three integers `A`, `B`, and `X`, performs the calculation as in the Java code, and prints the result with the format specified in the expected output.
