Here is the Python equivalent of the Java code:

```python
import sys
import math

def main():
    n, m = map(int, sys.stdin.readline().split())
    for i in range(m - (n % m)):
        print(int(n / m), end=" ")
    for i in range(m - (n % m), m):
        print(int(math.ceil(n / m)), end=" ")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the number of times the first integer can be divided by the second integer without a remainder, and then prints that number of times the first integer divided by the second integer, followed by the number of times the first integer divided by the second integer rounded up to the nearest integer. The `end=" "` argument in the `print` function is used to print the numbers on the same line separated by spaces instead of on separate lines.
