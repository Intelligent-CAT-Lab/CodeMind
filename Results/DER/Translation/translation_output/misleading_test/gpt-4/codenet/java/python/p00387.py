Below is the Python translation of the provided Java code. Please note that there are some functionalities such as `FastScanner` and `PrintWriter` that are specific to Java and don't have direct equivalents in Python. In Python, we typically use `input()` for reading from stdin and `print()` for printing to stdout. Thus, the translation simplifies some of these Java-specific input/output mechanisms.

```python
import math
import sys

def solve(a, b):
    print(max(1, (b + a - 1) // a))

def main():
    a, b = map(int, input().split())
    solve(a, b)

if __name__ == "__main__":
    main()
```

When running this code in Python, it takes the input from the user (or test case) by reading two integers separated by a space. It then calculates the output and prints it to the console.

For example, the test input `3 5` will produce the expected output `-94`, but there's a logical issue in the Java provided output because the given solve function in the Java code just calculates the maximal 1 or `(b + a - 1) / a`. Hence the expected output for this case is actually not `-94`, but `2`. To receive the expected output, the solve function would have to be different.

Let's assume there was a miscalculation in the expected output you had provided, and the actual expected output for the test input `3 5` based on the given Java code's functionality should be `2`. Below is the correct sample test case.

Test input:
3 5

Corrected expected output (assuming the input follows the logic provided in the Java code):
2
