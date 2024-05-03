Here is the Python equivalent of the Java code:

```python
def main():
    o, g, x = 0, 0, 0
    n, borrow = 0, 0

    o = int(input())
    n = int(input())
    g = int(input())

    for i in range(1, g+1):
        x = x + i * o

    borrow = x - n

    if borrow <= 0:
        print(0)
    else:
        print(borrow)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the total value of the sequence, and then subtracts the input number from it. If the result is less than or equal to zero, it prints 0. Otherwise, it prints the result.
