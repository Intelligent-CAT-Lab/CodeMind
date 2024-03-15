Here is the translated code in Python:

```python
def main():
    K = int(input())
    A = int(input())
    B = int(input())

    sum = 1 + K
    if A < B:
        sum1 = 1
        if A > sum1:
            K -= (A - sum1)
            sum1 = A
        sum1 += (B - A) * (K // 2)
        if K % 2 == 1:
            sum1 += 1
        sum = max(sum, sum1)
    print(sum)

if __name__ == '__main__':
    main()
```

Please note a couple of things:
- In Python, we don't need to import a scanner to read from standard input; we use the built-in `input()` function for reading strings, and then cast the result to an integer using `int()`.
- The `//` operator in Python performs floor division, similar to `/` in Java with integer operands.
- The `max()` function is used to get the maximum value instead of `Math.max()` which is used in Java.
- There are no type declarations in Python, and the variable names are typically lower_case_with_underscores rather than CamelCase.
