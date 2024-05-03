Here is the Python equivalent of the Java code:

```python
import sys

def main():
    A = int(sys.stdin.readline())
    B = int(sys.stdin.readline())
    print(A * B)

if __name__ == "__main__":
    main()
```

This Python code reads two integers from the standard input, multiplies them, and prints the result. The `sys.stdin.readline()` function is used to read a line of text from the standard input, and `int()` is used to convert the text to an integer. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
