Here is the Python equivalent of the Java code:

```python
import math

def solve(r):
    pi = math.pi
    return 2 * pi * r

def main():
    t = 1
    while t > 0:
        r = float(input())
        print(solve(r))
        t -= 1

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a single floating-point number from the standard input, calculates the circumference of a circle using the formula `2 * pi * r`, and prints the result. The `main` function is the entry point of the program, and it calls the `solve` function in a loop `t` times, where `t` is initially set to 1. The `solve` function takes a floating-point number `r` as input, calculates the circumference using the formula `2 * pi * r`, and returns the result. The `main` function reads the number of test cases from the standard input, and then calls the `solve` function for each test case.
