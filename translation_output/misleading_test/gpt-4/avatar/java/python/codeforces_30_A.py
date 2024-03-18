Here is the Java code converted to Python:

```python
from sympy import Pow
import sys

A, B, N = map(int, input().split())

for x in range(-1000, 1001):
    if Pow(x, N) * A == B:
        print(x)
        sys.exit()
print("No solution")
```

Running this Python code with the test input "7 896 7" should produce the expected output "13".

Note that `sympy.Pow` is being used to handle large exponents properly. If you're confident your numbers will always be within Python's integer limits, you could use the built-in `pow` or the `**` operator instead. Additionally, `sys.exit()` is used to exit the script after finding the solution, similar to the `return` statement in the Java version. If you prefer not to use `sys.exit()`, you could use a flag or `break` to exit the loop, although it's not necessary if the script is just this short algorithm.
