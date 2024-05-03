Here is the Python equivalent of the Java code:

```python
class atcoder_ABC158_B:
    def run(self):
        N = int(input())
        A = int(input())
        B = int(input())
        base = N // (A + B)
        mod = N % (A + B)
        if mod >= A:
            mod = A
        print(base * A + mod)
        return

if __name__ == "__main__":
    atcoder_ABC158_B().run()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the base and modulus, and then prints the result. The `//` operator is used for integer division in Python, and the `%` operator is used for modulus. The `if` statement checks if the modulus is greater than or equal to `A`, and if so, sets `mod` to `A`. The `print` statement prints the result.
