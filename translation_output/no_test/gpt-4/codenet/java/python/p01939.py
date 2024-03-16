Below is the translated Java code into Python:

```python
def main():
    MOD = 1000000007

    first_N = int(input())
    first_M = int(input())

    if first_N == 1:
        print((first_M + 1) % MOD)
    else:
        if (first_M + 1) % (first_N - 1) == 0:
            first_limit = (first_M + 1) // (first_N - 1) - 1
        else:
            first_limit = (first_M + 1) // (first_N - 1)

        if first_limit <= 0:
            print((first_M + 1) % MOD)
        else:
            A = (first_M + 1) % MOD
            B = (2 * (first_M + 1) * first_limit) % MOD
            C = ((first_N - 1) * first_limit * (first_limit + 1)) % MOD
            result = (A + B - C) % MOD
            print(result)

if __name__ == "__main__":
    main()
```

Please note that in Python, when dealing with large integer arithmetic, we do not need to use a special `BigInteger` class as in Java. Python natively handles arbitrary-precision integers which can grow to the limits of available memory. You may also observe that integer division `//` replaces the `/` operator that is used for floating-point division in Python. Additionally, since Python's `print` is a function, it uses parentheses (unlike Java's `System.out.println`).
