Here is the Python equivalent of the Java code:

```python
def main():
    a, b, c = map(int, input().split())
    result = "No"
    if a <= c <= b:
        result = "Yes"
    print(result)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, checks if the second integer is between the first and third integers, and prints "Yes" if it is, and "No" otherwise.
