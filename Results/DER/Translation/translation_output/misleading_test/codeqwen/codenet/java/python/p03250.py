Here is the Python equivalent of the Java code:

```python
def main():
    a, b, c = map(int, input().split())
    StringA = str(a)
    StringB = str(b)
    StringC = str(c)

    if a >= b and a >= c:
        if b >= c:
            print(int(StringA + StringB) + c)
        else:
            print(int(StringA + StringC) + b)
    elif b >= a and b >= c:
        if a >= c:
            print(int(StringB + StringA) + c)
        else:
            print(int(StringB + StringC) + a)
    else:
        if a >= b:
            print(int(StringC + StringA) + b)
        else:
            print(int(StringC + StringB) + a)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, converts them to strings, and then checks which of the three integers is the largest. It then concatenates the two largest integers with the third integer and adds the third integer to the result. The result is then printed to the console.
