Here is the Python equivalent of the given Java code:

```python
import math
import sys
import io
import atexit

def solve():
    n = int(input())
    K = int(input()) - 1
    sins = [math.sin(2 * math.pi * i / n) / 2 for i in range(n + 1)]
    
    low, high = 0, 2 * math.pi
    for rep in range(50):
        h = (low + high) / 2
        if count(h, n, sins) <= K:
            low = h
        else:
            high = h
    print("{:.14f}".format(high))

def count(h, n, sins):
    ret = 0
    for len in range(1, n):
        low, high = 0, (n - len) // 2 + 1
        while high - low > 1:
            q = (high + low) // 2
            if S(len, q, n - len - q, sins) <= h:
                low = q
            else:
                high = q
        ret += low * 2
        if low == (n - len) // 2 and (n - len) % 2 == 0:
            ret -= 1
    assert ret * n % 3 == 0
    return ret * n // 3

def S(a, b, c, sins):
    return sins[a] + sins[b] + sins[c]
    
# Test case
sys.stdin = io.StringIO('4\n3\n')
solve()
```

You'll notice that in the Python code, I've used `input()` for reading from stdin and `print()` for outputting, which are the Python built-in functions for these tasks. In the test case, I've redirected the standard input to simulate input being passed as '4\n3\n', similar to how the INPUT variable is used in Java. This allows you to run the function `solve()` just like the Java main method is being run.

Please make sure to remove the line `sys.stdin = io.StringIO('4\n3\n')` if you're planning to use this code in a production environment, as it purely serves as an example of how you might run the `solve()` function with test input.
