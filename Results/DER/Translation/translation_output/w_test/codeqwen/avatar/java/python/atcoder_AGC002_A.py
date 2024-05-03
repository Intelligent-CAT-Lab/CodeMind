Here is the Python equivalent of the Java code:

```python
def main():
    a = int(input())
    b = int(input())

    if a <= 0 and b >= 0 or a <= 0 and b >= 0:
        print("Zero")
    elif a < 0 and b < 0:
        print("Positive" if (b - a + 1) % 2 == 0 else "Negative")
    elif a > 0 and b > 0:
        print("Positive")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, checks the conditions, and prints the appropriate output. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
