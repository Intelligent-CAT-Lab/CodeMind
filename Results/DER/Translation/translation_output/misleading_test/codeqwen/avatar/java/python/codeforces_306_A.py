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

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the division and modulo of these integers, and then prints the results. The `end=" "` argument in the `print` function is used to print the numbers on the same line separated by spaces.
