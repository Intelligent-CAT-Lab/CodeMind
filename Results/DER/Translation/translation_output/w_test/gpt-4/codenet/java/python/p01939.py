Here is the equivalent Python script for the provided Java code:

```python
def main():
    MOD = 1000000007

    first_N, first_M = map(int, input().split())

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
            A = (first_M + 1)
            B = 2 * (first_M + 1) * first_limit
            C = (first_N - 1) * first_limit * (first_limit + 1)
            result = (A + B - C) % MOD
            print(result)

if __name__ == "__main__":
    main()
```

Note that in Python, the `long` type is not explicitly used, as integers (`int`) in Python can be of arbitrary size. The `BigInteger` type from Java is not present in Python due to this feature of Python's `int` type. The division and modulo operations are also more straightforward, and we can perform calculations without the need to cast to BigInteger as is required in Java.

You can run the provided test case to verify the output:

Test input:
```
3 9
```

Expected output:
```
50
```
