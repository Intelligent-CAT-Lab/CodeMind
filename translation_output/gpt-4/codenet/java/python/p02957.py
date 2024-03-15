Here's the code translated from Java to Python:

```python
def main():
    a, b = map(int, input().split())
    k = a + b
    if k % 2 == 0:
        print(k // 2)
    else:
        print("IMPOSSIBLE")

if __name__ == "__main__":
    main()
```

This Python code performs the same operation as the Java code; it reads two integers `a` and `b`, calculates their sum `k`, then checks if `k` is even. If it is, the code prints the integer division of `k` by 2; otherwise, it prints "IMPOSSIBLE". Note that in Python, we typically use `//` for integer division to get an integer result, as opposed to `/`, which would give a float result even if the operands are evenly divisible.
