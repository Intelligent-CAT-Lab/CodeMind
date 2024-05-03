Here is the Python equivalent of the Java code:

```python
def main():
    H = int(input())
    A = int(input())
    B = int(input())

    ans = 0

    for i in range(A, B+1):
        if H % i == 0:
            ans += 1

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the number of divisors of the first integer that are also divisors of the second and third integers, and prints the result.
