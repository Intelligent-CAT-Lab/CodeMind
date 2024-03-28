Here's the translated Python code:

```python
import math

def solve():
    n = int(input())
    print(totient(n))

def totient(n):
    phi = n
    p = 2
    while p * p <= n:
        if n % p == 0:
            while n % p == 0:
                n //= p
            phi -= phi // p
        p += 1 if p == 2 else 2  # After 2, consider only odd numbers
    if n > 1:
        phi -= phi // n
    return phi

if __name__ == '__main__':
    solve()
```

Test input:
```txt
6
```

Expected output:
```
2
```

To run the test, execute the function `solve()` with input redirection or by copy-pasting the input into the method `input()`.

This Python code omits file and output handling (like `Scanner`, `Printer`, `InputStream`, `Closeable`, etc.) present in the Java code, since Python's input/output handling is typically more straightforward for such simple cases. The `totient` function is simplified using a common algorithm to calculate Euler's Totient function.
