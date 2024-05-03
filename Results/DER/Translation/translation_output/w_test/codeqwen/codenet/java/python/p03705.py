Here is the Python equivalent of the Java code:

```python
def main():
    n = int(input())
    a = int(input())
    b = int(input())

    if a > b or (n == 1 and a != b):
        print(0)
        return
    if a == b:
        print(1)
        return

    print((n - 2) * (b - a) + 1)


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, checks if the conditions are met, and then prints the result.
