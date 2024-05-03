Here is the Python equivalent of the Java code:

```python
import sys

def solve(a, b):
    return max(max(a + b, a - b), a * b)

def main():
    a, b = map(int, sys.stdin.readline().split())
    print(solve(a, b))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the maximum of the sum, difference, and product of the two integers, and then prints the result. The `main` function is the entry point of the program, and it calls the `solve` function with the input integers. The `solve` function takes two integers as input and returns the maximum of the sum, difference, and product of the two integers. The `map` function is used to convert the input string to a list of integers. The `sys.stdin.readline()` function is used to read a line of input from the standard input. The `split()` function is used to split the input string into a list of words, and the `int()` function is used to convert each word to an integer. The `max` function is used to find the maximum value in a list.
