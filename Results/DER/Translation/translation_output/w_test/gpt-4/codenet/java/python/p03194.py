```python
# Import math module for power function
import math

# Read input
n, p = map(int, input().split())

# Initialize result variable
res = 1

# Check for the case when n equals to 1
if n == 1:
    print(p)
else:
    # Loop through potential divisors
    for i in range(2, int(p ** (1/n)) + 1):
        # Check if i raised to n divides p exactly
        if p % (i ** n) == 0:
            res = i
    # Print the result
    print(res)
```

Here's how the given Java code translates to Python. Note that I used the `math` module only for commenting purposes, as we don't explicitly need to import it in Python to use the power function or any other simple arithmetic operation. The power operation `**` and integer division `//` are built-in operations in Python. The `input().split()` function reads a line of input and splits it on spaces by default, and `map(int, ...)` converts the split strings to integers.
