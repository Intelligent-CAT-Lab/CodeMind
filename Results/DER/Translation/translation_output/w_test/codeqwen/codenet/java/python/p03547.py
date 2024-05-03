Here is the Python equivalent of the Java code:

```python
import sys

MOD = 10**9 + 7

def solve():
    X = input()[0]
    Y = input()[0]
    ans = "="
    if X < Y:
        ans = "<"
    elif X > Y:
        ans = ">"
    print(ans)

solve()
```

This Python code does the same thing as the Java code. It reads two characters from the standard input, compares them, and prints "<", ">", or "=" depending on the result. The `input()` function in Python reads a line from the standard input, and the `[0]` indexing operation gets the first character of the line. The `print()` function in Python prints a value to the standard output.
