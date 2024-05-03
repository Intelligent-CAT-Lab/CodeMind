Here is the Python equivalent of the Java code:

```python
import sys

def main():
    str = sys.stdin.readline().strip()
    A = int(str)
    str = sys.stdin.readline().strip()
    B = int(str)
    print(A * B)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads two integers from the standard input, multiplies them, and prints the result. The `sys.stdin.readline().strip()` function is used to read a line of input from the standard input, and the `int()` function is used to convert the string to an integer. The `print()` function is used to print the result. The `if __name__ == "__main__":` block is used to ensure that the `main()` function is called when the script is run directly.
