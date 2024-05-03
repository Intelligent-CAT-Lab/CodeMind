Here is the Python equivalent of the Java code:

```python
import sys

s = int(sys.stdin.readline())
a = 1000000000
print("0 0", a, "1", (a - s % a) % a, (s - 1) // a + 1)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the remainder when divided by 1,000,000,000, and then prints out the results in the same format as the Java code.
