Here's the translated code from Java to Python:

```python
import math

a = int(input())
b = int(input())
tmp1 = float(input())
tmp2 = float(input())

h = tmp1 / 6. * math.pi + tmp2 / 30. * math.pi / 12.
m = tmp2 / 30. * math.pi + tmp1 / 6. * math.pi * 12.
rad = h - m

res = math.sqrt(a**2 + b**2 - (2. * a * b * math.cos(rad)))

print(res)
```

A couple of observations regarding the translation:

- The `Scanner` class from Java for user input is typically substituted with `input()` in Python.
- The `Math` library calls in Java are replaced with the `math` module in Python.
- Python uses `**` for exponentiation instead of `Math.pow`.
- The `System.out.println` call in Java to print to the console is replaced with the `print()` function in Python.
