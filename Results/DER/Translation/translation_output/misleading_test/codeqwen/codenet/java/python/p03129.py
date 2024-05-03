Here is the Python equivalent of the Java code:

```python
def main():
    a, b = map(int, input().split())
    if (a + 1) // 2 >= b:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the result of the expression `(a + 1) // 2`, and compares it to the second integer. If the result is greater than or equal to the second integer, it prints "YES", otherwise it prints "NO". The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
