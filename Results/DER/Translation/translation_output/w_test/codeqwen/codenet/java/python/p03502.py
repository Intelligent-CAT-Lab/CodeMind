Here is the Python equivalent of the Java code:

```python
def main():
    N = int(input())

    X = N

    fx = 0

    while N >= 10:
        fx += N % 10
        N //= 10

    fx += N

    if X % fx == 0:
        print("Yes")
    else:
        print("No")


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, calculates the sum of its digits, and checks if the original number is divisible by this sum. If it is, it prints "Yes", otherwise it prints "No".
