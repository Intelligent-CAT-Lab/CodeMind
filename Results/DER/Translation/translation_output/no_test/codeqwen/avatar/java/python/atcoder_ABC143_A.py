Here is the Python equivalent of the Java code:

```python
import sys

def main():
    A = int(sys.stdin.readline())
    B = int(sys.stdin.readline())
    if A - (B * 2) > 0:
        print(A - (B * 2))

if __name__ == "__main__":
    main()
```

In Python, we use `sys.stdin.readline()` to read a line of input from the standard input (usually the keyboard). We then convert the input to an integer using `int()`. The `if` statement works the same way as in Java. The `print()` function is used to output the result. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
