Certainly! Here is the equivalent code in Python:

```python
N = int(input())
M = int(input())
sum = 0

if N * 2 > M:
    sum = M // 2
elif M > N * 2:
    sum = N
    sum += (M - N * 2) // 4

print(sum)
```

A couple of notes about the differences between the Java code and the Python code:

1. In Python, we don't typically need to import utilities for standard input and output;
2. In Python, the `long` data type does not exist as a separate type. Integers (`int`) have arbitrary precision;
3. Python uses `//` for integer division (discarding the fractional part) to mirror the behavior of `/` operator in Java when used with integer types;
4. Python does not require declaration of variable types, thus `N` and `M` are directly assigned with the results of `input()` functions, which should be converted to integers (`int`) as the `input()` function returns a string by default;
5. The `if...elif...else` structure in Python is similar to `if...else if...else` in Java;
6. In Python, we use `print()` for output instead of `System.out.println()`.
