Here is the Python equivalent of the Java code you provided:

```python
import sys

def count(pnum):
    result = 0
    for i in range(31):
        if (2 ** i) <= pnum:
            result = 2 ** i
    return result

def run():
    pnum = int(sys.stdin.readline().strip())
    print(count(pnum))

if __name__ == "__main__":
    run()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the highest power of 2 less than or equal to the input number, and prints the result. The `sys.stdin.readline().strip()` function is used to read a line of input from the standard input, and `.strip()` is used to remove any leading or trailing whitespace from the input. The `if __name__ == "__main__":` block is used to ensure that the `run()` function is called when the script is run directly, rather than when it is imported as a module.
