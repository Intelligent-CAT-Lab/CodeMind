Here is the Python equivalent of the Java code:

```python
a, b = map(int, input().split())
n = b - a
print(n * (n + 1) // 2 - b)
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the difference between them, and then uses this difference to calculate the sum of all integers from 1 to `b` (inclusive) and subtracts `b` from it. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java.
