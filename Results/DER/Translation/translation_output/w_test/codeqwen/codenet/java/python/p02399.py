Here is the Python equivalent of the Java code:

```python
def main():
    a, b = map(int, input().split())
    d = a // b
    r = a % b
    f = "{:.5f}".format(1.0 * a / b)
    print(d, r, f)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, performs integer division and modulo operations, and then prints the results in the same format as the Java code.
