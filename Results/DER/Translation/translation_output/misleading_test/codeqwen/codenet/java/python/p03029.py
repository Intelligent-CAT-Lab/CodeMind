Here is the Python equivalent of the Java code:

```python
def main():
    try:
        A, P = map(int, input().split())
        print((P + 3 * A) // 2)
    except Exception as e:
        print("Exception :", e)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the result, and prints it. The `map` function is used to convert the input strings to integers. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java. The `try-except` block is used to catch any exceptions that may occur during the execution of the code.
