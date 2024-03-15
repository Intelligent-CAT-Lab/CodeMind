Here is the translated code from Java to Python:

```python
def solve():
    N = int(input())
    A = int(input())
    B = int(input())
    C = int(input())
    D = int(input())

    for i in range(N):
        max_val = D * (N - 1 - i) - C * i
        min_val = C * (N - 1 - i) - D * i
        if abs(B - A) >= min_val and abs(B - A) <= max_val:
            print("YES")
            return

    print("NO")

if __name__ == "__main__":
    solve()
```

A few points to note:
- In Python, we don't need a class structure for simple scripts.
- Instead of creating an instance of the class to call the solve method as done in Java, we simply define a function and call it inside an `if __name__ == "__main__":` block.
- System input is typically read using the `input()` function in Python.
- Type casting is done by calling the desired type as a function (like `int()`, `long()` in Python 2, but in Python 3, just `int()`, as `long` type is not explicitly needed).
- Instead of `System.out.println`, we use `print()` for output.
- Python uses indentation for block statements instead of `{}`.
- The for loop syntax is different; we use `range` to generate a sequence of numbers.
