Here is the Python equivalent of the Java code:

```python
def main():
    s = int(input())
    a = 1000000000
    print("0 0", a, "1", (a - s % a) % a, (s - 1) // a + 1)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, calculates the values for the output, and prints them. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java.
