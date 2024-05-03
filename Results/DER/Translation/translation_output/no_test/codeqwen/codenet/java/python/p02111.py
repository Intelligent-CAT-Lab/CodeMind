Here is the Python equivalent of the Java code:

```python
import sys

n = int(sys.stdin.readline())
minute = 12 * 60 * n / 360
print((minute // 60) + " " + str(minute % 60))
```

In this Python code, we use `sys.stdin.readline()` to read the input from the standard input (usually the keyboard). The `int()` function is used to convert the input string to an integer. The `//` operator is used for integer division, which gives the quotient without the remainder. The `%` operator is used for the remainder of the division. The `print()` function is used to output the result.
