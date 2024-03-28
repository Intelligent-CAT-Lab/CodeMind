Here's the equivalent Python code using the `sys` library for reading input and the built-in `int` type for large integers (which in Python handles arbitrary precision like Java's BigInteger):

```python
import sys

# Read integers from input
a, b = map(int, sys.stdin.readline().split())

# Subtracting b from a
result = a - b

# Printing the result
print(result)
```

This code reads a line from the standard input, splits it into two integers `a` and `b`, performs the subtraction, and prints the result.

If you're running this in a script, make sure you're providing the input correctly. For example, if you're running it from a command line you might do:

```bash
echo "5 8" | python your_script.py
```

This will simulate the "5 8" input as if it was entered by the user. If you're using an IDE, there might be a different way to provide the input to the script.

Remember that this script expects the input to be provided in the same way as the Java version, with each number separated by a space and no additional input after the two numbers.
