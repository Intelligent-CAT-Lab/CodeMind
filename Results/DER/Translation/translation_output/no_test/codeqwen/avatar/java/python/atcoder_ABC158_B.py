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
    solver = atcoder_ABC158_B()
    solver.run()
```

This Python code does the same thing as the Java code. It reads three integers N, A, and B from the standard input, calculates the base and mod, and then prints the result. The `//` operator is used for integer division in Python, and the `%` operator is used for modulus in Python. The `if` statement is used to check if the mod is greater than or equal to A, and if so, it sets mod to A. The `print` function is used to output the result.
