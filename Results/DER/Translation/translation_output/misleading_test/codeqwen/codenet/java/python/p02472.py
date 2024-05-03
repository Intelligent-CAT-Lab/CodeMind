Here is the Python equivalent of the Java code:

```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    print(-(a + b))

if __name__ == "__main__":
    main()
```

This Python code reads two integers from the standard input, adds them together, and then prints the negative of the sum. The `map` function is used to convert the input strings to integers. The `sys.stdin.readline()` function is used to read a line of input from the standard input. The `split()` function is used to split the input line into a list of strings, and the `map` function is used to convert each string in the list to an integer. The `print` function is used to print the negative of the sum of the two integers.
