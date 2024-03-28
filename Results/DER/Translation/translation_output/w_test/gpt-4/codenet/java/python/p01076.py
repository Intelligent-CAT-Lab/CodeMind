Here's the Java code translated into Python:

```python
def solve(N, d):
    if d == 1:
        return N * (N - 1) // 2
    elif d == 2:
        return N * (N - 1) // 2 - 1
    else:
        m = N - d
        ans = m * (m - 1) // 2 + 2 * m + (d - 2)
        return ans

# Sample test input:
N, d = map(int, input().split())

# Expected output:
print(solve(N, d))
```

This Python code provides the same functionality as the Java code, but does not include the equivalent of the `FastScanner` class from Java, as Python has built-in functions to handle input parsing (`input()` and `split()`).

The sample test case should be provided as input through the command-line while running the Python code. For the given example:

Test input (passed through `stdin`):
```
4 3
```

Expected output (printed to `stdout`):
```
3
```
