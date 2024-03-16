Here's the equivalent Python code. In Python, we can take advantage of the built-in functions `input()` to read from the standard input and `print()` to write to the standard output, so the class `FastScanner` is not needed.

```python
def main():
    input_value = int(input())
    ans = 1
    while input_value >= ans * 2:
        ans *= 2
    print(ans)

if __name__ == "__main__":
    main()
```

This code snippet reads an integer from the input, calculates the greatest power of 2 less than or equal to the input value, and prints it to the standard output, just like the provided Java code. The Python `input()` method reads a line from the input, converts it to an integer, and the loop computes the desired value in a similar manner to the `while` loop in the Java code.
