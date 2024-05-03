Here is the Python equivalent of the Java code:

```python
import sys

M = int(sys.stdin.readline())
rD = int(sys.stdin.readline())
rR = int(sys.stdin.readline())
cD = int(sys.stdin.readline())
cR = int(sys.stdin.readline())

def solve():
    max_ = -1
    D0 = (100 * cD + rD - 1) // rD
    C0 = (100 * cR + rR - 1) // rR
    for i in range(100):
        for j in range(100):
            changeD = D0 + i
            changeR = C0 + j
            jpn = M - changeD - changeR
            if jpn < 0:
                continue
            remD = changeD * rD // 100 - cD
            remR = changeR * rR // 100 - cR
            jpn += remD * 100 // rD + remR * 100 // rR
            max_ = max(max_, jpn)
    print(max_)

solve()
```

This Python code does the same thing as the Java code. It reads the input from the standard input, solves the problem, and prints the result. The `solve` function is the same as the `solve` method in the Java code. The `max_` variable is used to keep track of the maximum value found so far. The `max` function is used to update `max_` if a larger value is found. The `print` function is used to print the result.
