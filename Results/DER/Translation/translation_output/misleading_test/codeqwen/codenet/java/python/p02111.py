Here is the Python equivalent of the Java code:

```python
import sys

n = int(sys.stdin.readline())
minute = 12 * 60 * n / 360
print((minute // 60) + " " + (minute % 60))
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the equivalent minutes, and then prints the result. The `//` operator is used for integer division in Python, which is equivalent to the `/` operator in Java for integer division.
