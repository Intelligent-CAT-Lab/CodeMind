Here is the translated Python code:

```python
import sys

INF = 1 << 30
MOD = 1000000007

def power(a, b, mod):
    result = 1
    while b > 0:
        if b % 2:
            result = (result * a) % mod
        a = (a * a) % mod
        b //= 2
    return result

def solve():
    m, n = map(int, input().split())
    print(power(m, n, MOD))

if __name__ == "__main__":
    solve()
```

To run a test case similar to the one provided, simply call the `solve` function with appropriate standard input. For command line use, you would execute the script and provide the input `2 3` followed by pressing enter. The printed output should be `8`, matching the expected output. Note that the functionality related to the `InputReader` class is replaced by the simpler built-in `input` function for reading from standard input in Python.
