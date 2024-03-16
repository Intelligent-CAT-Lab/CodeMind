Here is the translated Java code into Python:

```python
import sys
import math
from itertools import product

# Assuming the input is provided via standard input (sys.stdin).
# In a real scenario you might want to wrap this code in a function
# and receive the parameters as arguments or read from file.

MOD = int(1e9+7)

def dfs(d, S1, S2, w, h):
    if w <= 0 or h <= 0:
        return float('inf')
    if d == 1:
        return max(S2, w * h) - min(S1, w * h)
    ans = float('inf')
    for i in range(-1, 2):
        dw = w // d + i
        dh = h // d + i
        if dw > 0:
            ans = min(ans, dfs(d - 1, min(S1, dw * h), max(S2, dw * h), w - dw, h))
        if dh > 0:
            ans = min(ans, dfs(d - 1, min(S1, w * dh), max(S2, w * dh), w, h - dh))
    return ans

def main():
    h, w = map(int, sys.stdin.readline().split())
    print(dfs(3, float('inf'), float('-inf'), w, h))

if __name__ == "__main__":
    main()
```

This Python code expects the input to be provided via standard input. It calculates the result by calling the `dfs` function with initially passed parameters and prints the output to the standard output.

Please note that the translated version closely follows the structure of the Java code and uses recursion, just like in the original code. The usage of `float('inf')` and `float('-inf')` replaces `Long.MAX_VALUE` and `Long.MIN_VALUE`, respectively, to represent positive and negative infinity in Python.
