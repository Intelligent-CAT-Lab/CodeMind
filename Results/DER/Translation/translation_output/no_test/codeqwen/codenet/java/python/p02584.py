Here is the Python equivalent of the Java code:

```python
def main():
    x = int(input())
    k = int(input())
    d = int(input())

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

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the answer, and prints it. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java. The `%` operator is used for the modulo operation, which is equivalent to `%` in Java. The `abs()` function is used to get the absolute value of a number, which is equivalent to `Math.abs()` in Java. The `if` and `else` statements are used to perform different actions depending on the value of a condition.
