Here is the equivalent Python code for the provided Java code:

```python
# No need to import Scanner, Python has built-in input function.

def main():
    N = int(input())
    A = int(input())
    B = int(input())
    print(str(min(A, B)) + " " + str(max(0, A + B - N)))

if __name__ == "__main__":
    main()
```

This Python code assumes that the inputs will be provided in the same way as the Java code, with one input per line. The `input()` function reads a line from input, converts it to a string by default, and `int()` is used to cast the string to an integer. In Python, printing to the console can be done using the `print` function.
