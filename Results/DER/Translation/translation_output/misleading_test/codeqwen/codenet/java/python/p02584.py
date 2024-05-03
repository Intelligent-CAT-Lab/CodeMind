Here is the Python equivalent of the Java code:

```python
def main():
    x, k, d = map(int, input().split())

    ans = 0
    abs_x = abs(x)
    if abs_x // d >= k:
        ans = abs_x - k * d
    else:
        sho = abs_x // d
        amari = abs_x % d
        if (k - sho) % 2 == 0:
            ans = amari
        else:
            ans = d - amari

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the answer, and prints it to the standard output. The `map` function is used to convert the input strings to integers. The `//` operator is used for integer division, which is equivalent to `/` in Java. The `%` operator is used for the modulo operation. The `abs` function is used to get the absolute value of a number. The `if` and `else` statements are used to determine the value of `ans`.
