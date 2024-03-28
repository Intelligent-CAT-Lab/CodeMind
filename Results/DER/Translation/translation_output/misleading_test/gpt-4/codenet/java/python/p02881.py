Here's the equivalent Python code for the given Java code:

```python
import math
import sys

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def solver(n):
    sqrt = int(math.sqrt(n))
    x = 0
    y = 0
    for i in range(sqrt, 0, -1):
        if n % i == 0:
            x = i
            y = n // i
            break
    
    if x != 0 and y != 0:
        ans = (x - 1) + (y - 1)
    else:
        ans = n - 1
    
    return ans

if __name__ == '__main__':
    n = int(input())
    result = solver(n)
    print(result)

# Test case
# Input: 10
# Expected output: 40
```

Ensure that you provide the input when prompted after running the script. This code accepts the input from `stdin`, processes it with the `solver()` function, and prints the result to `stdout`, following the logic of the original Java code.

Keep in mind that this Python script uses `/` for division which results in a float, and `//` for integer division, similar to Java's `/` operator when used with integers. Also, unlike Java, Python doesn't require explicit type casting to convert from a float to an integer, as the `int()` constructor does that.
