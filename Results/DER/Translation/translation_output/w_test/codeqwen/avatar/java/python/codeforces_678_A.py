Here is the Python equivalent of the Java code:

```python
def main():
    n, k = map(int, input().split())
    print((n // k + 1) * k)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, divides the first by the second, rounds up to the nearest whole number, and then multiplies the result by the second integer. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java. The `map` function is used to convert the input strings to integers. The `if __name__ == "__main__":` block is used to call the `main` function when the script is run directly.
