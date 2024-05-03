Here is the Python equivalent of the Java code:

```python
import sys

MOD = 10**9 + 7

def solve():
    X = ord(input().strip()[0])
    Y = ord(input().strip()[0])
    ans = "="
    if X - Y < 0:
        ans = "<"
    elif X - Y > 0:
        ans = ">"
    print(ans)

solve()
```

This Python code does the same thing as the Java code. It reads two characters from the input, converts them to their ASCII values, and then compares them. The result is printed to the console.
