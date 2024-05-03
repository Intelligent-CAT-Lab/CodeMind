Here is the Python equivalent of the Java code:

```python
import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

print(b % a == 0 and a + b or b - a)
```

In Python, we use the `sys.stdin.readline()` function to read a line of input from the standard input (usually the keyboard). The `int()` function is used to convert the input string to an integer. The `and` operator is used to perform the conditional expression. If the remainder of `b` divided by `a` is 0, then `a + b` is printed; otherwise, `b - a` is printed.
