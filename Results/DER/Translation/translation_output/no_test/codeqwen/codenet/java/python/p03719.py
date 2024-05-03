Here is the Python equivalent of your Java code:

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

This Python code does the same thing as your Java code. It reads three integers from the user, checks if the third integer is between the first and second integers, and prints "Yes" if it is, and "No" otherwise.
