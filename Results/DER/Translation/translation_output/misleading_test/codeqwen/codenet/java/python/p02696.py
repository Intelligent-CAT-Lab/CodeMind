Here is the Python equivalent of the Java code:

```python
def main():
    a, b, n = map(int, input().split())
    if n >= b:
        print(a * (b - 1) // b)
    else:
        print(a * n // b)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, and then checks if the third integer is greater than or equal to the second integer. If it is, it prints the result of the expression `a * (b - 1) // b`. If it isn't, it prints the result of the expression `a * n // b`. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java.
