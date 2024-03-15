Here's the equivalent Python code for the Java code you provided:

```python
# Import the sys module to take input from the standard input
import sys

# Read input, assuming it comes from the standard input (like System.in in Java)
input_lines = sys.stdin.readlines()

# The input is expected to be two lines with one integer each
T = int(input_lines[0])
X = int(input_lines[1])

# Calculate the division result
a = T / X

# Print the result
print(a)
```

Please note that in Python you don't need to explicitly set up a scanner as you do in Java. Instead, you can read from `sys.stdin`, which is similar to `System.in` in Java.

Keep in mind that this Python code assumes that the input is being provided through standard input (similar to how `Scanner` works in Java), and the input consists of two lines, each containing an integer. If your input comes from a different source, you will need to adjust the code accordingly.
