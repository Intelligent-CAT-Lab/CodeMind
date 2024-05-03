Here is the Python equivalent of the Java code:

```python
import sys

for i in range(3):
    print(sys.stdin.readline().strip().upper()[0], end='')
print()
```

This Python code does the same thing as the Java code: it reads three lines of input from the user, converts the first character of each line to uppercase, and prints them out. The `sys.stdin.readline()` function reads a line of input from the user, and the `strip()` function removes any leading or trailing whitespace from the line. The `upper()` function converts all the characters in the line to uppercase. The `[0]` indexing operation extracts the first character of the line. The `end=''` argument to the `print()` function prevents it from adding a newline character after each character. Finally, the `print()` function with no arguments is used to print a newline character after all the characters have been printed.
