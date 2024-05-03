Here is the Python equivalent of the Java code:

```python
import sys

def main():
    N, M = map(int, sys.stdin.readline().split())
    print(N * M)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads two integers from the standard input, multiplies them, and prints the result. The `map` function is used to convert the input strings to integers. The `sys.stdin.readline()` function reads a line from the standard input, and the `split()` function splits the line into a list of strings, which are then converted to integers using the `map` function. The `print` function is used to print the result. The `if __name__ == "__main__":` block ensures that the `main` function is called when the script is run directly.
