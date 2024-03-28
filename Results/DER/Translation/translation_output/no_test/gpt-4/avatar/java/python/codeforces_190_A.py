Here is the Python translation of the given Java code:

```python
def codeforces_190_A():
    n, m = map(int, input().split())

    if n == 0:
        if m != 0:
            print("Impossible")
        else:
            print("0 0")
        return

    if m <= n:
        if m == 0:
            m = 1
        print(f"{n} {m + n - 1}")
        return

    print(f"{m} {m + n - 1}")

codeforces_190_A()
```

I've translated the Java code into a Python function `codeforces_190_A` which can be called to execute the logic contained in the `main` method. The input is read using Python's `input()` function combined with `map` to unpack the entered values into the `n` and `m` variables. The print statements are updated to use Python's `print` function, with formatted string literals (f-strings) for easier variable inclusion in the output strings. The `return` statements are kept to exit the function early, similar to how the original Java code returns from the `main` method.
