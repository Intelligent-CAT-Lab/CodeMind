Here's the translated code from Java to Python:

```python
import math

def atcoder_ABC168_C(a, b, tmp1, tmp2):
    h = tmp1 / 6. * math.pi + tmp2 / 30. * math.pi / 12.
    m = tmp2 / 30. * math.pi + tmp1 / 6. * math.pi * 12.
    rad = h - m
    
    res = math.sqrt(a**2 + b**2 - 2. * a * b * math.cos(rad))
    return res

# Test input
inputs = input().split()
a = int(inputs[0])
b = int(inputs[1])
tmp1 = float(inputs[2])
tmp2 = float(inputs[3])

# Expected output
print(atcoder_ABC168_C(a, b, tmp1, tmp2))
```

This Python function `atcoder_ABC168_C` calculates the result in the same way as the given Java code and uses the built-in `math` library for mathematical operations such as `sqrt`, `pow`, and `cos`. The `print` function is used to output the result, as in the Java code provided.

If you need the test case provided to be specifically included in the example, you can do so by replacing the `input().split()` statement with the specific test input, but the above example shows how to take user input from the command line in Python.
