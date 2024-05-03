Here is the Python equivalent of the Java code:

```python
import sys

def solve(r):
    print(r * r)

def main():
    test_cases = int(sys.stdin.readline())
    for _ in range(test_cases):
        r = int(sys.stdin.readline())
        solve(r)

if __name__ == "__main__":
    main()
```

This Python code reads the input from the standard input, processes it, and writes the output to the standard output. It uses a function `solve` to calculate the square of the radius and print it. The `main` function reads the number of test cases and calls `solve` for each test case.
