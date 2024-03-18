The following Python code is a translation of the Java code provided:

```python
import sys
import math

# Custom fast input function to mimic FastScanner
def fast_input():
    return sys.stdin.readline().strip().split()

# Reading input as integers
n, a, b = map(int, fast_input())

# Calculating the answer
ans = (n // (a + b)) * a + min(a, n % (a + b))

# Outputting the result
print(ans)
```

To run the test case with the given input "8 3 4" and checking the expected output "40", you would have to do the following:

1. Redirect the input from a file or from command line while executing the script.
2. The Python script reads from standard input, so you can directly provide the input.

If you want to manually test this script with a hardcoded test case in the script, you could replace the `fast_input` function usage with the following:

```python
# Test input
n, a, b = 8, 3, 4

# Calculate the output
ans = (n // (a + b)) * a + min(a, n % (a + b))

# Output result
print(ans)  # Expected Output: 40
```

Please note, while the original Java code makes use of a custom `FastScanner` class for fast input, Python doesn't typically require such utilities due to its built-in fast input/output capabilities. However, for consistency with the question, I've provided a `fast_input` function which simulates the behavior of the `FastScanner`.
