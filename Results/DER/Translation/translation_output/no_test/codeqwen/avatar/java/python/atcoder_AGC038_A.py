Here is the Python equivalent of the Java code:

```python
import sys

h, w, a, b = map(int, sys.stdin.readline().split())
sb = ""

for i in range(h):
    for j in range(w):
        x = 1 if (j < a) ^ (i < b) else 0
        sb += str(x)
    sb += "\n"

print(sb, end="")
```

This Python code does the same thing as the Java code. It reads the input from the standard input, processes it, and writes the output to the standard output. The `map` function is used to convert the input strings to integers. The `sys.stdin.readline()` function reads a line from the standard input, and the `split()` function splits it into a list of strings. The `range` function is used to generate a sequence of numbers from 0 to `h-1` and `0` to `w-1`. The `if` statement checks whether `j < a` and `i < b` are different, and if so, it sets `x` to 1; otherwise, it sets `x` to 0. The `sb` string is appended with the string representation of `x`, and a newline character is appended after each row. Finally, the `print` function is used to write the `sb` string to the standard output. The `end=""` argument is used to prevent the newline character from being added to the end of the output.
