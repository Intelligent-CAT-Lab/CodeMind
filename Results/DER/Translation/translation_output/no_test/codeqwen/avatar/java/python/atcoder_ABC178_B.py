Here is the Python equivalent of the Java code:

```python
import sys

a, b, c, d = map(int, sys.stdin.readline().split())

print(max(max(max(a * c, b * d), a * d), b * c))
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, multiplies them in all possible ways, and prints the maximum result. The `map` function is used to convert the input strings to integers, and `sys.stdin.readline().split()` is used to read the input. The `max` function is used to find the maximum value among the four possible products.
