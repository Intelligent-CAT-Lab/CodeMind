Here is the Python equivalent of the Java code:

```python
def main():
    try:
        a, b = map(int, input().split())
        print("Brown" if abs(a - b) <= 1 else "Alice")
    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the absolute difference between them, and prints "Brown" if the difference is less than or equal to 1, otherwise it prints "Alice". The `try-except` block is used to catch any exceptions that may occur during the execution of the code.
