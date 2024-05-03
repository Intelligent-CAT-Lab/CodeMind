Here is the Python equivalent of the Java code you provided:

```python
import sys

def solve_abc178_b():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    c = int(sys.stdin.readline())
    d = int(sys.stdin.readline())

    ans = a * c
    ans = max(ans, a * d)
    ans = max(ans, b * c)
    ans = max(ans, b * d)

    print(ans)

solve_abc178_b()
```

This Python code reads the input from the standard input (stdin) and performs the same operations as the Java code. It calculates the maximum product of any two numbers from the input and prints the result.
