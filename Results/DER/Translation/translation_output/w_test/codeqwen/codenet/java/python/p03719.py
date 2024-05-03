Here is the Python equivalent of the Java code:

```python
def main():
    a = int(input())
    b = int(input())
    c = int(input())

    result = "No"
    if a <= c and c <= b:
        result = "Yes"

    print(result)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads three integers from the user, checks if the third integer is between the first and second integers, and prints "Yes" if it is, and "No" otherwise.
