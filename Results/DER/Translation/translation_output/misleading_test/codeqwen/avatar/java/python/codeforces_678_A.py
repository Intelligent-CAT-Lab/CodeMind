Here is the Python equivalent of the Java code:

```python
def main():
    n, k = map(int, input().split())
    print((n // k + 1) * k)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, divides the first by the second, adds 1 to the result, and then multiplies the result by the second integer. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
