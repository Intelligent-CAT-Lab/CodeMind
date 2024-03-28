Here's the translated Python code. I have used the `math` module which provides a function `gcd` (for calculating the Greatest Common Divisor) instead of implementing the algorithm manually, as it's a common practice in Python to use built-in functions for common operations.

```python
import math

def p00356(x, y):
    gcd = math.gcd(x, y)
    m = x + y - gcd
    
    if x % 2 == 0 or y % 2 == 0 or x == y or (x % 2 > 0 and y % 2 > 0):
        return m + 1
    else:
        return m

# Test input:
x, y = map(int, input().split())

# Expected output:
print(p00356(x, y))
```

Make sure to run the code with the provided test input to get the expected output. The `input().split()` function will split the standard input and `map(int, ...)` will convert each part to an integer. The test input is then passed to the `p00356` function which performs the operations and returns the result that is printed out.
