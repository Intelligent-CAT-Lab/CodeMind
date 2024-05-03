Here is the Python equivalent of the Java code:

```python
def main():
    o, n, g = map(int, input().split())
    x = 0
    borrow = 0

    for i in range(1, g+1):
        x += i * o

    borrow = x - n

    if borrow <= 0:
        print(0)
    else:
        print(borrow)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the total value of the sequence, and then subtracts the given number from it. If the result is less than or equal to zero, it prints 0, otherwise it prints the result.
