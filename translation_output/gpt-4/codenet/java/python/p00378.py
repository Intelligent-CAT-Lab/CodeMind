Here's the translated Python code:

```python
class P00378:
    def solve(self):
        A = int(input())
        B = int(input())
        X = int(input())

        if X % 500 != 0:
            X += 500 - X % 500
        a = 0
        b = 0

        if A < B:
            a = X // 1000 + (1 if X % 1000 > 0 else 0)
        elif A > 2 * B:
            b = X // 500
        else:
            a = X // 1000
            X %= 1000
            b = X // 500

        print(A * a + B * b)

if __name__ == "__main__":
    P00378().solve()
```

A few notes on the translation:
- In Python, the `int(input())` function is used to read an integer from the standard input.
- Python uses `//` for integer division to replace Java's `/` when used with integers, ensuring the result is an integer.
- The conditional operator `(condition) ? value_if_true : value_if_false` in Java is replaced with `value_if_true if condition else value_if_false` in Python.
- Python's `print` function is used to output the result.
